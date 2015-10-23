<%@ page language="java" pageEncoding="utf-8" contentType="text/html; charset=utf-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>
<html>
<head>
<link rel="stylesheet" href="css/css.css" type="text/css" />
</head>
<body>
<form name="form1" method="post" action="addUser.action">

  <table width="1052" border=0 align=center cellpadding=2 cellspacing=1 bordercolor="#799AE1" class=tableBorder>
    <tbody>
      <tr>
        <th align=center colspan=16 style="height: 23px"><s:property value="msg"/>用户</th>
      </tr>
      <tr bgcolor="#DEE5FA">
        <td colspan="16" align="center" class=txlrow>&nbsp;</td>
      </tr>
      <tr align="center" bgcolor="#799AE1">
        <td width="15%" align="center" class="txlHeaderBackgroundAlternate">用户名</td>
        <td align="left" class=txlrow><s:textfield name="user2.userName" ></s:textfield></td>
        
      </tr>
   
      <tr bgcolor="#DEE5FA">
        <td align="center" class="txlHeaderBackgroundAlternate">密码 </td>
        <td align=left class=txlrow><s:password name="user2.password" ></s:password></td>
       
      </tr>  
   
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


