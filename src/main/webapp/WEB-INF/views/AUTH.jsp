<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<script src="https://code.jquery.com/jquery-3.0.0.min.js"></script>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Auth</title>
</head>
<body>
    <button id="authBtn">버튼</button>
</body>
<script>
     $("#authBtn").click(function(){
            var tmpWindow = window.open('about:blank')
            tmpWindow.location = "https://testapi.openbanking.or.kr/oauth/2.0/authorize?" +
            "response_type=code&"+
            "client_id=816e6e4d-56a5-47dd-a900-855893faacd9&"+ // 
            "redirect_uri=http://localhost:8080/authResult&"+
            "scope=login inquiry transfer&"+
            "state=12345678901234567890123456789012&"+
            "auth_type=0"
        })
</script>
</html>