<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" import="java.util.*, java.lang.*"%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<head>
</head>
<body>
	<table>
		<tr>
			<th>Titolo</th>
			<th>Autore</th>
			<th>Prezzo</th>
			<th>Numero pagine</th>
		</tr>
		<c:forEach var="libro" items="${libri}">
			<tr>
				<td><c:out value='${libro.titolo}'></c:out></td>
				<td><c:out value='${libro.autore}'></c:out></td>
				<td><c:out value='${libro.prezzo}'></c:out></td>
				<td><c:out value='${libro.nump}'></c:out></td>
			</tr>
		</c:forEach>
	</table>
</body>