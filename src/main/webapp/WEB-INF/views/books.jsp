<!DOCTYPE html>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css">

<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

<!-- Popper JS -->
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.6/umd/popper.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.2.1/js/bootstrap.min.js"></script>

<style>
li {list-style: none;}
.book {width: 50%; background-color: rgba(0,0,0,.3); border: blueviolet;}
</style>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
    <body>
        <h1>Books</h1>
        <a href="<c:url value='/books/add' />" class="btn btn-primary">Add Books</a>

        <c:if test="${not empty books}">
            <ul>
                <div class="book">
                    <c:forEach var="book" items="${books}">
                            <div class="card" style="width: 18rem;">
                                    <img class="card-img-top" src="..." alt="Card image cap">
                                    <div class="card-body">
                                        <h5 class="card-title"><c:out value="${book.title}" /></h5>
                                        <p class="card-text">
                                            <ul>
                                                <li>Author:<c:out value="${book.author}" /></li>
                                                <li>Rating: <c:out value="${book.rating}" /></li>
                                            </ul>
                                        </p>
                                        <form:form method="post" modelAttribute="bookForm" action="${pageContext.request.contextPath}/books">
                                            <form:select path="bookStatus">
                                                <form:option value="0" label="Select" />
                                                <form:options items="${bookStatus}" />
                                            </form:select>
                                            <button type="submit">Edit</button>
                                        </form:form>
                                    </div>
                                </div>
                            <hr>
                    </c:forEach>
                </div>
            </ul>
        </c:if>
        
     </body>
</html>