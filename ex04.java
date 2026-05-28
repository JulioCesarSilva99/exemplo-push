package exercicios10;

public class ex04 {
	
	public static void main(String[] args) {
		
		Computador c1 = new Computador("Ryzen 5 5600", false);
		
		Notebook n1 = new Notebook("MacBook", 5, true);
		
		System.out.println(c1.ligar());
		
		System.out.println(c1.obterStatus());
		
		
		System.out.println(n1.ligar());
		
		System.out.println(n1.obterStatus());
		
	}
}
