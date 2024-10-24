<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
  <title>Member List</title>
</head>
<body>
<div class="container mt-5">
  <h2 class="mb-4">Member List</h2>
  <table class="table table-bordered">
    <thead class="thead-light">
    <tr>
      <th>ID</th>
      <th>Number d'Adhésion</th>
      <th>Nom</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="membre" items="${list}">
      <tr>
        <td>${membre.id}</td>
        <td>${membre.adhesionNumber}</td>
        <td>${membre.firstname}</td>
      </tr>
    </c:forEach>
    </tbody>
  </table>
</div>
</body>
</html>
