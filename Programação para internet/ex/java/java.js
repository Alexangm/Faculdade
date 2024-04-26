var paciente1 = ["Pedro Roberto", 90, "147.258.369-45", "O+", 0, 0, 1]
var paciente2 = ["João Menezes", 29, "142.241.333-12", "AB+", 0, 1, 0]
var paciente3 = ["Maria Cristalba", 22, "111.258.339-45", "A-", 1, 0, 0]
var paciente4 = ["Josefa Coimbra", 31, "147.258.369-45", "AB-", 1, 0, 1]
var paciente5 = ["Urgelita da Silva", 9, "111.222.333-44", "A+", 0, 0 , 0]
var paciente6 = ["Maria Golçaves", 3, "999.777.666-55", "A+", 1, 1, 1]
var pacientes = [ paciente1, paciente2, paciente3, paciente4, paciente5, paciente6]
var relatorio = []

for(var i=0; i<6; i++){
		if(pacientes[i][4] + pacientes[i][5] + pacientes[i][6] == 0){
	relatorio = " O paciente está saudável.";
	}else if(pacientes[i][4]==1){
	relatorio = " O paciente tem gripe";
		if (pacientes[i][5]==1){
		relatorio = relatorio + " e desidratação";
		}
		if(pacientes[i][6]==1){
		relatorio = relatorio + " e tuberculose";
		}
		relatorio = relatorio + ".";
 	}else if(pacientes[i][5]==1){
			relatorio = " O paciente tem desidratação";
			if(pacientes[i][6]==1){
				relatorio = relatorio + " e tuberculose";
			}
		relatorio = relatorio + ".";
	}else if(pacientes[i][6]==1){
		relatorio = relatorio + " O paciente tem tuberculose.";
	}
	document.write("<h4>" + "Paciente: " + pacientes[i][0] + "; Tem " + pacientes[i][1] + " anos de idade; CPF: " + pacientes[i][2] + ". Tipo sanguíneo: " + pacientes[i][3] + "." + relatorio + "</h4>");
}
