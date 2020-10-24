import java.util.Scanner;

public class Triangulo {
	public Scanner leitor = new Scanner(System.in);
	private int Ladoa;
	private int Ladob;
	private int Ladoc;
	
	public Triangulo() {
		gravaLados();
		calculaTriangulo();
	}

	public void gravaLados() {
		System.out.printf("Digite o Lado A: ");
		Ladoa = leitor.nextInt();
		System.out.printf("Digite o Lado B: ");
		Ladob = leitor.nextInt();
		System.out.printf("Digite o Lado C: ");
		Ladoc = leitor.nextInt();
	}

	public void calculaTriangulo() {
		if ((Ladoa + Ladob) > Ladoc) {
			System.out.println("ele é um triangulo");
		} else
			System.out.println("ele não é um triangulo");
	}
}