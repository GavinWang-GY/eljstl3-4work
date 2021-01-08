<%@ page contentType="text/html;charset=utf-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width,initial-scale=1">
    <title>商品列表</title>
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
    <script>
        $(function () {
            
            $("#btnAdd").click(function () {
                $('#dlgForm').modal()
            });
        })
    </script>
</head>

<body>
    <div class="container">
        <div class="row">
            <h1 style="text-align: center">IMOOC商品信息表</h1>
            <div class="panel panel-default">
                <div class="clearfix panel-heading ">
                    <div>
                        <label class="form-inline">
                            <div class="form-group" style="width: 850px;">
                                <button class="btn btn-primary" id="btnAdd">新增
                                </button>
                            </div>
                            <div class="form-group pull-right">
                            	<form action="/good/search" method="post">
                                	<input type="text" class="form-control" id="searchById" name="id" placeholder="根据商品id进行查询">
                                	<button type="submit" class="btn btn-primary">查询</button>
                                </form>
                            </div>
                        </label>
                    </div>
                    <table class="table table-bordered table-hover">
                    
                        <thead>
                            <tr>
                                <th>序号</th>
                                <th>商品编号</th>
                                <th>商品名称</th>
                                <th>商品类别</th>
                                <th>价格</th>
                                <th>备注</th>
                                <th>&nbsp;</th>
                            </tr>
                        </thead>
                        <tbody>
                        	<c:forEach items="${applicationScope.goods }" var="good" varStatus="idx">
                        		<tr>
                        			<td>${dix.index + 1 }</td>
                        			<td>${good.gNo }</td>
                        			<td>${good.gName }</td>
                        			<td>${good.gType }</td>
                        			<td style="color: red;font-weight: bold">￥<fmt:formatNumber value="${good.gPrice }" pattern="0,000.00"></fmt:formatNumber></td>
                        			<td>${good.remark }</td>
                        		</tr>
                        	</c:forEach>
                        </tbody>
                    </table>
                </div>
            </div>
        </div>
        <!-- 表单 -->
        <div class="modal fade" tabindex="-1" role="dialog" id="dlgForm">
            <div class="modal-dialog" role="document">
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span>
                        </button>
                        <h4 class="modal-title">新增商品</h4>
                    </div>
                    <div class="modal-body">
                        <form action="/good/add" method="post">
                            <div class="form-group">
                                <label>商品编号</label>
                                <input type="text" name="goodsId" class="form-control" id="empno" placeholder="请输入商品编号">
                            </div>
                            <div class="form-group">
                                <label>商品名称</label>
                                <input type="text" name="goodsName" class="form-control" id="ename" placeholder="请输入商品名称">
                            </div>
                            <div class="form-group">
                                <label>商品类别</label>
                                <select id="gname" name="goodsType" class="form-control">
                                    <option selected="selected">服装</option>
                                    <option value="家用">家用电器</option>
                                    <option value="生活">生活用品</option>
                                </select>
                            </div>
                            <div class="form-group">
                                <label>价格</label>
                                <input type="text" name="price" class="form-control" id="sal" placeholder="请输入价格">
                            </div>
                            <div class="form-group">
                                <label>备注</label>
                                <input type="text" name="description" class="form-control" id="sal" placeholder="请输入备注">
                            </div>
                            <div class="form-group" style="text-align: center;">
                                <button type="submit" class="btn btn-primary">保存</button>
                            </div>
                        </form>
                    </div>
                </div><!-- /.modal-content -->
            </div><!-- /.modal-dialog -->
        </div><!-- /.modal -->
</body>

</html>