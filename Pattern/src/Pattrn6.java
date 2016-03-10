import java.util.Scanner;


public class Pattrn6 {

	
	public static void main(String[] args) {
		System.out.println("Enter the number you want to print!!");
		Scanner value=new Scanner(System.in);
		String val=value.next();
		int n=Integer.parseInt(val);;
		for(int i=n;i>=0;i--){
			for(int j=0;j<=i;j++){
				System.out.print("*");
			}
			System.out.print("\n");
		}

	}

}
