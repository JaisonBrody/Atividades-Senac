public class atividade1{
	public static void main(String[] args) {
		int cateto1=10;
		int cateto2=20;
		double hipotenusa = teoremaPitagoras(cateto1,cateto2);
	}
	private double teoremaPitagoras(int x, int y){
		return Math.sqrt((x*x) + (y*y));
	}
}
