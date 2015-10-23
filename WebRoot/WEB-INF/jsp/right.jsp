<%@ page language="java" pageEncoding="utf-8" contentType="text/html; charset=utf-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>
<html>
<head>
<link rel="stylesheet" href="css/css.css" type="text/css" />
</head>
<body>
<form name="form1" method="post" action="">
  <table width="1052" border=0 align=center cellpadding=2 cellspacing=1 bordercolor="#799AE1" class=tableBorder>
    <tbody>
      <tr>
        <th align=center colspan=16 style="height: 23px">当月总计</th>
      </tr>
      <tr bgcolor="#DEE5FA">
        <td colspan="16" align="center" class=txlrow>&nbsp;</td>
      </tr>
      <tr align="center" bgcolor="#799AE1">
        <td width="6%" align="center" class="txlHeaderBackgroundAlternate">支出总计</td>
        <td width="7%" align="center" class=txlHeaderBackgroundAlternate>收入总计</td>
        
      </tr>
   
      <tr bgcolor="#DEE5FA">
        <td align="center" class="txlrow"><s:property value="payTotal"/> </td>
        <td align=center class=txlrow><s:property value="inTotal"/></td>
       
      </tr>  
      <tr bgcolor="#DEE5FA">
        <td align="center" class="txlrow"><a href="toaddPayout.action">添加支出</a>|<a href="listPayout.action">支出统计</a></td>
        <td align=center class=txlrow><a href="toaddIncome.action">添加收入</a>|<a href="listIncome.action">收入统计</a></td>
       
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


