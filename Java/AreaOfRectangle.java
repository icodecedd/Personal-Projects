package cedrickMariano;
import java.util.Scanner;
public class AreaOfRectangle {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char answer = 'Y';
		while (answer == 'Y' || answer == 'y') {		

			System.out.print("Enter Width: ");
			double width = scanner.nextDouble();
			System.out.print("Enter Length: ");
			double length = scanner.nextDouble();
			
			double area = width * length;
			
			System.out.println("Area: " + area);
	
			System.out.print("Use Again [Y][N]: ");
			answer = scanner.next().charAt(0);
		}
        System.out.println("Closing Program...");

        scanner.close();
	}

}
