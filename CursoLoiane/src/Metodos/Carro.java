package Metodos;

public class Carro {

	String marca;
	String modelo;
	String numPassageiros;
	double capCombustivel;
	double consumoCombustivel;
	
	void exibirAutonomia () {
		
	System.out.println("A autonomia do carro �: "+ capCombustivel *consumoCombustivel + "km");
		
	}	
	double obterAutonomia() {
		System.out.println("M�todo obter autonomia foi chamado.");
		return capCombustivel * consumoCombustivel;
	}
	
	double calcularCombustivel (double km) {
		double qtdCombustivel = km/consumoCombustivel;
		return qtdCombustivel;
	}
}
