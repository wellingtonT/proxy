package br.edu.univas.withProxy;

public class main {

	public static void main(String[] args) {
		Image image = new ProxyImage("test_10mb.jpg");
		image.display(); // Aqui ele vai carregar do disco
		System.out.println("");
		image.display(); // Aqui ele não vai carregar do disco
	}

}
