package cedrickMariano;
class CrashCourse {

	public static void main(String[] args) {
		// Java Crash Course

		// ============================================
		// 1. Variables and Data Types
		// ============================================
		// Variables are used to store data. In Java, you must declare the type of a variable.

		// Example:
//		int x = 10;          // x is an integer
//		double y = 20.5;     // y is a double (floating-point number)
//		String name = "Alice";  // name is a String
//		boolean isStudent = true;  // isStudent is a boolean
//
//		// Java has several primitive data types:
//		// - int: Integer numbers (e.g., 10, -5)
//		// - double: Decimal numbers (e.g., 3.14, -0.001)
//		// - char: Single character (e.g., 'A', 'b')
//		// - boolean: Boolean values (true or false)
//		// - String: Text data (e.g., "Hello", "Java")
//
//		// ============================================
//		// 2. Typecasting
//		// ============================================
//		// Typecasting is the process of converting one data type to another.
//
//		// Example:
//		int a = 10;
//		double b = (double) a;  // Convert int to double
//		String c = Integer.toString(a);  // Convert int to String
//
//		// ============================================
//		// 3. Inputs
//		// ============================================
//		// Use the `Scanner` class to take input from the user.
//
//		import java.util.Scanner;
//
//		public class Main {
//		    public static void main(String[] args) {
//		        Scanner scanner = new Scanner(System.in);
//
//		        System.out.print("Enter your name: ");
//		        String name = scanner.nextLine();  // Takes a string input
//
//		        System.out.print("Enter your age: ");
//		        int age = scanner.nextInt();  // Takes an integer input
//
//		        System.out.println("Hello, " + name + "! You are " + age + " years old.");
//		    }
//		}
//
//		// ============================================
//		// 4. Booleans
//		// ============================================
//		// Booleans represent one of two values: `true` or `false`.
//
//		boolean isRaining = true;
//		boolean isSunny = false;
//
//		// Boolean expressions evaluate to `true` or `false`.
//		System.out.println(10 > 5);   // Output: true
//		System.out.println(10 == 5);  // Output: false
//
//		// ============================================
//		// 5. Conditional Statements
//		// ============================================
//		// Use `if`, `else if`, and `else` for conditional logic.
//
//		int age = 18;
//		if (age < 18) {
//		    System.out.println("You are a minor.");
//		} else if (age == 18) {
//		    System.out.println("You just became an adult!");
//		} else {
//		    System.out.println("You are an adult.");
//		}
//
//		// ============================================
//		// 6. Loops
//		// ============================================
//		// Java has two types of loops: `for` loops and `while` loops.
//
//		// For Loop:
//		for (int i = 0; i < 5; i++) {
//		    System.out.println(i);  // Output: 0 1 2 3 4
//		}
//
//		// While Loop:
//		int count = 0;
//		while (count < 5) {
//		    System.out.println(count);  // Output: 0 1 2 3 4
//		    count++;
//		}
//
//		// ============================================
//		// 7. Functions (Methods)
//		// ============================================
//		// Functions in Java are called methods. They are defined inside a class.
//
//		public class Main {
//		    // Example of a simple method
//		    static void greet(String name) {
//		        System.out.println("Hello, " + name + "!");
//		    }
//
//		    // Example of a method with a return value
//		    static int add(int a, int b) {
//		        return a + b;
//		    }
//
//		    public static void main(String[] args) {
//		        greet("Alice");  // Output: Hello, Alice!
//
//		        int result = add(5, 3);
//		        System.out.println(result);  // Output: 8
//		    }
//		}
//
//		// ============================================
//		// 8. Arrays
//		// ============================================
//		// Arrays are used to store multiple values of the same type.
//
//		int[] numbers = {1, 2, 3, 4, 5};
//
//		// Accessing elements
//		System.out.println(numbers[0]);  // Output: 1 (first element)
//		System.out.println(numbers[4]);  // Output: 5 (last element)
//
//		// Modifying elements
//		numbers[0] = 10;
//		System.out.println(numbers[0]);  // Output: 10
//
//		// ============================================
//		// 9. Strings
//		// ============================================
//		// Strings are objects in Java and have many useful methods.
//
//		String text = "Hello, Java!";
//
//		// Length of a string
//		System.out.println(text.length());  // Output: 12
//
//		// Concatenation
//		String newText = text + " How are you?";
//		System.out.println(newText);  // Output: Hello, Java! How are you?
//
//		// Substring
//		System.out.println(text.substring(0, 5));  // Output: Hello
//
//		// ============================================
//		// 10. Classes and Objects
//		// ============================================
//		// Java is an object-oriented programming language. Classes are blueprints for objects.
//
//		class Person {
//		    // Fields (attributes)
//		    String name;
//		    int age;
//
//		    // Constructor
//		    Person(String name, int age) {
//		        this.name = name;
//		        this.age = age;
//		    }
//
//		    // Method
//		    void greet() {
//		        System.out.println("Hello, my name is " + name + " and I am " + age + " years old.");
//		    }
//		}
//
//		public class Main {
//		    public static void main(String[] args) {
//		        // Create an object of the Person class
//		        Person person = new Person("Alice", 25);
//		        person.greet();  // Output: Hello, my name is Alice and I am 25 years old.
//		    }
//		}
//
//		// ============================================
//		// 11. Exception Handling
//		// ============================================
//		// Use `try`, `catch`, and `finally` to handle exceptions (errors).
//
//		public class Main {
//		    public static void main(String[] args) {
//		        try {
//		            int result = 10 / 0;  // This will throw an ArithmeticException
//		        } catch (ArithmeticException e) {
//		            System.out.println("Cannot divide by zero!");
//		        } finally {
//		            System.out.println("This will always execute.");
//		        }
//		    }
//		}
//
//		// ============================================
//		// 12. Collections (ArrayList)
//		// ============================================
//		// The `ArrayList` class is a resizable array that can store objects.
//
//		import java.util.ArrayList;
//
//		public class Main {
//		    public static void main(String[] args) {
//		        ArrayList<String> names = new ArrayList<>();
//
//		        // Adding elements
//		        names.add("Alice");
//		        names.add("Bob");
//		        names.add("Charlie");
//
//		        // Accessing elements
//		        System.out.println(names.get(0));  // Output: Alice
//
//		        // Removing elements
//		        names.remove(1);  // Removes "Bob"
//
//		        // Iterating through the list
//		        for (String name : names) {
//		            System.out.println(name);  // Output: Alice, Charlie
//		        }
//		    }
//		}
//
//		// ============================================
//		// End of Java Crash Course
//		// ============================================
//		
	}

}
