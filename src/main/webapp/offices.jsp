
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
<head>
    <title>Offices</title>
</head>
<body>
<h1>Office List</h1>
<table>
    <tr>
        <th>Office Code</th>
        <th>City</th>
        <th>Phone</th>
        <th>Address Line 1</th>
        <th>Address Line 2</th>
        <th>State</th>
        <th>Country</th>
        <th>Postal Code</th>
        <th>Territory</th>
    </tr>
    <c:forEach var="office" items="${offices}">
        <tr>
            <td>${office.officeCode}</td>
            <td>${office.city}</td>
            <td>${office.phone}</td>
            <td>${office.addressLine1}</td>
            <td>${office.addressLine2}</td>
            <td>${office.state}</td>
            <td>${office.country}</td>
            <td>${office.postalCode}</td>
            <td>${office.territory}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
