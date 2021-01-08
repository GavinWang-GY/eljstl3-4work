<%@ page contentType="text/html;charset=utf-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width,initial-scale=1">
    <title>商品信息</title>
    <link href="css/bootstrap.css" type="text/css" rel="stylesheet">
    </link>
    <script type="text/javascript" src="js/jquery-1.11.1.min.js"></script>
    <script type="text/javascript" src="js/bootstrap.js"></script>
    <style type="text/css">
    .pagination {
        margin: 0px
    }

    .pagination>li>a,
    .pagination>li>span {
        margin: 0 5px;
        border: 1px solid #dddddd;
    }

    .glyphicon {
        margin-right: 3px;
    }

    .form-control[readonly] {
        cursor: pointer;
        background-color: white;
    }

    #dlgPhoto .modal-body {
        text-align: center;
    }

    .preview {
        max-width: 500px;
    }
    </style>
</head>

<body>
    <button class="btn btn-primary" style="margin-left: 30px; margin-top: 40px;" onclick="javascript:history.back(-1);">返回</button>
    <div class="container">
        <div class="row">
            <h1 style="text-align: center">IMOOC商品信息表</h1>
            <table class="table table-bordered table-hover">
                <thead>
                    <tr>
                        <th>商品编号</th>
                        <th>商品名称</th>
                        <th>商品类别</th>
                        <th>价格</th>
                        <th>备注</th>
                        <th>&nbsp;</th>
                    </tr>
                </thead>
                <tbody>
                	<c:forEach var="good" items="${applicationScope.searchList}" varStatus="idx">
                		<tr>
                        <td>${good.gNo }</td>
                        <td>${good.gName }</td>
                        <td>${good.gType }</td>
                        <td style="color: red; font-weight: bold">￥<fmt:formatNumber value="${good.gPrice }" pattern="0,000.00"></fmt:formatNumber>
                        <td>${good.remark }</td>
                        </td>
                    </tr>
                	</c:forEach>

                </tbody>
            </table>
        </div>
    </div>
    </div>
</body>

</html>