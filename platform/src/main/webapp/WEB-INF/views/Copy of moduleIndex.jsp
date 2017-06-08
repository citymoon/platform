<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ include file="/common.jsp" %>
<!DOCTYPE html>
<html lang="zh-CN">
  <head>
    <%@ include file="/commonhead.jsp" %>
  </head>
<body>
<div id="wrapper">
    <table border="0" cellPadding="0" cellSpacing="0" width="100%" height="100%">
      <tr>
        <td width="20%" id="leftframe" name="leftframe"  height="" align="left" valign="top">
           <iframe frameBorder="0" id="left" name="left" src="${ctx}/left.jsp" style="HEIGHT:  100%; VISIBILITY: inherit; WIDTH: 100%;" target="main" hspace="0" vspace="0" align="left" marginheight="0" marginwidth="0">
           </iframe>
        </td>
        <td width="80%" id="rightframe" name="rightframe"  height="" align="left" valign="top">
            <table>
                <tr>
                    <td width="100%" height="100px">
			           <iframe frameBorder="0" id="top" name="top" src="${ctx}/top.jsp" style="HEIGHT:  100%; VISIBILITY: inherit; WIDTH: 100%;" target="main" hspace="0" vspace="0" align="left" marginheight="0" marginwidth="0">
			           </iframe>
                    </td>
                </tr>
                <tr>
                    <td width="100%" height="100%">
			           <iframe frameBorder="0" id="main" name="main" src="${ctx}/main.jsp" style="HEIGHT:  100%; VISIBILITY: inherit; WIDTH: 100%;" target="main" hspace="0" vspace="0" align="left" marginheight="0" marginwidth="0">
			           </iframe>
                    </td>
                </tr>
            </table>
        </td>
      </tr>
    </table>
    <%//@ include file="/left.jsp" %>
    <%//@ include file="/top.jsp" %>
</div>
</body>
</html>