<?php
	class DAOanime extends PDO{
		private $conn;

		public function __construct() {
			$this->conn = new PDO("mysql:dbname=dbppi;host=localhost","root","A33536863");
		}

		public function buscarDubladores(){
			$stmt = $this->conn->prepare("SELECT * FROM dublador");
			$stmt->execute();
			return $stmt->fetchALL(PDO::FETCH_ASSOC);
		}

		public function buscarDublador($id){
			$stmt = $this->conn->prepare("SELECT * FROM dublador WHERE iddublador=:ID");
			$stmt->bindParam(":ID", $id);
			$stmt->execute();
			return $stmt->fetchALL(PDO::FETCH_ASSOC);
		}


		public function inserirDublador($nome, $data_nasc, $idelencofk, $personagem){
			$stmt = $this->conn->prepare("INSERT INTO dublador(nome, data_nasc, idelencofk, personagem) VALUES(:NOME, :DATA_NASC, :IDELENCOFK, :PERSONAGEM)");
			$stmt->bindParam(":NOME", $nome);
			$stmt->bindParam(":DATA_NASC", $data_nasc);
			$stmt->bindParam(":IDELENCOFK", $idelencofk);
			$stmt->bindParam(":PERSONAGEM", $personagem);

			$stmt->execute();
		}

		public function excluirDublador($id){
			$stmt = $this->conn->prepare("DELETE FROM dublador WHERE iddublador=:ID");
			$stmt->bindParam(":ID", $id);
			$stmt->execute();
		}

		public function editarDublador($id, $nome, $data_nasc, $idelencofk, $personagem){
			$stmt = $this->conn->prepare("UPDATE dublador SET nome=:NOME, data_nasc=:DATA_NASC, idelencofk=:IDELENCOFK, personagem=:PERSONAGEM  WHERE iddublador=:ID");
			$stmt->bindParam(":ID", $id);
			$stmt->bindParam(":NOME", $nome);
			$stmt->bindParam(":DATA_NASC", $data_nasc);
			$stmt->bindParam(":IDELENCOFK", $idelencofk);
			$stmt->bindParam(":PERSONAGEM", $personagem);
			$stmt->execute();
		}

		public function nomeDublador($nome){
			$stmt = $this->conn->prepare("SELECT * FROM dublador WHERE nome=:NOME");
			$stmt->bindParam(":NOME", $nome);
			$stmt->execute();
			return $stmt->fetchALL(PDO::FETCH_ASSOC);
		}

	}

?>





