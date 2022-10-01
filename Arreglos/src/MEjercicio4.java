public class MEjercicio4 {
	public static void main(String[] args) {
		int[][] matriz = new int[7][7];
		System.out.println("llenado de numeros");
		for(int i=0;i<7;i++) {
			for(int j=0;j<7;j++) {
				if(i==j) {
					matriz[i][j]=1;
				}
				else {
					matriz[i][j]=0;
				}
			}
		}
		System.out.println("matrix");
		for(int i=0;i<7;i++) {
			for(int j=0;j<7;j++) {
				System.out.print(matriz[i][j]+" ");
			}
			System.out.println();
		}

	}
}