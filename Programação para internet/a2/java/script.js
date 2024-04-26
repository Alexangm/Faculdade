function rel(nome, idade, status, peso, tipoSanguineo, sintomas){
	relatorio = [Nome= "nome", Idade= "idade", Status= "status", peso= "Peso", Sangue="tipoSanguineo", Sintomas= "sintomas", PodeDoar="", Risco=""]
	
	if ((idade > 15) && (idade < 70)){
		if(peso > 50){
			if ((sintomas == false) && (status == false){
				relatorio.PodeDoar = true;
			}else{
				relatorio.PodeDoar= false;
			}
		}else{
			relatorio.PodeDoar = false;
		}
	}else{
	 relatorio.PodeDoar = false;
	}

	if (idade<11){
		relatorio.risco= "Baixo";
	}else if((sintomas == true)&&(idade<60){
		relatorio.risco= "Alto";
	}else if ((sintomas == true)&&(idade>60)){
		relatorio.risco= "Muito alto";
	}
	if (sintomas == false){
		relatorio.risco= "Moderado";
	}
	return relatorio;
}