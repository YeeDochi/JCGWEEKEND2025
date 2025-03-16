package ARRAY;

public class Main {
	public static void main(String[] args) {
		int scores[] = {83,90,87};
		
		for(int i=0;i<3;i++) {
			System.out.println("Scores["+i+"] : "+scores[i]);
		}
		
		int sum=0;
		for(int i=0;i<3;i++)sum+=scores[i];
		
		System.out.println("Sum : "+sum);
		double avg = sum/3.0;
		System.out.println("Avg : "+avg);
	}
}
