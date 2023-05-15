<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<style >
form{background-color: brown;
color: white ; 
margin: 20px;
padding: 20px ; 
}

</style>

<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form>
  <div class="form-row">
    <div class="form-group col-md-6">
      <label for="inputEmail4">name</label>
      <input type="text" class="form-control" id="inputEmail4" placeholder="name">
    </div>
    <div class="form-group col-md-6">
      <label for="inputPassword4">number</label>
      <input type="text" class="form-control" id="inputPassword4" placeholder="number">
    </div>
  </div>
  <div class="form-group">
    <label for="inputAddress">Address</label>
    <input type="text" class="form-control" id="inputAddress" placeholder="Address">
  </div>
  <div class="form-group">
    <label for="inputAddress2">Phone number</label>
    <input type="text" class="form-control" id="inputAddress2" placeholder="phone number">
  </div>
  
  
 
  
  <button type="submit" class="btn btn-primary">Add</button>
</form>
</body>
</html>