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
        <th align=center colspan=4 style="height: 23px">日志列表</th>
      </tr>
      <tr bgcolor="#DEE5FA">
        <td  align="center" class=txlHeaderBackgroundAlternate>日志编号</td>
         <td align="center" class=txlHeaderBackgroundAlternate>用户名</td>
          <td align="center" class=txlHeaderBackgroundAlternate>操作时间</td>
      </tr>
      <s:iterator  value="listinfo" status="stuts" var="userinfo">                
         <tr align="center" bgcolor="#799AE1">
		       <td  align="center" class=txlrow><s:property value="#userinfo.loginId"/> </td>
        	 <td align="center" class=txlrow><s:property value="#userinfo.user.userName"/> </td>
          <td align="center" class=txlrow><s:property value="#userinfo.loginTime"/> </td>
        
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


