<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="content-type" content="text/html; charset=UTF-8"/>
    <link href="../../css/demo.css" rel="stylesheet" type="text/css">
    <script src="../../scripts/boot.js" type="text/javascript"></script>
</head>
<body id="body1" style="background-color: #e5edef;color: #0069ab">

<h1>首页</h1>

</body>

<script type="text/javascript">
    mini.parse();

    top["firstPage"]=window;

    function changebodybccolor() {
        // 获取父页面背景颜色
        $("#body1").css({'background-color': window.parent.parentbccolor});
    }
    changebodybccolor();

</script>
</html>
