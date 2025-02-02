package cedrickMariano;
import java.util.Scanner;
import java.lang.Math;
public class BodyMassIndex {

	public static void main(String[] args) {
		
		// prompt user to input data such as height and weight
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter Height [m]: ");
		double height = scanner.nextDouble();
		
		System.out.print("Enter Weight [kg]: ");
		double weight = scanner.nextDouble();
		
		// computation for the body mass index
		double bodyMassIndex = weight/ Math.pow(height, 2);
		System.out.printf("Body Mass Index: %.2f\n", bodyMassIndex);
		
		// this will be the evaluation or remarks based on the bmi
		if (bodyMassIndex <= 18.5) {
			System.out.println("Remarks: Underweight");
			System.out.println("Must Do: You ned to gain weight");
		}
		else if (bodyMassIndex <= 24.9) {
			System.out.println("Remarks: Normal");
			System.out.println("Must Do: Keep it up");
		}
		else if (bodyMassIndex <= 29.9) {
			System.out.println("Remarks: Overweight");
			System.out.println("Must Do: You need to lose weight");
		}
		else if (bodyMassIndex <=34.9) {
			System.out.println("Remarks: Obese Class 1");
			System.out.println("Must Do: You need to lose weight");
		}
		else if (bodyMassIndex <= 39.9) {
			System.out.println("Remarks: Obese Class 2");
			System.out.println("Must Do: You need to lose weight");
		}
		else {
			System.out.println("Remarks: Morbid Obesity");
			System.out.println("Must Do: You need to lose weight");
		}
		scanner.close();
	
	}

}

