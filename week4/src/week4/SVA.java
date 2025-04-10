package week4;
import java.util.Scanner;
public class SVA {
public static void main(String[]args) {
	Scanner scan= new Scanner(System.in);
	System.out.print("Enter the radius of the sphere:");
	double r= scan.nextDouble();
	double volume=(4.0/3.0)*Math.PI*Math.pow(r, 3);
	double surfaceArea= 4*Math.PI*Math.pow(r, 2);
	System.out.println("Volume="+volume);
	System.out.println("SurfaceArea="+surfaceArea);
}
}
