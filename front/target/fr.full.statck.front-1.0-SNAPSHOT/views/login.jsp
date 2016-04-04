<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="config.WebSecurityConfig"%>
<html>
	<head>
		<title>Spring Security Tutorial - Form</title>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>

		<style>
		    .info { width:400px; display:inline-block; }

		</style>

	</head>

	<body>
		<H1>Page de login</H1>
        <span class="info">Pour un accès authentifié sans rôle:</span><span>toto / toto</span> <br />
        <span class="info">Pour un accès authentifié avec le rôle ROLE_ADMIN:</span><span>admin / toto</span> <br />
		<span class="info">Le mot de passe toto en crypté donne:</span><span><%=WebSecurityConfig.PASSWORD%></span> <br />
        <br />
		<form id="form" action="<c:url value='/login.do'/>" method="POST">
			<c:if test="${not empty param.err}">
				<div class="msg-container error">
					<c:out value="${SPRING_SECURITY_LAST_EXCEPTION.message}"/>
				</div>
			</c:if>
			<c:if test="${not empty param.out}">
				<div class="msg-container logout">
					You've logged out successfully.
				</div>
			</c:if>
			<c:if test="${not empty param.time}">
				<div class="msg-container time">
					You've been logged out due to inactivity.
				</div>
			</c:if>

			Username:<br>
			<input type="text" name="username" value="" class="input-text input-email<c:if test="${not empty param.err}"> input-error</c:if>"/><br><br>
			Password:<br>
			<input type="password" name="password" value="" class="input-text input-pass<c:if test="${not empty param.err}"> input-error</c:if>"/>

			<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>

			<div class="submit-container">
				<input value="Login" name="submit" type="submit" class="submit-btn"/>
			</div>
		</form>
	</body>
</html>
