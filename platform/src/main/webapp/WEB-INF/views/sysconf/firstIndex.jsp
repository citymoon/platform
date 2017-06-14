<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ include file="/common.jsp"%>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
<%@ include file="/commonhead.jsp"%>
<script type="text/javascript">
$(document).ready(function() {
		$('#mainmenu').find('a').each(function() {
			if (this.href == document.location.href
					|| document.location.href
							.search(this.href) >= 0) {
				$(this).parents("ul").css('display',
						'block');
			}
	    });
		$('#conSub').click(function(){
			$("#conForm").submitForm({
	            url: "/Document/SubmitDocumentCreate",
	            dataType: "text",
	            callback: function (data) {
	                endFileUpload();
	                data = eval("(" + data + ")");
	                alert(data.Content);
	                if (data.Result > 0) {
	                    location.href = data.Redirect;
	                }
	            },
	            before: function () {
	                //startFileUpload();
	                var errMsg = "";
	            }
	        }).submit();
		});
});
</script>

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
				<div class="col-md-12 col-sm-12 col-sx-12">
					<ul class="nav nav-tabs">
						<li class="active pull-left"><a href="#one" data-toggle="tab">第一个选项卡</a></li>
						<li class="pull-left"><a href="#two" data-toggle="tab">第二个选项卡</a></li>
						<li class="pull-left"><a href="#three" data-toggle="tab">第三个选项卡</a></li>
					</ul>
					<div class="tab-content">
						<div class="tab-pane active" id="one">
							<div class="pane-body">
								<form action="" class="form-horizontal" id="conForm">
									<div class=" form-group">
										<label class="col-sm-3 control-label">系统名称：*</label>
										<div class="col-sm-6">
											<input type="text" class="form-control" id="sysName">
										</div>
									</div>

									<div class=" form-group">
										<label class="col-sm-3 control-label">系统WEB绝对路径：*</label>
										<div class="col-sm-6">
											<input type="text" class="form-control" id="sysWebPath"
												value="${oaConfigTab.sysWebPath }">
										</div>
									</div>
									<div class=" form-group">
										<label class="col-sm-3 control-label">系统上传相对路径：*</label>
										<div class="col-sm-6">
											<input type="text" class="form-control" id="sysUploadPath"
												value="${oaConfigTab.sysUploadPath }">
										</div>
									</div>
									<div class="form-group">
										<label class="col-sm-3 control-label">管理员邮箱：*</label>
										<div class="col-sm-6">
											<input type="text" class="form-control" id="webMasterMail"
												value="${oaConfigTab.webMasterMail }">
										</div>
									</div>

									<div class=" form-group">
										<label class="col-sm-3 control-label">邮件服务器：*</label>
										<div class="col-sm-6">
											<input type="text" class="form-control" id="mailServerIp"
												value="${oaConfigTab.mailServerIp }">
										</div>
									</div>
									<div class=" form-group">
										<label class="col-sm-3 control-label">系统访问URL：*</label>
										<div class="col-sm-6">
											<input type="text" class="form-control" id="sysUrl"
												value="${oaConfigTab.sysUrl }">
										</div>
									</div>
									<div class="form-group">
										<label class="col-sm-5 control-label"></label>
										<button type="button" class="btn btn-success" id="conSub">提交</button>
										<button type="button" class="btn btn-warning" id="conRes">重置</button>
									</div>
									<div>
										<span class="help-block"><p
												class="lead text-left small">
												说明： <br> OA系统WEB物理目录为本系统所在的实际路径。 <br>
												文件上传的相对目录是指本系统中的上传文件所存放的目录，必须是从OA系统WEB物理路径开始的目录，且文件上传的相对目录必须以“/”开头。<br>
												系统访问的URL为本系统的访问路径。
											</p></span>
									</div>
								</form>
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