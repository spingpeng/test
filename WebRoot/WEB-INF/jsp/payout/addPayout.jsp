<%@ page language="java" pageEncoding="utf-8" contentType="text/html; charset=utf-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
<link rel="stylesheet" href="css/css.css" type="text/css" />
<script language="javascript" type="text/javascript" src="<%=basePath %>My97DatePicker/WdatePicker.js"></script>
</head>
<body>
<form name="form1" method="post" action="addPayout.action">

  <table width="1052" border=0 align=center cellpadding=2 cellspacing=1 bordercolor="#799AE1" class=tableBorder>
    <tbody>
      <tr>
        <th align=center colspan=16 style="height: 23px"><s:property value="msg"/>支出</th>
      </tr>
      <tr bgcolor="#DEE5FA">
        <td colspan="16" align="center" class=txlrow>&nbsp;</td>
      </tr>
      <tr align="center" bgcolor="#799AE1">
        <td width="15%" align="center" class="txlHeaderBackgroundAlternate">支出类型</td>
        <td align="left" class=txlrow><s:textfield name="payout.paykind" ></s:textfield></td>
        
      </tr>
   
      <tr bgcolor="#DEE5FA">
        <td align="center" class="txlHeaderBackgroundAlternate">支出金额 </td>
        <td align=left class=txlrow><s:textfield name="payout.payAccount" ></s:textfield></td>
       
      </tr>  
     <tr bgcolor="#DEE5FA">
        <td align="center" class="txlHeaderBackgroundAlternate">支出时间 </td>
        <td align=left class=txlrow>
      <!--    <s:textfield name="payout.payTime" ></s:textfield>-->
         <input name="payout.payTime" id="d4311" onfocus="WdatePicker()" type="text"  tabindex="1"  rel="payout.payTime" class="Wdate"  value="<s:property value='payout.payTime'/>"/>
        </td>
       
      </tr>  
      <tr bgcolor="#DEE5FA">
        <td align="center" class="txlHeaderBackgroundAlternate">说明</td>
        <td align=left class=txlrow><s:textarea cols="50" rows="3" name="payout.remark" ></s:textarea></td>
       
      </tr> 
        <tr bgcolor="#DEE5FA">
        <td align=right class="txlHeaderBackgroundAlternate"><s:submit label="提交"></s:submit></td>
        <td align=left class=txlrow><s:reset label="重置"></s:reset></td>
      </tr>   
     </tbody></table>
</FORM>
<script  language="javascript">  
       function  selectAll()  
       {  
       var  arrObj  =  document.all;  
       for(var  i  =  0;  i  <  arrObj.length;i++)  
       {  
 
                               if(typeof  arrObj[i].type  !=  "undefined"  &&  arrObj[i].type=='checkbox')  arrObj[i].checked  =true;  
       }  
       }  
 
       function  unSelectAll()  
       {  
           var  arrObj  =  document.all;  
       for(var  i  =  0;  i  <  arrObj.length;i++)  
       {  
                               if(typeof  arrObj[i].type  !=  "undefined"  &&  arrObj[i].type=='checkbox')  arrObj[i].checked  =false;  
       }  
       }  
</script> 

</BODY>
  </HTML>


