<?php
	class DAOanime extends PDO{
		private $conn;

		public function __construct() {
			$this->conn = new PDO("mysql:dbname=dbppi;host=localhost","root","A33536863");
		}

		public function buscarAnimes(){
			$stmt = $this->conn->prepare("SELECT * FROM anime");
			$stmt->execute();
			return $stmt->fetchALL(PDO::FETCH_ASSOC);
		}

		public function buscarAnime($id){
			$stmt = $this->conn->prepare("SELECT * FROM anime WHERE idanime=:ID");
			$stmt->bindParam(":ID", $id);
			$stmt->execute();
			return $stmt->fetchALL(PDO::FETCH_ASSOC);
		}


		public function inserirAnime($nome, $genero, $ano, $sinopse){
			$stmt = $this->conn->prepare("INSERT INTO anime(nome, genero, ano, sinopse) VALUES(:NOME, :GENERO, :ANO, :SINOPSE)");
			$stmt->bindParam(":NOME", $nome);
			$stmt->bindParam(":GENERO", $genero);
			$stmt->bindParam(":ANO", $ano);
			$stmt->bindParam(":SINOPSE", $sinopse);

			$stmt->execute();
		}

		public function excluirAnime($id){
			$stmt = $this->conn->prepare("DELETE FROM anime WHERE idanime=:ID");
			$stmt->bindParam(":ID", $id);
			$stmt->execute();
		}

		public function editarAnime($id, $nome, $genero, $ano, $sinopse){
			$stmt = $this->conn->prepare("UPDATE anime SET nome=:NOME, genero=:GENERO, ano=:ANO, sinopse=:SINOPSE WHERE idanime=:ID");
			$stmt->bindParam(":NOME", $nome);
			$stmt->bindParam(":GENERO", $genero);
			$stmt->bindParam(":ANO", $ano);
			$stmt->bindParam(":SINOPSE", $sinopse);
			$stmt->bindParam(":ID", $id);
			$stmt->execute();
		}

		public function buscarNome($nome){
			$stmt = $this->conn->prepare("SELECT * FROM anime WHERE nome=:NOME");
			$stmt->bindParam(":NOME", $nome);
			$stmt->execute();
			return $stmt->fetchALL(PDO::FETCH_ASSOC);
		}



	}

?>





