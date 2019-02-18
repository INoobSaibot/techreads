<!DOCTYPE html>


<style>
li {list-style: none;}
</style>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
    <body>
        <h1>Edit Book</h1>

        <form:form method="post" modelAttribute="bookForm" action="${pageContext.request.contextPath}/books/edit">
            <ul>
                <li>Title:&nbsp;&nbsp;&nbsp;&nbsp;
                    <form:input path="title" type="text" /></li>
                <li>Author: <form:input path="author" type="text" /></li>
                <li>Rating: <form:radiobuttons path="rating" /></li>
                <li>id: <form:input path="id" /></li>
                <form:select path="bookStatus">
                    <form:option value="WANT_TO_READ" label="Select" />
                    <form:options items="${bookStatus}" />
                </form:select>
                <button type="submit">Edit</button>
            </ul>
    </form:form>
    </body>
</html>