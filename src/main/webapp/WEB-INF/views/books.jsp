<!DOCTYPE html>
<style>
li {list-style: none;}
</style>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
    <body>
        <h1>Books</h1>
        <a href="<c:url value='/books/add' />">Add Books</a>

        <c:if test="${not empty books}">
            <ul>
                <c:forEach var="book" items="${books}">
                    <li>Title:
                        <br>
                        <c:out value="${book.title}" />
                        <br>
                        Author:
                        <br>
                        <c:out value="${book.author}" />
                        <br>
                        Rating: <c:out value="${book.rating}" />"
                    </li>
                </c:forEach>
            </ul>
        </c:if>
        
     </body>
</html>