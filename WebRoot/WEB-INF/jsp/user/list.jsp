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
        <th align=center colspan=4 style="height: 23px">用户列表</th>
      </tr>
      <tr bgcolor="#DEE5FA">
        <td  align="center" class=txlHeaderBackgroundAlternate>用户编号</td>
         <td align="center" class=txlHeaderBackgroundAlternate>用户名</td>
          <td align="center" class=txlHeaderBackgroundAlternate>用户密码</td>
        <td align="center" class=txlHeaderBackgroundAlternate>操作</td>
      </tr>
      <s:iterator  value="list" status="stuts" var="user">                
         <tr align="center" bgcolor="#799AE1">
		       <td  align="center" class=txlrow><s:property value="#user.userId"/> </td>
        	 <td align="center" class=txlrow><s:property value="#user.userName"/> </td>
          <td align="center" class=txlrow><s:property value="#user.password"/> </td>
   <td  align="center" class=txlrow><a href="toModifyUser.action?user2.userName=<s:property value="#user.userName"/>">修改</a>&nbsp;&nbsp;|&nbsp;&nbsp;<a target="_blank" href="deleteUser.action?user2.userId=<s:property value="#user.userId"/>">删除</a></td>
        
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


