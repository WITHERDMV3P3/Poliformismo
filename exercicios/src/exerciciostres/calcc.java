package exerciciostres;

class Calculadora {
	 int somar(int a, int b) {
	 return a + b;
	 }
	 double somar(double a, double b) {
	 return a + b;
	 }
	}


public class calcc {
	public static void main(String[] args) {
		 Calculadora calc = new Calculadora();

		 int somaInt = calc.somar(5, 10); // Chama o método com inteiros
		 double somaDouble = calc.somar(3.5, 2.7); // Chama o método com doubles

		 System.out.println("Soma int: " + somaInt); // Saída: 15
		 System.out.println("Soma double: " + somaDouble); // Saída: 6.2

}
