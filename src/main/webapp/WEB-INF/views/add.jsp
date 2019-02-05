<!DOCTYPE html>
<style>
li {list-style: none;}
</style>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
    <body>
        <h1>Add Book</h1>

        <form:form method="post" modelAttribute="bookForm" action="${pageContext.request.contextPath}/books">
            <ul>
                <li>Title:&nbsp;&nbsp;&nbsp;&nbsp;
                    <form:input path="title" type="text" /></li>
                <li>Author: <form:input path="author" type="text" /></li>
                <li>Rating: <form:radiobuttons path="rating" /></li>
                <button type="submit">Add</button>
            </ul>
    </form:form>
    </body>
</html>