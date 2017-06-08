<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
        <!--左边导航开始-->
        <nav class="navbar-static-side">
            <div class="brand"><img src="${ctx}/resources/images/logo.png" /></div>          
            <ul id="accordion" class="accordion"> 
                <c:forEach var="map" items="${model.modules}">
	                <li><div class="link"><i class="fa fa-camera"></i>${map.key }<i class="fa fa-chevron-down"></i></div>
	                    <ul class="submenu">
	                    <c:forEach var="module" items="${map.value}">
	                        <li><a href="${ctx}/${module.mdUrl}">${module.mdName }</a></li>
	                    </c:forEach>
	                    </ul>
	                </li> 
                </c:forEach>              
            </ul>
        </nav>
        <!---左侧导航结束---> 