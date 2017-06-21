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
			//alert(true);
			$(this).parents("ul").css('display',
					'block');
		}
    });
	$('#conSub').click(function(){
		$.ajax({
			type:'POST',
			datatype:'text',
			url:"<%=ctxpath%>/sysconf/update",
			data : $("#conForm").serialize(),
			//contentType:"application/x-www-form-urlencoded",
			success : function() {
			    alert('ok');
			}
		})
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
								<form action="" class="form-horizontal" id="conForm"
									method="post">
									<input type="hidden" id="rowId" name="rowId"
										value="${oaConfigTab.rowId }">
									<div class=" form-group">
										<label class="col-sm-3 control-label">系统名称：*</label>
										<div class="col-sm-6">
											<input type="text" class="form-control" id="sysName"
												name="sysName" value="${sysCompName }">
										</div>
									</div>

									<div class=" form-group">
										<label class="col-sm-3 control-label">系统WEB绝对路径：*</label>
										<div class="col-sm-6">
											<input type="text" class="form-control" id="sysWebPath"
												name="sysWebPath" value="${oaConfigTab.sysWebPath }">
										</div>
									</div>
									<div class=" form-group">
										<label class="col-sm-3 control-label">系统上传相对路径：*</label>
										<div class="col-sm-6">
											<input type="text" class="form-control" id="sysUploadPath"
												name="sysUploadPath" value="${oaConfigTab.sysUploadPath }">
										</div>
									</div>
									<div class="form-group">
										<label class="col-sm-3 control-label">管理员邮箱：*</label>
										<div class="col-sm-6">
											<input type="text" class="form-control" id="webMasterMail"
												name="webMasterMail" value="${oaConfigTab.webMasterMail }">
										</div>
									</div>

									<div class=" form-group">
										<label class="col-sm-3 control-label">邮件服务器：*</label>
										<div class="col-sm-6">
											<input type="text" class="form-control" id="mailServerIp"
												name="mailServerIp" value="${oaConfigTab.mailServerIp }">
										</div>
									</div>
									<div class=" form-group">
										<label class="col-sm-3 control-label">系统访问URL：*</label>
										<div class="col-sm-6">
											<input type="text" class="form-control" id="sysUrl"
												name="sysUrl" value="${oaConfigTab.sysUrl }">
										</div>
									</div>
									<div class="form-group">
										<label class="col-sm-5 control-label"></label>
										<button type="submit" class="btn btn-success" id="conSub">提交</button>
										<button type="button" class="btn btn-warning" id="conRes">重置</button>
									</div>
									<div>
										<span class="help-block">
										<p class="lead text-left small">
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
								<div class="table-responsive">
									<table class="table table-hover table-striped x-table">
										<thead class="x-table-heading">
											<tr>
												<th>顺序号</th>
												<th>模块名称</th>
												<th>模块原名</th>
												<th>模块编码</th>
											</tr>
										</thead>
										<tbody>
											<tr>
												<td><label> <input class="demo--checkbox"
														type="checkbox" name=" ">     <span
														class="demo--checkboxInput"></span>
												</label></td>
												<td>米莫说｜MiMO Show</td>
												<td>Otto</td>
												<td>20%</td>
												<td>2014.11.11</td>
												<td>View</td>
											</tr>
											<tr>
												<td><label> <input class="demo--checkbox"
														type="checkbox" name=" ">     <span
														class="demo--checkboxInput"></span>
												</label></td>
												<td>米莫说｜MiMO Show</td>
												<td>Otto</td>
												<td>20%</td>
												<td>2014.11.11</td>
												<td>View</td>
											</tr>
											<tr>
												<td><label> <input class="demo--checkbox"
														type="checkbox" name=" ">     <span
														class="demo--checkboxInput"></span>
												</label></td>
												<td>米莫说｜MiMO Show</td>
												<td>Otto</td>
												<td>20%</td>
												<td>2014.11.11</td>
												<td>View</td>
											</tr>
											<tr>
												<td><label> <input class="demo--checkbox"
														type="checkbox" name=" ">     <span
														class="demo--checkboxInput"></span>
												</label></td>
												<td>米莫说｜MiMO Show</td>
												<td>Otto</td>
												<td>20%</td>
												<td>2014.11.11</td>
												<td>View</td>
											</tr>
											<tr>
												<td><label> <input class="demo--checkbox"
														type="checkbox" name=" ">     <span
														class="demo--checkboxInput"></span>
												</label></td>
												<td>米莫说｜MiMO Show</td>
												<td>Otto</td>
												<td>20%</td>
												<td>2014.11.11</td>
												<td>View</td>
											</tr>
											<tr>
												<td><label> <input class="demo--checkbox"
														type="checkbox" name=" ">     <span
														class="demo--checkboxInput"></span>
												</label></td>
												<td>米莫说｜MiMO Show</td>
												<td>Otto</td>
												<td>20%</td>
												<td>2014.11.11</td>
												<td>View</td>
											</tr>
											<tr>
												<td><label> <input class="demo--checkbox"
														type="checkbox" name=" ">     <span
														class="demo--checkboxInput"></span>
												</label></td>
												<td>米莫说｜MiMO Show</td>
												<td>Otto</td>
												<td>20%</td>
												<td>2014.11.11</td>
												<td>View</td>
											</tr>
											<tr>
												<td><label> <input class="demo--checkbox"
														type="checkbox" name=" ">     <span
														class="demo--checkboxInput"></span>
												</label></td>
												<td>米莫说｜MiMO Show</td>
												<td>Otto</td>
												<td>20%</td>
												<td>2014.11.11</td>
												<td>View</td>
											</tr>
											<tr>
												<td><label> <input class="demo--checkbox"
														type="checkbox" name=" ">     <span
														class="demo--checkboxInput"></span>
												</label></td>
												<td>米莫说｜MiMO Show</td>
												<td>Otto</td>
												<td>20%</td>
												<td>2014.11.11</td>
												<td>View</td>
											</tr>
										</tbody>
									</table>
								</div>
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