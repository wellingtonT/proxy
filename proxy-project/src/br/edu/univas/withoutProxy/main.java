package br.edu.univas.withoutProxy;

public class main {

	public static void main(String[] args) {
		RealImage image = new RealImage("test_10mb.jpg");
		
		image.display(); // Aqui vai carregar do disco
		System.out.println("");
		image.display(); // Aqui vai carregar do disco
	}

}
