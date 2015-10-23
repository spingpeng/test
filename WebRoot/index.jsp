<%@ page language="java" pageEncoding="utf-8" contentType="text/html; charset=utf-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<HTML>
<HEAD>
<TITLE>登录</TITLE>

<STYLE>
TD {
	FONT-SIZE: 11px; COLOR: #000000; FONT-FAMILY: Verdana, Arial, Helvetica, sans-serIf; TEXT-DECORATION: none
}
.input_1 {
	BORDER-RIGHT: #999999 1px solid; PADDING-RIGHT: 2px; BORDER-TOP: #999999 1px solid; PADDING-LEFT: 2px; LIST-STYLE-POSITION: inside; FONT-SIZE: 12px; PADDING-BOTTOM: 2px; MARGIN-LEFT: 10px; BORDER-LEFT: #999999 1px solid; COLOR: #333333; PADDING-TOP: 2px; BORDER-BOTTOM: #999999 1px solid; FONT-FAMILY: Arial, Helvetica, sans-serIf; LIST-STYLE-TYPE: none; HEIGHT: 18px; BACKGROUND-COLOR: #dadedf
}
</STYLE>
</HEAD>
<BODY>

<TABLE cellSpacing=0 cellPadding=0 width=651 align=center border=0>
  <TBODY>
  
  <TR>
    <TD height=50></TD>
  </TR>
  <TR>
    <TD height=351><TABLE cellSpacing=0 cellPadding=0 width="100%" border=0>
        <TBODY>
        
        <TR>
          <TD width=15 background=images/ileft.gif height=43></TD>
          <TD width=620 background=images/i_topbg2.gif><IMG 
            height=43 src="images/i_top1.gif" width=43></TD>
          <TD width=16><IMG height=43 src="images/iright.gif" 
            width=16></TD>
        </TR>
        <TR>
          <TD background=images/ileftbg.gif></TD>
          <TD vAlign=center background=images/bg.gif height=279><TABLE height=109 cellSpacing=0 cellPadding=0 width=369 align=center 
            border=0>
              <TBODY>
              
              <TR>
                <TD width=155><IMG height=140 
                  src="images/logo.jpg" width=155 useMap=#Map 
                  border=0></TD>
                <TD vAlign=top align=left width=214><TABLE cellSpacing=0 cellPadding=0 width=167 border=0>
                    <TBODY>
                    
                    <TR>
                      <TD vAlign=bottom width=167 height=30><A 
                        href="http://www.865171.cn/admin-templates/"><IMG 
                        height=19 src="images/adminsyteam.gif" 
                        width=154 border=0></A></TD>
                    </TR>
                    <TR>
                      <TD height=123> <FORM name=form2 action="index.action" method=post><TABLE height=109 cellSpacing=0 cellPadding=0 
                        align=center border=0>
                         
                            
                              <TR>
                                <TD vAlign=bottom align=left width=44 height=28><DIV align=right><IMG height=14 
                              src="images/id.gif" width=43></DIV></TD>
                                <TD vAlign=bottom align=left width=114 
                              height=28><INPUT class=input_1 id=username size=15 
                              name="user.userName">
                                </TD>
                              </TR>
                              <TR>
                                <TD align=left height=20><DIV align=right><IMG height=14 
                              src="images/pass.gif" 
                            width=43></DIV></TD>
                                <TD height=20><INPUT class=input_1 id=password 
                              type=password size=15 name=user.password></TD>
                              </TR>
                              <TR>
                                <TD vAlign=center colSpan=2 height=25><DIV align=center>
                                    <INPUT type=image 
                              src="images/b_login.gif" onclick=document.form2.submit()>
                                    <IMG style="CURSOR: hand" 
                              onclick=document.form2.reset() height=21 
                              src="images/b_clean.gif" width=73> </DIV></TD>
                              </TR>
                         
                          
                        </TABLE> </FORM></TD>
                    </TR>
                    </TBODY>
                  </TABLE></TD>
              </TR>
              </TBODY>
            </TABLE></TD>
          <TD background=images/irightbg.gif></TD>
        </TR>
        <TR>
          <TD><IMG height=29 src="images/i_bottom_left.gif" 
            width=15></TD>
          <TD background=images/i_bottom_bg.gif></TD>
          <TD width=16><IMG height=29 
            src="images/i_bottom_right.gif" 
      width=16></TD>
        </TR>
        </TBODY>
      </TABLE></TD>
  </TR>
  <TR>
    <TD height=1></TD>
  </TR>
  <TR>
    <TD>&nbsp;</TD>
  </TR>
  </TBODY>
</TABLE>

<MAP name=Map>
  <AREA shape=CIRCLE 
  target=_blank coords=77,67,57 href="http://www.baidu.com/">
</MAP>
</BODY>
</HTML>

