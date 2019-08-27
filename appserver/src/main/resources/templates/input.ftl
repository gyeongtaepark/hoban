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
<div style="margin: 20px 20px 20px 20px;max-width: 150px" >
    <div style="position:absolute; right: 0%; y-index:2;" class="ui right labeled left icon input">
        <i class="tags icon"></i>
        <input id="title" name="title" type="text" placeholder="제목을 입력하세요" value="">
        <a  onclick="return searching();" class="ui tag label">
            저장 
        </a>
        <br/>
        <div class="ui list">
  <div class="item">
    <img class="ui avatar image" src="/images/avatar2/small/rachel.png">
    <div class="content">
      <a class="header">Rachel</a>
      <div class="description">Last seen watching <a><b>Arrested Development</b></a> just now.</div>
    </div>
  </div>
  <div class="item">
    <img class="ui avatar image" src="/images/avatar2/small/lindsay.png">
    <div class="content">
      <a class="header">Lindsay</a>
      <div class="description">Last seen watching <a><b>Bob's Burgers</b></a> 10 hours ago.</div>
    </div>
  </div>
  <div class="item">
    <img class="ui avatar image" src="/images/avatar2/small/matthew.png">
    <div class="content">
      <a class="header">Matthew</a>
      <div class="description">Last seen watching <a><b>The Godfather Part 2</b></a> yesterday.</div>
    </div>
  </div>
  <div class="item">
    <img class="ui avatar image" src="/images/avatar/small/jenny.jpg">
    <div class="content">
      <a class="header">Jenny Hess</a>
      <div class="description">Last seen watching <a><b>Twin Peaks</b></a> 3 days ago.</div>
    </div>
  </div>
  <div class="item">
    <img class="ui avatar image" src="/images/avatar/small/veronika.jpg">
    <div class="content">
      <a class="header">Veronika Ossi</a>
      <div class="description">Has not watched anything recently</div>
    </div>
  </div>
</div>
    </div>
    <br/>
</div>

</body>

</html>