<html xml:lang="ko" lang="ko">

<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>fever</title>
<head>
    <link type="text/css" href="/semantic/semantic.css" rel="stylesheet" />
    <script>
        function searching() {
            if(document.getElementById("workId").value.trim() == ""){
                alert("제목을 입력하세요.");
            }else{
                document.location = '/search?workId=' + document.getElementById("workId").value;
            }
        }
    </script>
</head>

<body>
<#include "header.ftl">
<br/>
<div style="margin: 20px 20px 20px 20px;max-width: 150px" >
    <div style="position:absolute; right: 0%; y-index:2;" class="ui right labeled left icon input">
        <i class="tags icon"></i>
        <input id="workId" name="workId" type="text" placeholder="제목을 입력하세요" value="${workId}">
        <br/>
        <a  onclick="return searching();" class="ui tag label">
            저장
        </a>
    </div>
    <br/>
</div>

</body>

</html>