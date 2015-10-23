package com.common.base;

import java.io.ByteArrayInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;
import org.dom4j.tree.DefaultElement;
import org.xml.sax.SAXException;

/**
 * 调用dom4j包解析xml文件
 * 
 * @author bobo
 * 
 */
public class XMLHelper {

	final private static Log log = LogFactory.getLog(XMLHelper.class);

	/**
	 * 根据xml文件的相对路径获取doc对象
	 * 
	 * @param xmlPath
	 * @return
	 */
	public static Document readXML(String xmlPath) {
		Document doc = null;
		SAXReader saxReader = new SAXReader();
		InputStream ins = XMLHelper.class.getResourceAsStream(xmlPath);
		try {
			doc = saxReader.read(ins);
		} catch (DocumentException e) {
			e.printStackTrace();
		}
		return doc;
	}

	/**
	 * 将xml字符串转换为doc对象
	 * 
	 * @param xmlString
	 * @return
	 */
	public static Document readXMLContentString(String xmlString) {
		Document doc = null;
		try {
			doc = DocumentHelper.parseText(xmlString);
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return doc;
	}

	/**
	 * 测试写xml对象到文件
	 * 
	 * @param fileName
	 * @return
	 */
	public static Document createXML(String fileName) {

		Document doc = DocumentHelper.createDocument();
		Element root = doc.addElement("book");
		root.addAttribute("name", "我的图书");
		Element childTmp;
		childTmp = root.addElement("price");
		childTmp.setText("21.22");
		Element writer = root.addElement("author");
		writer.setText("李四");
		writer.addAttribute("ID", "001");
		try {
			// 注意这里的修改
			XMLWriter xmlWriter = new XMLWriter(new FileOutputStream(fileName));
			xmlWriter.write(doc);
			xmlWriter.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		return doc;
	}

	/**
	 * 获得一个指定了根节点名称的doc对象
	 * 
	 * @param rootElementName
	 * @return
	 */
	public static Document createRootElementXML(String rootElementName) {
		Document doc = DocumentHelper.createDocument();
		doc.addElement(rootElementName);
		return doc;
	}

	/**
	 * 获得一个doc对象的根节点
	 * 
	 * @param doc
	 * @return
	 */
	public static Element getRootElement(Document doc) {
		if (doc != null) {
			return doc.getRootElement();
		} else {
			return null;
		}
	}

	/**
	 * 向doc的根节点新增子节点
	 * 
	 * @param doc
	 * @param nodeName
	 * @param nodeValue
	 * @return
	 */
	public static Document appendElementToRoot(Document doc, String nodeName,
			String nodeValue) {
		if (doc != null && nodeName != null) {
			Element root = doc.getRootElement();
			Element childTmp = root.addElement(nodeName);
			if (nodeValue != null) {
				childTmp.setText(nodeValue);
			}
		}
		return doc;
	}

	/**
	 * 往节点中新增子节点
	 * 
	 * @param parentElement
	 * @return
	 */
	public static Element appendElement(Element parentElement, String nodeName,
			String nodeValue) {
		if (parentElement != null && nodeName != null) {
			Element childTmp = parentElement.addElement(nodeName);
			if (nodeValue != null) {
				childTmp.setText(nodeValue);
			}
		}
		return parentElement;
	}

	/**
	 * 从来源doc中获取指定的节点追加到目标doc的根节点下
	 * 
	 * @param toDoc
	 * @param fromDoc
	 * @param nodeName
	 * @return
	 */
	public static Document appendElementFromOtherDoc(Document toDoc,
			Document fromDoc, String nodeName) {
		if (toDoc != null && fromDoc != null && nodeName != null) {
			String nodeValue = getNodeText(fromDoc, nodeName);
			Element root = toDoc.getRootElement();
			appendElement(root, nodeName, nodeValue);
		}
		return toDoc;
	}

	/**
	 * 获取dom中指定节点的内容
	 * 
	 * @param doc
	 * @param nodeName
	 * @return
	 */
	public static String getNodeText(Document doc, String nodeName) {
		String xpath = "//" + nodeName;
		String nodeText = "";
		try {
			Node node = doc.selectSingleNode(xpath);
			if (node != null)
				nodeText = node.getText();
		} catch (Exception e) {
			log.error("get exception", e);
		}
		return nodeText;
	}

	/**
	 * 从一个xml字符串中获取节点内容
	 * 
	 * @param docXmlStr
	 * @param nodeName
	 * @return
	 */
	public static String getNodeText(String docXmlStr, String nodeName) {
		Document doc = null;
		try {
			doc = DocumentHelper.parseText(docXmlStr);
		} catch (DocumentException e1) {
			log.error("error", e1);
		}
		String nodeText = "";
		if (doc != null) {
			nodeText = getNodeText(doc, nodeName);
		}
		return nodeText;
	}

	/**
	 * 校验xml文档中是否含有指定的节点
	 * 
	 * @param doc
	 * @param nodeName
	 * @return
	 */
	public static boolean checkIfExistNode(Document doc, String nodeName) {
		boolean flag = false;
		List list = doc.selectNodes("//" + nodeName);
		if (list != null && list.size() > 0) {
			flag = true;
		}
		return flag;
	}

	public static org.w3c.dom.Document XmlString2W3cDom(String xml)

	throws SAXException, IOException, ParserConfigurationException {

		byte[] byteArray = xml.getBytes("UTF-8");

		ByteArrayInputStream baos = new ByteArrayInputStream(byteArray);

		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

		org.w3c.dom.Document doc = factory.newDocumentBuilder().parse(baos);

		return doc;

	}

	public static org.dom4j.Document W3c2Dom4j(org.w3c.dom.Document doc) {

		if (doc == null) {

			return (null);

		}

		org.dom4j.io.DOMReader xmlReader = new org.dom4j.io.DOMReader();

		return (xmlReader.read(doc));

	}

	// /**
	// * @param args
	// */
	// public static void main(String[] args) {
	// // // TODO Auto-generated method stub
	// // Document doc=XMLHelper.createXML("test.xml");
	// // // doc=XMLHelper.readXML("payment.xml");
	// //
	// // String xmlContent = "<test>中文</test>";
	// // doc=XMLHelper.readXMLContentString(xmlContent);
	// // System.out.println(doc.asXML());
	// // //
	// // //
	// //
	// System.out.println("price:"+doc.selectSingleNode("//book[@name=\"我的图书\"]/price").getText());
	// // //
	// //
	// System.out.println("price:"+((Node)doc.selectNodes("//price").get(0)).getText());
	// // //
	// Document doc = XMLHelper.createRootElementXML("Root");
	// XMLHelper.appendElementToRoot(doc, "name", "bobo");
	// XMLHelper.appendElement(XMLHelper.getRootElement(doc), "age", null);
	// System.out.println(doc.asXML());
	// 
	// Document doc2 = XMLHelper.createRootElementXML("Root2");
	// XMLHelper.appendElementToRoot(doc2, "name2", "bobo2");
	// XMLHelper.appendElementFromOtherDoc(doc2, doc, "age");
	// System.out.println(doc2.asXML());
	// }
	public static void main(String[] args) {
		Document doc = XMLHelper.readXML("/xmlData/POSLinkType.xml");
		org.dom4j.tree.DefaultElement aa = (DefaultElement) doc.selectNodes(
				"//map").get(0);

		System.out.println(aa.asXML());

		System.out.println(doc.selectSingleNode("//map[@key=\"101\"]")
				.getText());

	}

}
