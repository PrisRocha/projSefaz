package Metodos;

public class Lampada {

	String modelo;
	String tensao;
	String cor;
	String tipoLuz;
	String[] tipos;
	boolean tipoAbajur;
	double preco;
	int potencia;
	int garantiaMeses;

	boolean ligada;

	void ligar() {
		ligada = true;
	}

	void desligar() {
		ligada = false;
	}

	void mostrarEstado() {
		if (ligada) {
			System.out.println("Lâmpada está ligada");
		} else {
			System.out.println("Lâmpada está desligada");
		}
	}

	void mudarEstado() {
		if (ligada) {
			desligar();
		} else {
			ligar();
		}
	}

}
