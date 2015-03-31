
 import java.util.Scanner;

 public class ClassExerciseWithMethods {

	public static void main(String[] args) {
		
		double valueOfX,valueOfY,valueOfZ, squareRootOf,powerOf, absoluteValueOf,hFunctionOfX,fFunctionOfXY,gFunctionOfXYZ;
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter values for (x), (y), and (z). I will perform the following mathematical operations: "
		+ "\nh(x) = x^10 \nf(x,y) = x + y \ng(x,y,z) = squrt(x) + absolute(y) + z^y");
		
		System.out.println("Enter value of (x)");
		valueOfX= keyboard.nextDouble();
		System.out.println("Enter value of (y)");
		valueOfY= keyboard.nextDouble();
		System.out.println("Enter value of (z)");
		valueOfZ= keyboard.nextDouble();
		
		hFunctionOfX = Math.pow(valueOfX,10);
		squareRootOf= Math.sqrt(valueOfX);
		absoluteValueOf = Math.abs(valueOfY);
		powerOf = Math.pow(valueOfZ, valueOfY);
		fFunctionOfXY = valueOfX + valueOfY;
		gFunctionOfXYZ= squareRootOf + absoluteValueOf + powerOf;
		
		System.out.printf("h(x) = %2.2f \nf(x,y) = %2.2f \ng(x,y,z) = %2.2f", hFunctionOfX, fFunctionOfXY, gFunctionOfXYZ);
		

	}
		
 }
