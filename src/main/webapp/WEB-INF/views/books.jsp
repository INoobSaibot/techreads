<!DOCTYPE html>
<style>
li {list-style: none;}
.book {width: 50%; background-color: rgba(0,0,0,.3); border: blueviolet;}
</style>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
    <body>
        <h1>Books</h1>
        <a href="<c:url value='/books/add' />">Add Books</a>

        <c:if test="${not empty books}">
            <ul>
                <div class="book">
                    <c:forEach var="book" items="${books}">
                            <ul>    
                                <li>Title:<c:out value="${book.title}" /></li>
                                <li>Author:<c:out value="${book.author}" /></li>
                                <li>Rating: <c:out value="${book.rating}" /></li>
                            </ul>
                            <hr>
                    </c:forEach>
                </div>
            </ul>
        </c:if>
        
     </body>
</html>