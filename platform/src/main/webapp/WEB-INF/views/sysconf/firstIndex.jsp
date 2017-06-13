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
			<div class="row">
				<div class="col-md-6 col-sm-6 col-sx-12">
					<ul class="nav nav-tabs">
						<li class="left-title"><span class="h1">Form表单一般元素</span></li>
						<li class="active"><a href="#one" data-toggle="tab">第一个选项卡</a></li>
						<li><a href="#two" data-toggle="tab">第二个选项卡</a></li>
						<li><a href="#three" data-toggle="tab">第三个选项卡</a></li>
					</ul>
					<div class="tab-content">
						<div class="tab-pane active" id="one">
							<div class="pane-body">
								<div class="col-md-12 col-sx-12">
									<div class="x_panel">
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
														<input type="password" class="form-control"
															id="inputEmail3" placeholder="password">
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
														<p class="help-block">Example block-level help text
															here.</p>
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
						<div class="tab-pane" id="two">
							<div class="pane-body">
								<h5>移动设备优先</h5>
								<p>在 Bootstrap2 中，我们对框架中的某些关键部分增加了对移动设备友好的样式。而在 Bootstrap 3
									中，我们重写了整个框架，使其一开始就是对移动设备友好的。这次不是简单的增加一些可选的针对移动设备的样式，而是直接融合进了框架的内核中。也就是说，Bootstrap
									是移动设备优先的。针对移动设备的样式融合进了框架的每个角落，而不是增加一个额外的文件。
							</div>
						</div>
						<div class="tab-pane" id="three">
							<div class="pane-body">
								<h5>3HTML5 文档类型</h5>
								<p>Bootstrap 使用到的某些 HTML 元素和 CSS 属性需要将页面设置为 HTML5
									文档类型。在你项目中的每个页面都要参照下面的格式进行设置。</p>
							</div>
						</div>
					</div>

				</div>
			</div>
		</div>
		<!---右侧内容结束--->
	</div>
</body>
</html>