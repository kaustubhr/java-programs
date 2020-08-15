package array;

public class AddMatrices {

	public static void add(int[][] A,int[][] B) {
		int length = A.length;
		for(int i=0;i<length;i++) {
			for(int j=0;j<length;j++) {
				A[i][j] += B[i][j];
			}
		}
		
	}
	public static void main(String[] args) {
		int[][] matA ={{1,2},{3,4}};
		int[][] matB = {{5,6},{7,8}};
		add(matA,matB);	
		int length = matA.length;
		for(int i=0;i<length;i++) {
			for(int j=0;j<length;j++) {
				System.out.print(matA[i][j]+" ");
			}
			System.out.println();
		}
	}

}
