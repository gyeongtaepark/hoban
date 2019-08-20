<html xml:lang="ko" lang="ko">

<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>fever</title>
<head>
    <link type="text/css" href="/semantic/semantic.css" rel="stylesheet" />
    <script>
        function searching() {
            if(document.getElementById("title").value.trim() == ""){
                alert("제목을 입력하세요.");
            }else{
                document.location = '/search?workId=' + document.getElementById("title").value;
            }
        }
    </script>
</head>

<body>
<#include "header.ftl">
<br/>
<br/>
<br/>
<div class="ui fluid icon input">
  <input type="text" placeholder="Search a very wide input...">
  <i class="search icon"></i>
</div>
<div class="ui form">
  <div class="field">
    <label>Short Text</label>
    <textarea rows="2"></textarea>
  </div>
  <div class="field">
    <label>Text</label>
    <textarea></textarea>
  </div>
</div>
<!--img class="ui medium bordered image" src="/images/wireframe/white-image.png"-->
<button class="ui active button">
  <i class="user icon"></i>
  Save
</button>
</body>

</html>