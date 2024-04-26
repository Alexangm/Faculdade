<?php
	require_once("sql.php");
	$bd = new DAOanime();

	$idelenco;

	$result = $bd->buscarElencos();
	
	foreach ($result as $row) {
		foreach($row as $key => $value){
			if($key == "idelenco"){
				$idelenco = $value;
			}
			echo "<h1>$key: $value</h1>";
		}
		echo "<a href=\"detalharDAO.php?idelenco=$idelenco\">Detalhar elenco</a>";
		echo "<br><hr><br>";
	}
	echo "<br><a href=\"index.html\">Voltar</a>";

?>
