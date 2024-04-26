<?php
	require_once("sql.php");
	$bd = new DAOanime();
	
	$id = $_GET["idanime"];

	$result = $bd->buscarAnime($id);

	foreach ($result as $row) {
		foreach($row as $key => $value){
			echo "<h1>$key: $value</h1>";
		}
		echo "<br><hr><br>";
	}
	echo "<br><a href=\"readDAO.php\">Voltar</a>";

?>