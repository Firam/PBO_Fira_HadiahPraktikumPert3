import java.util.Scanner;

	public class suhu
	 {
		public static void main (String[] args)
		 {
			Scanner input = new Scanner (System.in);
			int Cel,Fahrenheit;
			System.out.print ("Celcius = ");
			Cel = input.nextInt();
			
			Fahrenheit= ((Cel * 9) / 5 ) + 32 ;
			
			System.out.println();
			System.out.println("jadi " +Cel+ "C = " +Fahrenheit+ "F.");
		}
	}