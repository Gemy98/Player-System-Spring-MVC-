<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="fo" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html>
<html>
<head>
<title>Insert title here</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/mystyle.css">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<meta charset="UTF-8">
</head>
<body>
<fo:form action="" modelAttribute="Player">
  <div class="form-row">
    <div class="form-group col-md-6">
      <label for="inputEmail4">name</label>
      <fo:input path="" class="form-control" placeholder="name" />
    </div>
    <div class="form-group col-md-6">
      <label for="inputPassword4">number</label>
      <fo:input path="" class="form-control"  placeholder="number" />
    </div>
  </div>
  <div class="form-group">
    <label for="inputAddress">Address</label>
    <fo:input path=""  class="form-control" placeholder="Address" />
  </div>
  <div class="form-group">
    <label for="inputAddress2">Phone number</label>
    <fo:input path="" class="form-control" placeholder="phone number" />
  </div>
  
  
 
  
  <button type="submit" class="btn btn-primary">Add</button>
</fo:form>


</body>
</html>