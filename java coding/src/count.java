import java.util.*;
public class count {
 public static void main(String[] args) {
	 System.out.print("Enter the number : ");
	 Scanner sc = new Scanner(System.in);
	 int n = sc.nextInt();
	 System.out.print("Enter the divisor : ");
	 int m = sc.nextInt();
	 int dig = 0;
	 while(n!=0) {
		 n=n/m;
		 dig++;
	 }
	 System.out.print("Number of times divided by "+m+" : "+dig);
	 
 }
}
