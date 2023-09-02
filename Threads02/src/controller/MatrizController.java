package controller;

public class MatrizController extends Thread{
	
	private int[] linha;
	private int num;
	
	public MatrizController(int[] linha, int num) {
		this.linha = linha;
		this.num = num;
		
	}

	@Override
	public void run() {
		somalinha(linha);
	}
	private void somalinha(int[] linha2) {
		int soma = 0;
		for (int i : linha) {
			soma += i;
		}
	System.out.println("linha de número: " + num + " com a soma total de " +soma);
	}
	
}
