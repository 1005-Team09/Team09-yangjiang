
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <title>机动车进入特殊厂房许可</title>
    <meta http-equiv="content-type" content="text/html;charset=UTF-8">
    <link href="../../../css/demo.css" rel="stylesheet" type="text/css"/>
    <script src="../../../scripts/boot.js" type="text/javascript"></script>
    <style type="text/css">

        table {
            width: 100%;
            height: auto;
            border: 0px solid #ffffff;
            border-collapse: collapse;
            padding: 0px;
        }

        .trTitle {

            background-color: #d2f0f0;

        }

        td{
            border: 1px solid #CBE4EC;
            border-collapse: collapse;
            padding: 0px;
            background-color: #F0F8FA;
        }
        .title {
            width: 10%;
            height: 40px;
            text-align: center;
        }

        .td80 {
            background-image: -moz-linear-gradient(top, #F0F8FA, #D3EAF8);
            padding: 5px;
            padding-right: 25px;
        }

        div {
            background-color: #d2f0f0;
        }

        #button {
            float: right;
        }
    </style>
</head>
<body style="margin: 0">

<table class="form-table">
    <tr>
        <td colspan="6" class="td80">
            <img src="../../../img/minus3.png" style="width: 15px;height: 15px;cursor: pointer" id="searchimg" onclick="searchHideOrShow()"/>
            <span>基本信息</span>
        </td>
    </tr>
    <tr class="trTitle" id="searchtr1">
        <td class="title">编号</td>
        <td><input class="mini-textarea" style="width:100%;height:30px;" value="" name=""/></td>
        <td class="title">申请人</td>
        <td><input class="mini-textarea" style="width:100%;height:30px;" value="" name=""/></td>
    </tr>
    <tr class="trTitle" id="searchtr2">
        <td class="title">厂房名称</td>
        <td><input class="mini-textarea" style="width:100%;height:30px;" value="" name=""/></td>
        <td class="title">厂房地点</td>
        <td><input class="mini-textarea" style="width:100%;height:30px;" value="" name=""/></td>
    </tr>
    <tr class="trTitle" id="searchtr3">
        <td class="title">进入时间</td>

        <td><input class="mini-textarea" style="width:100%;height:30px;" value="" name=""/></td>
        <td class="title">退出时间</td>
        <td><input class="mini-textarea" style="width:100%;height:30px;" value="" name=""/></td>
    </tr>
    <tr class="trTitle" id="searchtr4">
        <td class="td1">车型</td>
        <td colspan="3">
            <p style="float: left"><input type="radio" value="大型车(大于4500kg)" name="carsize" >大型车(大于4500kg)</p>
            <p style="float: left"><input type="radio" value="小型车(小于4500kg)" name="carsize" style="float: left">小型车(小于4500kg)</p>
            <p style="float: left"><input type="radio" value="叉车" name="carsize" style="float: left">叉车</p>
            <p style="float: left"><input type="radio" value="铲车" name="carsize" style="float: left">铲车</p>
            <p style="float: left"><input type="radio" value="电瓶车" name="carsize" style="float: left">电瓶车</p>
            <p style="float: left"><input type="radio" value="其他" name="carsize" style="float: left">其他</p>
            <p style="float: left"><input type="text"></p>
        </td>
    </tr>
    <tr class="trTitle" id="searchtr5">
        <td class="td1">工作内容</td>
        <td><input class="mini-textarea" style="width:100%;height:30px;" value="" name=""/></td>
    </tr>
    <tr class="trTitle" id="searchtr6">
        <td class="td1">安全措施</td>
        <td><input class="mini-textarea" style="width:100%;height:30px;" value="" name=""/></td>
    </tr>
</table>

<table class="form-table">
    <tr>
        <td colspan="6" class="td80">
            <img src="../../../img/minus3.png" style="width: 15px;height: 15px;cursor: pointer" id="searchimg1" onclick="searchHideOrShow1()"/>
            <span>申请单位信息</span>
        </td>
    </tr>
    <tr class="trTitle" id="searchtr7">
        <td class="title">申请单位</td>
        <td><input class="mini-textarea" style="width:100%;height:30px;" value="" name=""/></td>
        <td class="title">单位负责人</td>
        <td><input class="mini-textarea" style="width:100%;height:30px;" value="" name=""/></td>
    </tr>
    <tr class="trTitle" id="searchtr8">
        <td class="title">申请单位负责人联系方式</td>
        <td><input class="mini-textarea" style="width:100%;height:30px;" value="" name=""/></td>
        <td class="title">驾驶员</td>
        <td>
            <input class="mini-textarea" style="width:100%;height:30px;" value="" name=""/>
        </td>
    </tr>
    <tr class="trTitle" id="searchtr9">
        <td class="td1">补充要求</td>
        <td colspan="4" class="td2"><input class="mini-textarea" style="width: 100%;height: 30px"/></td>
        <td class="td3">&nbsp;</td>
    </tr>
</table>
<table class="form-table">
    <td colspan="6" class="td80">
        <img src="../../../img/minus3.png" style="width: 15px;height: 15px;cursor: pointer"
             id="searchimg2" onclick="searchHideOrShow2()"/>
        <span>审批意见</span>
    </td>
    <tr class="trTitle" id="searchtr10">
        <td class="title">审批意见</td>
        <td>
            <input class="mini-textarea" style="width:100%;height:100px;" value="" name=""/>
        </td>
        <td class="title">常用词条</td>
        <td>
            <input class="mini-textarea" style="width:100%;height:100px;" value="" name=""/>
        </td>
    </tr>
</table>
<div id="button">
    <a href="" class="mini-button" iconCls="icon-no" onclick="">驳回</a>
    <a href="" class="mini-button" iconCls="icon-addfolder" onclick="">通过</a>
</div>


<script>
    /* 加载mini组件，后面的get方法才好用 */
    mini.parse();

    /* 审批(部门经理)点击事件 */
    function onButtonEdit(e) {
        var btnEdit = this;
        mini.open({
            url: "/selectDepWindow",
            title: "选择项目申报单位",
            width: 650,
            height: 380,
            ondestroy: function (action) {
                //if (action == "close") return false;
                if (action == "ok") {
                    var iframe = this.getIFrameEl();
                    var data = iframe.contentWindow.GetData();
                    data = mini.clone(data);    //必须
                    if (data) {
                        btnEdit.setValue(data.id);
                        btnEdit.setText(data.name);
                    }
                }

            }
        });
    }

    // 查询伸缩
    var flagHideOrShow = true;
    function searchHideOrShow() {
        if (flagHideOrShow) {
            $("#searchtr1").hide();
            $("#searchtr2").hide();
            $("#searchtr3").hide();
            $("#searchtr4").hide();
            $("#searchtr5").hide();
            $("#searchtr6").hide();
            $("#searchimg").attr("src", "../../../img/plus3.png");
            flagHideOrShow = false;
        } else {
            $("#searchtr1").show();
            $("#searchtr2").show();
            $("#searchtr3").show();
            $("#searchtr4").show();
            $("#searchtr5").show();
            $("#searchtr6").show();
            $("#searchimg").attr("src", "../../../img/minus3.png");
            flagHideOrShow = true;
        }
    }

    function searchHideOrShow1() {
        if (flagHideOrShow) {
            $("#searchtr7").hide();
            $("#searchtr8").hide();
            $("#searchtr9").hide();
            $("#searchimg1").attr("src", "../../../img/plus3.png");
            flagHideOrShow = false;
        } else {
            $("#searchtr7").show();
            $("#searchtr8").show();
            $("#searchtr9").show();
            $("#searchimg1").attr("src", "../../../img/minus3.png");
            flagHideOrShow = true;
        }
    }
    function searchHideOrShow2() {
        if (flagHideOrShow) {
            $("#searchtr10").hide();
            $("#searchimg1").attr("src", "../../../img/plus3.png");
            flagHideOrShow = false;
        } else {
            $("#searchtr10").show();
            $("#searchimg1").attr("src", "../../../img/minus3.png");
            flagHideOrShow = true;
        }
    }


</script>

</body>
</html>
