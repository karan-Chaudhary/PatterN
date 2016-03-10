import java.util.Scanner;

public class Pattern10 {

	public static void main(String[] args) {
		System.out.print("Enter the no. u want to print===");
		
		Scanner val=new Scanner(System.in);
		int n=val.nextInt();
		int o=1;
		for(int i=0;i<=n;i++){
			for(int j=0;j<=i;j++){
				System.out.print(o);
				o=o+2;
			}
			System.out.print("\n");
		}

	}

}
