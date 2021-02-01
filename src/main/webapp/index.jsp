<%--
  Created by IntelliJ IDEA.
  User: khai trinh
  Date: 01/02/2021
  Time: 5:49 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Product Discount Calculator</title>
  </head>
  <body>
  <h2>Product Discount Calculator</h2>
  <form action="/discount" method="post">
    <label>Product Description: </label><br/>
    <input type="text" name="product" placeholder="product"/><br/>
    <label>List Price: </label><br/>
    <input type="number" name="price" placeholder="List Price" value="10"/><br/>
    <label>Discount Percent: </label><br/>
    <input type="number" name="discount" placeholder="Discount Percent" value="0"/><br/>
    <input type="submit" id="submit" value="Calculate Discount">
  </form>
  </body>
</html>
