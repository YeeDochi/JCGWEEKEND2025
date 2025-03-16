package Switch;

public class Main {
	public static void main(String[] args) {
		int num = (int)(Math.random()*6)+1;
		
		switch(num) {
		case 1:
			System.out.printf("%d번이 나왔습니다.",1);
		break;
		case 2:
			System.out.printf("%d번이 나왔습니다.",2);
		break;
		case 3:
			System.out.printf("%d번이 나왔습니다.",3);
		break;
		case 4:
			System.out.printf("%d번이 나왔습니다.",4);
		break;
		case 5:
			System.out.printf("%d번이 나왔습니다.",5);
		break;
		case 6:
			System.out.printf("%d번이 나왔습니다.",6);
		break;
			
		}
	}
}
