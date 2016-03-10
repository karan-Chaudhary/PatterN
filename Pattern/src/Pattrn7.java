import java.util.Scanner;


public class Pattrn7 {

	
	public static void main(String[] args) {
		System.out.println("Enter the number you want to print!!");
		Scanner value=new Scanner(System.in);
		String val=value.next();
		int n=Integer.parseInt(val);;
		int o=1;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=i;j++){
				
				System.out.print(o+"");
				o=o+1;
			}
			System.out.print("\n");
		}
		
	}

}
