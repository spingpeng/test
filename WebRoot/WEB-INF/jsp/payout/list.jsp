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
        <th align=center colspan=7 style="height: 23px">统计支出</th>
      </tr>
      <tr bgcolor="#DEE5FA">
        <td  align="center" class=txlHeaderBackgroundAlternate>支出编号</td>
         <td align="center" class=txlHeaderBackgroundAlternate>支出人</td>
          <td align="center" class=txlHeaderBackgroundAlternate>支出类型</td>
           <td  align="center" class=txlHeaderBackgroundAlternate>支出金额</td>
            <td  align="center" class=txlHeaderBackgroundAlternate>支出时间</td>
             <td  align="center" class=txlHeaderBackgroundAlternate>支出说明</td>
             <td  align="center" class=txlHeaderBackgroundAlternate>操作</td>
      </tr>
      <s:iterator  value="list" status="stuts" var="payout">                
         <tr align="center" bgcolor="#799AE1">
		       <td  align="center" class=txlrow><s:property value="#payout.payoutId"/> </td>
        	 <td align="center" class=txlrow><s:property value="#payout.user.userName"/> </td>
          <td align="center" class=txlrow><s:property value="#payout.paykind"/> </td>
           <td  align="center" class=txlrow><s:property value="#payout.payAccount"/> </td>
            <td  align="center" class=txlrow><s:date  name="#payout.payTime" format="yyyy-MM-dd HH:mm:ss"/> </td>
             <td  align="center" class=txlrow><s:property value="#payout.remark"/> </td>
             <td  align="center" class=txlrow><a href="toModifyPayout.action?payout.payoutId=<s:property value="#payout.payoutId"/>">修改</a>&nbsp;&nbsp;|&nbsp;&nbsp;<a target="_blank" href="deletePayout.action?payout.payoutId=<s:property value="#payout.payoutId"/>">删除</a></td>
        
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


