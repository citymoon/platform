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
		<!--左边导航开始-->
		<%@ include file="/left.jsp"%>
		<!--左侧导航结束--->

		<!---右侧导航开始--->
		<%@ include file="/top.jsp"%>
		<!---右侧导航结束--->

		<!---右侧主要内容开始--->
		<div id="mian">
			<div class="page-title">
				<div class="left-title">
					<span class="h1">Form<small>表单一般元素</small></span>
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
			<div class="row">
				<div class="col-md-12 col-sx-12">
					<div class="x_panel">
						<div class="x_title">
							<h3>系统设置</h3>
							<div class="clearfix"></div>
						</div>
						<div class="x_content" style="display: block;">
							<form action="" class="form-horizontal">
								<div class=" form-group">
									<label class="col-sm-3 control-label">用户名：*</label>
									<div class="col-sm-6">
										<input type="text" class="form-control" id="inputEmail3"
											placeholder="username">
									</div>
								</div>

								<div class=" form-group">
									<label class="col-sm-3 control-label">密码：*</label>
									<div class="col-sm-6">
										<input type="password" class="form-control" id="inputEmail3"
											placeholder="password">
									</div>
								</div>

								<div class=" form-group">
									<label class="col-sm-3 control-label">爱好：*</label>
									<div class="col-sm-6">
										<div class="checkbox">
											<label class="checkbox-inline"> <input
												type="checkbox" value="">文艺
											</label> <label class="checkbox-inline"> <input
												type="checkbox" value="">文艺
											</label> <label class="checkbox-inline"> <input
												type="checkbox" value="">音乐
											</label> <label class="checkbox-inline"> <input
												type="checkbox" value="">体育
											</label>
										</div>
									</div>
								</div>
								<div class="form-group">
									<label class="col-sm-3 control-label">姓别：*</label>
									<div class="col-sm-6">
										<div class="radio">
											<label class="radio-inline"> <input type="radio"
												name=" " id="" value="sex">男
											</label> <label class="radio-inline"> <input type="radio"
												name=" " id="" value="sex">女
											</label>
										</div>
									</div>
								</div>

								<div class=" form-group">
									<label class="col-sm-3 control-label">留言：*</label>
									<div class="col-sm-6">
										<textarea placeholder="Text input" class="form-control"
											rows="3"></textarea>
										<p class="help-block">Example block-level help text here.</p>
										<button type="button" class="btn btn-success">取消</button>
										<button type="submit" class="btn btn-success">重置</button>
										<button type="submit" class="btn btn-primary">确定</button>
									</div>
								</div>
							</form>
						</div>
					</div>
				</div>
			</div>
		</div>
		<!---右侧内容结束--->
	</div>
</body>
</html>