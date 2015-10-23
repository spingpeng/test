<%@ page language="java" pageEncoding="utf-8" contentType="text/html; charset=utf-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>
<html>
<head>
<link rel="stylesheet" href="css/css.css" type="text/css" />
</head>
<body>
<form name="form1" method="post" action="addPayout.action">

  <table width="1052" border=0 align=center cellpadding=2 cellspacing=1 bordercolor="#799AE1" class=tableBorder>
    <tbody>
      <tr>
        <th align=center colspan=7 style="height: 23px">统计收入</th>
      </tr>
      <tr bgcolor="#DEE5FA">
        <td  align="center" class=txlHeaderBackgroundAlternate>收入编号</td>
         <td align="center" class=txlHeaderBackgroundAlternate>收入人</td>
          <td align="center" class=txlHeaderBackgroundAlternate>收入类型</td>
           <td  align="center" class=txlHeaderBackgroundAlternate>收入金额</td>
            <td  align="center" class=txlHeaderBackgroundAlternate>收入时间</td>
             <td  align="center" class=txlHeaderBackgroundAlternate>收入说明</td>
             <td  align="center" class=txlHeaderBackgroundAlternate>操作</td>
      </tr>
      <s:iterator  value="list" status="stuts" var="income">                
         <tr align="center" bgcolor="#799AE1">
		       <td  align="center" class=txlrow><s:property value="#income.incomeId"/> </td>
        	 <td align="center" class=txlrow><s:property value="#income.user.userName"/> </td>
          <td align="center" class=txlrow><s:property value="#income.inkind"/> </td>
           <td  align="center" class=txlrow><s:property value="#income.inAccount"/> </td>
            <td  align="center" class=txlrow><s:date  name="#income.inTime" format="yyyy-MM-dd HH:mm:ss"/> </td>
             <td  align="center" class=txlrow><s:property value="#income.remark"/> </td>
             <td  align="center" class=txlrow><a href="toModifyIncome.action?income.incomeId=<s:property value="#income.incomeId"/>">修改</a>&nbsp;&nbsp;|&nbsp;&nbsp;<a target="_blank" href="deleteIncome.action?income.incomeId=<s:property value="#income.incomeId"/>">删除</a></td>
        
		      </tr>
            </s:iterator>

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


