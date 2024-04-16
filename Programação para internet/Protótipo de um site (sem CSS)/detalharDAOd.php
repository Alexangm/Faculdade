<?php
	require_once("sql.php");
	$bd = new DAOanime();
	
	$id = $_GET["iddublador"];

	$result = $bd->buscarDublador($id);

	foreach ($result as $row) {
		foreach($row as $key => $value){
			echo "<h1>$key: $value</h1>";
		}
		echo "<br><hr><br>";
	}
	echo "<br><a href=\"readDAOd.php\">Voltar</a>";

?>