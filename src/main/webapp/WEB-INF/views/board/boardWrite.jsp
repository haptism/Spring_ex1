<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Board Write Page</h1>
	<form action="./boardWrite" method="post">
		<input type="text" name="num">
		<input type="text" name="writer">
		<input type="text" name="title">
		<textarea rows="" cols="" name="contents"></textarea>
		<p>
			<input type="checkbox" name="check" value="v1">
			<input type="checkbox" name="check" value="v2">
			<input type="checkbox" name="check" value="v3">
			<input type="checkbox" name="check" value="v4">
		</p>
		
		<button>CLICK</button>
	</form>

</body>
</html>