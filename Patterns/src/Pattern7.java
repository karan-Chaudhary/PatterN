import java.util.Scanner;

public class Pattern7 {

	public static void main(String arghs[]){	
		System.out.println("Enter the number you want to print");
	
	Scanner val=new Scanner(System.in);
	int n=val.nextInt();
	
	for(int i=1;i<=n;i++){
		for(int j=1;j<=i;j++){
			System.out.print(j);
		}
		System.out.print("\n");
	}

}

}
