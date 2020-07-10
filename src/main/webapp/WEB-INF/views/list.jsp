<%--
  Created by IntelliJ IDEA.
  User: YLxia
  Date: 2020/7/8
  Time: 21:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>员工列表</title>
    <%
        //设置一个项目路径,便于下面简化写法:/curd
        pageContext.setAttribute("APP_PATH", request.getContextPath());
    %>
    <!-- web路径：
    不以/开始的相对路径，找资源，以当前资源的路径为基准，经常容易出问题。
    以/开始的相对路径，找资源，以服务器的路径为标准(http://localhost:3306)；需要加上项目名
            http://localhost:3306/crud
     -->
    <script type="text/javascript"
            src="${APP_PATH }/static/js/jquery-3.5.1.js"></script>
    <link
            href="${APP_PATH }/static/bootstrap-3.3.7-dist/css/bootstrap.min.css"
            rel="stylesheet">
    <script
            src="${APP_PATH }/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
</head>
<body>
<!--设置显示页面,整个页面是在一个容器中.-->
<div class="container-fluid">
    <!--这个页面分为四排-->
    <%--标题--%>
    <div class="row">
        <div class="col-md-12">
            <h1>SSM-CURD</h1>
        </div>
    </div>
    <%--按钮--%>
    <div class="row">
        <div class="col-md-4 col-md-offset-8">
            <button class="btn btn-primary">新增</button>
            <button class="btn btn-danger">删除</button>
        </div>
    </div>
    <%--表格--%>
    <div class="row">
        <div class="col-md-12">
            <table class="table table-hover">
                <tr>
                    <th>#</th>
                    <th>empName</th>
                    <th>gender</th>
                    <th>email</th>
                    <th>deptName</th>
                    <th>操作</th>
                </tr>
                <%--pageInfo中有一个list,直接取出--%>
                <c:forEach items="${pageInfo.list }" var="emp">
                    <tr>
                        <th>${emp.empId }</th>
                        <th>${emp.empName }</th>
                        <th>${emp.gender=="男"?"男":"女" }</th>
                        <th>${emp.email }</th>
                        <th>${emp.dept.deptName }</th>
                        <th>
                            <button class="btn btn-primary btn-sm">
                                    <%--钮图标--%>
                                <span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>
                                编辑
                            </button>
                            <button class="btn btn-danger btn-sm">
                                <span class="glyphicon glyphicon-trash" aria-hidden="true"></span>
                                删除
                            </button>
                        </th>
                    </tr>
                </c:forEach>
            </table>
        </div>
    </div>
    <%--分页条--%>
    <div class="row">
        <div class="col-lg-6">
            当前${pageInfo.pageNum}页,总${pageInfo.pages}页,总${pageInfo.total}条记录
        </div>

        <!-- 分页条信息 -->
        <div class="col-md-6">
            <nav aria-label="Page navigation">
                <ul class="pagination">
                    <li><a href="${APP_PATH }/emps?pn=1">首页</a></li>
                    <%--如果已经是第一页,就不能在点前一页--%>
                    <c:if test="${pageInfo.hasPreviousPage }">
                        <li><a href="${APP_PATH }/emps?pn=${pageInfo.pageNum-1}"
                               aria-label="Previous"> <span aria-hidden="true">&laquo;</span>
                        </a></li>
                    </c:if>


                    <c:forEach items="${pageInfo.navigatepageNums }" var="page_Num">
                        <%--如果--%>
                        <c:if test="${page_Num == pageInfo.pageNum }">
                            <li class="active"><a href="#">${page_Num }</a></li>
                        </c:if>
                        <c:if test="${page_Num != pageInfo.pageNum }">
                            <li><a href="${APP_PATH }/emps?pn=${page_Num }">${page_Num }</a></li>
                        </c:if>
                    </c:forEach>
                    <%--如果已经是最后一页,就不能点击下一页--%>
                    <c:if test="${pageInfo.hasNextPage }">
                        <li><a href="${APP_PATH }/emps?pn=${pageInfo.pageNum+1 }"
                               aria-label="Next"> <span aria-hidden="true">&raquo;</span>
                        </a></li>
                    </c:if>
                    <li><a href="${APP_PATH }/emps?pn=${pageInfo.pages}">末页</a></li>
                </ul>
            </nav>
        </div>
    </div>
</div>
</body>
</html>
