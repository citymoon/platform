<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
<title>Enterprise Manage Platform</title>

<!-- Bootstrap -->
<link href="${ctx}/resources/bootstrap/css/bootstrap.min.css"
	rel="stylesheet">
<!-- 图标样式 -->
<link href="http://www.jq22.com/jquery/font-awesome.4.6.0.css"
	rel="stylesheet">
<!-- 自定义样式 -->
<link href="${ctx}/resources/css/style.css" rel="stylesheet"
	type="text/css">
<link rel="stylesheet" href="${ctx}/resources/css/sidenavbar.css"
	media="screen" type="text/css" />
<!-- 日期样式 -->
<link rel="stylesheet" type="text/css" media="all"
	href="${ctx}/resources/data/daterangepicker-bs3.css" />

<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
      <script src="https://cdn.bootcss.com/html5shiv/3.7.3/html5shiv.min.js"></script>
      <script src="https://cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="https://cdn.bootcss.com/jquery/1.12.4/jquery.min.js"></script>
<!-- Include all compiled plugins (below), or include individual files as needed -->
<script src="${ctx}/resources/bootstrap/js/bootstrap.min.js"></script>
<script src="${ctx}/resources/js/index.js"></script>
<script type="text/javascript">
	$(document).ready(
			function() {
				$('#mainmenu').find('a').each(
						function() {
							if (this.href == document.location.href
									|| document.location.href
											.search(this.href) >= 0) {
								$(this).parents("ul").css('display','block');
							}
						});
			});
</script>
