package view;

import controller.MatrizController;

public class Principal {

	public static void main(String[] args) {
		int[][] mat = new int[3][5];
		
		for (int i = 0; i < 3; i++) {
			for(int j = 0; j < 5; j++){
				mat[i][j] = (int) (((Math.random() + 0.01 ) * 100));
			}
		Thread matTH = new MatrizController(mat[i], i);
		matTH.start();
		}
		

	}

}
