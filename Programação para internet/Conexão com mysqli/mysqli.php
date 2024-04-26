<?php
	$conn = new mysqli('localhost', 'root', 'A33536863', 'dbppi');

	if($conn->connect_error){
		echo "<h1>Não foi possível conectar ao DB!</h1>";
		echo "<h2>Erro: ".$conn->connect_error."</h2>";
	}else{
		echo "<h1>Conexão efetuada com sucesso!</h1>";
	}

?>