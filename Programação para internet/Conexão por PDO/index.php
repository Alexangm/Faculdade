<?php
	require_once("sql.php");

	$bd = new Bd();
	$produtos = $bd->buscarProdutos();


	//var_dump($produtos);

	foreach($produtos as $row){
		foreach($row as $key => $value){
			echo "<h1>$key: $value</h1>";			
		}
		echo "<br><hr><br>";
	}
?>


<br><br><br>
<form action="criarDAO.php" method="post">
	<label>Marca:</label><input type="text" name="marca"><br>
	<label>Nome:</label><input type="text" name="nome"><br>
	<label>Valor:</label><input type="text" name="valor"><br>
	<input type="submit" name="Cadastrar">


</form>