<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ include file="../layout/header.jsp"%>

<div class="container">
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
</head>
<body>

<div class="container">
    <form action="/auth/loginProc" method ="post">
      <div class="form-group">
        <label for="username">Username:</label>
        <input type="text" name="username" class="form-control" placeholder="Enter username" id="username">
      </div>

      <div class="form-group">
        <label for="password">Password:</label>
        <input type="password" name="password" class="form-control" placeholder="Enter password" id="password">
      </div>

      <div class="form-group form-check">
        <label class="form-check-label">
        <input name="remember" class="form-check-input" type="checkbox">Remember me
        </label>
      </div>

      <button id="btn-login" class="btn btn-primary">로그인</button>
    </form>

</div>

<br/>

<script src="/js/user.js"></script>
<%@ include file="../layout/footer.jsp"%>
