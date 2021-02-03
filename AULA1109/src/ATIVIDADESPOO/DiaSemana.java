package ATIVIDADESPOO;

public enum DiaSemana {
	
	SEGUNDA (1.5),
	TERCA(1.5),
	QUARTA(1.5),
	QUINTA(1.5),
	SEXTA(1.5),
	SABADO(1.7),
	DOMINGO(2.0);
	
	private double taxaHoraExtra;
	
	DiaSemana (double taxaHoraExtra){
		this.taxaHoraExtra = taxaHoraExtra;
	}
	
	public double getTaxaHoraExtra() {
		return taxaHoraExtra;
		
	}
	
	public static DiaSemana getDiaSemana(String diaSemana) {
		switch (diaSemana.toLowerCase()) {
		case "domingo":
		return DiaSemana.DOMINGO;
		case "segunda":
		return DiaSemana.SEGUNDA;
		case "terça":
		return DiaSemana.TERCA;
		case "quarta":
		return DiaSemana.QUARTA;
		case "quinta":
		return DiaSemana.QUINTA;
		case "sexta":
		return DiaSemana.SEXTA;
		case "sabado":
		return DiaSemana.SABADO;
					
		default:
		return DiaSemana.SABADO;
		
		}
		
	}

}
