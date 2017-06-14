<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ include file="/common.jsp"%>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
<%@ include file="/commonhead.jsp"%>
</head>
<body>
	<div id="wrapper">
		<%@ include file="/left.jsp"%>
		<%@ include file="/top.jsp"%>
		<!---右侧主要内容开始--->
		<div id="mian">
			<div class="page-title">
				<div class="left-title">
					<span class="h1">Table<small>表格基本样式</small></span>
				</div>
				<div class="right-title">
					<div class="col-md-6 col-sm-6 col-xs-12 pull-right">
						<form class="form-group">
							<div class="input-group">
								<input type="text" class="form-control" placeholder="输入搜索关键字...">
								<span class="input-group-btn">
									<button class="btn btn-primary">搜索</button>
								</span>
							</div>
						</form>
					</div>
				</div>
				<div class="clearfix"></div>
			</div>
		</div>
	</div>
</body>
</html>