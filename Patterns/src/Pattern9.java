import java.util.Scanner;

public class Pattern9 {

	public static void main(String[] args) {
		
		System.out.println("Enter the number you want to print");
		
		Scanner val=new Scanner(System.in);
		int n=val.nextInt();
		int o=1;
		for(int i=0;i<=n;i++){
			for(int j=0;j<=i;j++){
				System.out.print(o);
				o=o+1;
			}
			System.out.print("\n");
		}

	}

}
