package _00_Intro_To_2D_Arrays;

public class arrayTest {
public static void main(String[] args) {
//	int[][]matrix = {{0, 1, 2}, {3}, {4, 5}};
//	
//	for(int i = 0; i < matrix.length; i++){
//	    for(int j = 0; j < matrix[i].length; j++){
//	        System.out.print(matrix[i][j]);
//	    }
//	    System.out.println();
//	}
	
	int[][] mat3 = new int[3][3];
	for(int i = 0; i < mat3.length; i++){
	    for(int j = 0; j < mat3.length; j++){
	    	System.out.println(mat3[i][j] = i * mat3[i].length + j);

	    }
	    System.out.println();
	}
}
}
