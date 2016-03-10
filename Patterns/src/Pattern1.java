import java.util.Scanner;

public class Pattern1{

	public static void main(String[] args){
	
			System.out.println("Enter the number you want to print");
			Scanner val=new Scanner(System.in);
			int n=val.nextInt();
			
			for(int i=0;i<n;i++){
				for(int j=0;j<n;j++){
				System.out.print("*");
			}
			
	System.out.print("\n");
}

}
}

