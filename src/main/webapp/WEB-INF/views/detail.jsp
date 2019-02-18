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
        <h1>Book details</h1>

        ${details.title}
        
        <c:if test="${not empty details}">
            <ul>
                <div class="book">

                            <div class="card" style="width: 18rem;">
                                    <img class="card-img-top" src="..." alt="Card image cap">
                                    <div class="card-body">
                                        <h5 class="card-title"><c:out value="${details.title}" /></h5>
                                        <p class="card-text">
                                            <ul>
                                                <li>Author:<c:out value="${details.author}" /></li>
                                                <li>Rating: <c:out value="${details.rating}" /></li>
                                            </ul>
                                       
                                            <a href="/books/edit${details.id}" class="btn btn-primary">Edit This Book</a>

       
                                    </div>
                                </div>
                            <hr>
                 
                </div>
            </ul>
        </c:if>
        
     </body>
</html>