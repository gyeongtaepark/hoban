<html xml:lang="ko" lang="ko">

<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>fever</title>
<head>
    <link type="text/css" href="/semantic/semantic.css" rel="stylesheet" />

    
    <script>
        function save2() {

        	document.getElementById("form1").action = "/save";
        	document.getElementById("form1").method= "get";
        	document.getElementById("form1").submit();
        }

    </script>
    
</head>

<body>
<#include "header.ftl">
<br/>
<br/>
<form id="form1">
	<div style="margin: 20px 20px 20px 20px;max-width: 150px" >
	        <input name="title" type="text" placeholder="제목을 입력하세요" value="">
	        <input name="name" type="text" placeholder="이름을 입력하세요" value="">
	 
	 		<input id="aaa" onclick="return save2();" value="저장">
	
	        <a onclick="return save2();" class="ui tag label">
	            저장 
	        </a>
	    <br/>
	</div>
</form>

</body>

</html>