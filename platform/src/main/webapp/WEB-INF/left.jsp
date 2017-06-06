<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
        <!--左边导航开始-->
        <nav class="navbar-static-side">
            <div class="brand"><img src="${ctx}/resources/images/logo.png" /></div>          
            <ul id="accordion" class="accordion">
                <li>
                    <div class="link"><i class="fa fa-home"></i>主页<i class="fa fa-chevron-down"></i></div>
                    <ul class="submenu">
                        <li><a href="样式一.html">样式一</a></li>
                        <li><a href="index.html">页面配色</a></li>
                    </ul>
                </li>
                <li>
                    <div class="link"><i class="fa fa-calculator"></i>布局<i class="fa fa-chevron-down"></i></div>
                    <ul class="submenu">
                        <li><a href="index.html">布局一</a></li>
                        <li><a href="index.html">布局二</a></li>
                    </ul>
                </li>
                <li>
                    <div class="link"><i class="fa fa-database"></i>统计表<i class="fa fa-chevron-down"></i></div>
                    <ul class="submenu">
                        <li><a href="统计图表.html">百度Echarts</a></li>
                        <li><a href="统计图表.html">图表</a></li>
                    </ul>
                </li>
                <li><div class="link"><i class="fa fa-pencil-square-o"></i>表单<i class="fa fa-chevron-down"></i></div>
                    <ul class="submenu">
                        <li><a href="Form-基本表单.html">基本表单</a></li>
                        <li><a href="Form-验证表单.html">验证表单</a></li>
                        <li><a href="Form-编辑器.html">编辑器</a></li>
                        <li><a href="Form-日期.html">日期选择器</a></li>
                    </ul>
                </li>
                <li><div class="link"><i class="fa fa-diamond"></i>UI元素<i class="fa fa-chevron-down"></i></div>
                    <ul class="submenu">
                        <li><a href="UI元素-排版.html">排版</a></li>
                        <li><a href="UI元素-按钮.html">按钮</a></li>
                        <li><a href="UI元素-选项卡面板.html">选项卡，面板组</a></li>
                        <li><a href="UI元素-通知提示.html">通知提示</a></li>
                        <li><a href="UI元素-徽章标签进度.html">徽章 标签 进度</a></li>
                        <li><a href="UI元素-栅格布局.html">栅格系统</a></li>
                        <li><a href="UI元素-弹出框模态框.html">弹出模态框</a></li>
                        <li><a href="UI元素-树形结构.html">树形结构</a></li>
                    </ul>
                </li>
                <li><div class="link"><i class="fa fa-area-chart"></i>表格<i class="fa fa-chevron-down"></i></div>
                    <ul class="submenu">
                        <li><a href="Table-基本表格.html">基本表格</a></li>
                        <li><a href="Table-Date样式.html">Date表格</a></li>
                        <li><a href="Table-projects样式.html">projects</a></li>                       
                    </ul>
                </li>
                <li><div class="link"><i class="fa fa-desktop"></i>页面<i class="fa fa-chevron-down"></i></div>
                    <ul class="submenu">
                        <li><a href="Page-登录.html">page-登录</a></li>
                        <li><a href="Page-注册.html">page-注册</a></li>
                        <li><a href="Page-404页面.html">page-404页面</a></li>
                        <li><a href="Page-500页面.html">page-500页面</a></li>
                    </ul>
                </li>
                <li><div class="link"><i class="fa fa-camera"></i>相册<i class="fa fa-chevron-down"></i></div>
                    <ul class="submenu">
                        <li><a href="相册-图片切换.html">图片切换</a></li>
                        <li><a href="相册-基本图库.html">基本相册</a></li>
                    </ul>
                </li> 
                <c:forEach var="map" items="${modules}">
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