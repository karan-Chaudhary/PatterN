import java.util.Scanner;

public class Pattern4 {

	public static void main(String[] args) {
	
		

		System.out.println("Enter the number you want to print");
		
		Scanner val=new Scanner(System.in);
		int n=val.nextInt();
		
		for(int i=0;i<n;i++){
			for(int j=i;j<n;j++){
				System.out.print(j);
			}
			System.out.print("\n");
		}

	}

}
