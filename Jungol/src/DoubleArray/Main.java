package DoubleArray;

public class Main {
	public static void main(String[] args) { 
		int[][] score = new int[2][3];
		
		for(int i=0;i<2;i++)
			for(int j=0;j<3;j++) {
				System.out.println("mathScores["+i+"]["+j+"] = "+score[i][j]);
			}
		
		score[1][0]=80;
		score[1][2]=99;
		
		for(int i=0;i<2;i++)
			for(int j=0;j<3;j++) {  
				System.out.println("mathScores["+i+"]["+j+"] = "+score[i][j]);
			}
	}
}
