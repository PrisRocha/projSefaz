package ATIVIDADESPOO;

public class RegistroPonto {
	
	private DiaSemana diaSemana;
	private int horaExtra;
	private int horaSaida;
	private int horaEntrada;
	private double valorHora;
	public DiaSemana getDiaSemana() {
	return diaSemana;}
		
	public RegistroPonto (DiaSemana diaSemana, int horaEntrada, int horaSaida, double valorHora) {
	super();
	this.diaSemana = diaSemana;
	this.horaEntrada = horaEntrada;
	this.horaSaida = horaSaida;
	this.valorHora = valorHora;
	
	}
	public double calculaValorHora() {
	int totalHorasTrabalhadas = horaSaida - horaEntrada;
	double valorHoraTrabalhada = 0;
	if (totalHorasTrabalhadas <=8) {
		valorHoraTrabalhada = totalHorasTrabalhadas* valorHora;
	}else {
	double valorHoraNormal = 8 * valorHora;
	int horaExtra = totalHorasTrabalhadas -8;
	double valorHoraExtra = horaExtra * valorHora * diaSemana.getTaxaHoraExtra();
	valorHoraTrabalhada = valorHoraNormal+valorHoraExtra;
	}
	return valorHoraTrabalhada;
	}
	public void setDiaSemana(DiaSemana diaSemana) {
		this.diaSemana = diaSemana;
	}
	public int getHoraExtra() {
		return horaExtra;
	}
	public void setHoraExtra(int horaExtra) {
		this.horaExtra = horaExtra;
	}
	public int getHoraSaida() {
		return horaSaida;
	}
	public void setHoraSaida(int horaSaida) {
		this.horaSaida = horaSaida;
	}
	public double getValorHora() {
		return valorHora;
	}
	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}
	
	

}
