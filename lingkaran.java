import java.util.Scanner;
public class lingkaran {
	static double pi=3.14;
	public static void main (String[] args) {
		
		Scanner input = new Scanner (System.in);
		double jari_jari,luas;
		
		System.out.print("Jari-jari lingkaran : ");
		jari_jari= input.nextDouble();
		luas= pi *jari_jari * jari_jari;
		
		System.out.println();
		System.out.println("Luas : " +pi+ " x " +jari_jari+ "x " +jari_jari);
		System.out.println("Luas lingkaran : " +luas);
	}
}