<?php
	class DAOanime extends PDO{
		private $conn;

		public function __construct() {
			$this->conn = new PDO("mysql:dbname=dbppi;host=localhost","root","A33536863");
		}

		public function buscarElencos(){
			$stmt = $this->conn->prepare("SELECT * FROM elenco");
			$stmt->execute();
			return $stmt->fetchALL(PDO::FETCH_ASSOC);
		}

		public function buscarElenco($id){
			$stmt = $this->conn->prepare("SELECT * FROM elenco WHERE idelenco=:ID");
			$stmt->bindParam(":ID", $id);
			$stmt->execute();
			return $stmt->fetchALL(PDO::FETCH_ASSOC);
		}


		public function inserirElenco($idanimefk, $diretor, $estudio){
			$stmt = $this->conn->prepare("INSERT INTO elenco(idanimefk, diretor, estudio) VALUES(:IDANIMEFK, :DIRETOR, :ESTUDIO)");
			$stmt->bindParam(":IDANIMEFK", $idanimefk);
			$stmt->bindParam(":DIRETOR", $diretor);
			$stmt->bindParam(":ESTUDIO", $estudio);

			$stmt->execute();
		}

		public function excluirElenco($id){
			$stmt = $this->conn->prepare("DELETE FROM elenco WHERE idelenco=:ID");
			$stmt->bindParam(":ID", $id);
			$stmt->execute();
		}

		public function editarElenco($id, $idanimefk, $diretor, $estudio){
			$stmt = $this->conn->prepare("UPDATE elenco SET idanimefk=:IDANIMEFK, diretor=:DIRETOR, estudio=:ESTUDIO WHERE idelenco=:ID");
			$stmt->bindParam(":IDANIMEFK", $idanimefk);
			$stmt->bindParam(":DIRETOR", $diretor);
			$stmt->bindParam(":ESTUDIO", $estudio);
			$stmt->bindParam(":ID", $id);
			$stmt->execute();
		}
	}

?>





