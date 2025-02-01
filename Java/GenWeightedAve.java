import java.util.Scanner;
public class GenWeightedAve {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        System.out.println("─────────────────────────");
        System.out.println("Welcome to GWA Calculator");
        System.out.println("─────────────────────────");
        System.out.print("Number of Subjects: ");
        int numSubjects = scan.nextInt();
        System.out.println();
        
        double totalGenAve = 0.0;
        
        for (int count = 1; count <=numSubjects; count++ ) {
        	System.out.printf("Subject Grade [%d]: ", count);
        	totalGenAve += scan.nextDouble();
        }
        
        System.out.printf("Gen. Weighted Average: %.2f", totalGenAve/numSubjects);
        scan.close();
	}
}
