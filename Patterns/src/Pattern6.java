import java.util.Scanner;

public class Pattern6 {

	public static void main(String[] args) {
		
		System.out.println("Enter the number you want to print");
		
		Scanner val=new Scanner(System.in);
		int n=val.nextInt();
		
		for(int i=n;i>=0;i--){
			for(int j=i;j>=0;j--){
				System.out.print(j);
			}
			System.out.print("\n");
		}

	}

}
