package OrientacaoObjetos;

public class TesteLampada {

	public static void main(String[] args) {
		
		Lampada lampada = new Lampada();
		lampada.modelo = "A30";
		lampada.tensao = "Bivolt";
		lampada.garantiaMeses = 35;
		lampada.potencia = 7;
		lampada.cor = "Amarela";
		lampada.tiposAbajur = true;
		
		lampada.tipos = new String[5];
		lampada.tipos [0] = "abajur";
		lampada.tipos [1] = "lampeoes";

	}

}
