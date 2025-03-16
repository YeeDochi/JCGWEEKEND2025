
public class Main {
	public static void main(String[] args) {
		int temp = 84;
		
		if (temp >=90) {
			System.out.println("A");
			if (temp >=95) {
				System.out.print("+");
			}
			else {
				System.out.print("-");
			}
		}
		else if (temp >=80) {
			System.out.println("B");
			if (temp >=85) {
				System.out.print("+");
			}
			else {
				System.out.print("-");
			}
		}
	}
}
