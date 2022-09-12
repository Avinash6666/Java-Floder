	import java.util.Scanner;
	public class ScannerDemo{
		public static void main(String[] s){
			Scanner scanner = new Scanner(System.in);
			//if we want to make our application wait for some time to read the int value from enduser
			System.out.println("Enter Integer Value");
			int value1 = scanner.nextInt();
			System.out.println("Value1: "+value1);

			System.out.println("Enter Boolean Value");
			boolean value2 = scanner.nextBoolean();
			System.out.println("Value2: "+value2);
			System.out.println("program ends");
		}
	
	}