<?php
	require_once("sql.php");
	$bd = new DAOanime();
	
	$id = $_GET["idanime"];

	$result = $bd->buscarAnime($id);

	foreach ($result as $row) {
		foreach($row as $key => $value){
			if($key == "idanime"){
				echo "<br>";
			}else if($key=="sinopse"){
				echo "<h2>$value</h2>";
			}else{
				echo "<h3>$value</h3>";
			}
		}
		echo "<br><hr><br>";
	}
	echo "<br><a href=\"readDAOa.php\">Voltar</a>";

?>
