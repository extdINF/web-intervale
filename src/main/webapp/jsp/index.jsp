<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
    <head>
        <title>Title</title>
        <link rel="stylesheet" href="${pageContext.request.contextPath}/css/reset.css">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/css/styles.css">
    </head>
    <body>
        <div class="header">Header</div>
        <div class="categories-container">
            <c:forEach items="${categories}" var="category">
                <div class="category ${category.name}" data-category-name="${category.name}" data-category-title="${category.title}">
                    <div id="${category.name}" class="category-image"> </div>
                    <div class="category-title">
                            ${category.title}
                    </div>
                </div>
            </c:forEach>
        </div>
        <div class="payment-category-label">Popular</div>
        <div class="payments-container">
            <div class="payments popular" data-category-name="popular" data-category-title="Популярные">
                <c:forEach items="${payments}" var="payment">
                    <div class="payment">
                        <div id="${payment.id}" class="payment-image"> </div>
                        <div class="payment-title">
                                ${payment.title}
                        </div>
                    </div>
                </c:forEach>
            </div>
            <c:forEach items="${categories}" var="category">
                <div class="payments ${category.name} hidden" data-category-name="${category.name}" data-category-title="${category.title}">
                    <c:forEach items="${category.payments}" var="payment">
                        <div class="payment">
                            <div id="${payment.id}" class="payment-image"> </div>
                            <div class="payment-title">
                                ${payment.title}
                            </div>
                        </div>
                    </c:forEach>
                </div>
            </c:forEach>
        </div>
        <div class="footer">Footer</div>

        <script defer src="${pageContext.request.contextPath}/js/jquery-3.1.1.js"></script>
        <script defer src="${pageContext.request.contextPath}/js/scripts.js"></script>
    </body>
</html>
