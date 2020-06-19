<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<html lang="en">
<head>
    <link href="<c:url value="/resources/css/style.css"/>" rel="stylesheet">
    <script src="<c:url value="/resources/js/jquery-3.5.1.min.js"/>"></script>
    <script src="<c:url value="/resources/js/main.js"/>"></script>
</head>
<body>
<div id="welcome">
	<p id="msg"></p>
</div>
<span id="view">
<input type="button" value="View Ticket" id="viewticket"/>
<input type="button" value="Submit Ticket" id="createticket" onClick="createTicket()"/>
<input type="button" value="Logout" id="logout" onClick="logout()"/>
</span>
</body>
</html>