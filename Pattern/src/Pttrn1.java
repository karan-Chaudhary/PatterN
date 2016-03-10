import java.util.Scanner;


public class Pttrn1 {

	
	public static void main(String[] args) {
		System.out.println("Enter the number you want to Print");
		Scanner value=new Scanner(System.in);
		String val=value.next();
		int n=Integer.parseInt(val);
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				System.out.print("x");
			}
			System.out.print("\n");
		}

	}

}
