<?php

	$conn = new PDO("mysql:dbname=dbppi;host=localhost","root","A33536863");

	$stmt = $conn->prepare("DELETE FROM produtos WHERE idproduto = :ID");

	$id = 9;
	$stmt->bindParam(":ID", $id);

	$stmt->execute();

	echo "<h2>Executado</h2>";

?>