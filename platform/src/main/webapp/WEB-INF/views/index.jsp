<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ include file="../../common.jsp" %>
<!DOCTYPE html>
<html lang="zh-CN">
  <head>
    <%@ include file="../common.jsp" %>
    <style type="text/css">
         body{background: #f7f7f7; color: #676a6c;}
      </style>
  
</head>
<body>
        <div class="login-wrapper">
            <h3 class="text-center"><span class="login-name">EMP</span>企业管理平台</h3>
            <br  />
            <form action="loginto" method="POST">
                <div class=" form-group">
                  <input type="text" class="form-control" id="inputEmail3" name="userId" placeholder="用户名" value="${model.userId }">
                </div>
                                
                <div class=" form-group">
                    <input type="password" class="form-control" id="inputEmail3" name="password" placeholder="密码" value="${model.password }">
                </div>
                
                <div class=" form-group">                                   
                    <button type="submit" class="btn btn-primary btn-block">登录</button>
                </div>
            </form>
            <p class="text-center">
                ${model.error }
            </p>
        </div>
</body>
</html>