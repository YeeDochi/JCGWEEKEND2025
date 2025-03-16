package Q557;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        char temp[] = new char[10];
        for(int i=0;i<10;i++){
            temp[i] = sc.next().charAt(0);
        }

        System.out.print(temp[0]+" "+temp[3]+" "+temp[6]);
        
        System.out.print("\n\n");
        
        for(int i=0;i<10;i++){
        	if(i%2 != 0)
        		System.out.print(temp[i]+" ");
        }
        System.out.print("\n\n");
        
        for(int i=0;i<10;i++){
        	if(i%2 == 0)
        		System.out.print(temp[i]+" ");
        }
	}
}