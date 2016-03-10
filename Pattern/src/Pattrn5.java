import java.util.Scanner;


public class Pattrn5 {

	public static void main(String args[]){
		System.out.println("Enter the number you want to print!!");
		Scanner value=new Scanner(System.in);
		String val=value.next();
		int n=Integer.parseInt(val);;
		for(int i=n;i>=0;i--){
			for(int j=1;j<=i;j++){
				System.out.print(j);
			}
			System.out.print("\n");
		}
	}
}
