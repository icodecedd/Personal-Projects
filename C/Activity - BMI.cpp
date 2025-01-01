#include<stdio.h>
#include<conio.h>
#include<windows.h>
#define p printf
#define s scanf

main()
{
	float bmi=0,weight,height;
	
	p("Body Mass Index:\n");
	p("\nWeight in kg: "); s("%f",&weight);
	p("\nHeight in m: "); s("%f",&height);
	
	bmi=weight/(height*height);
	
	p("Your BMI is: %.2f",bmi);
	
	if (bmi<=18.5){
		p("\nRemarks: Underweight");
		p("\nMust do: You need to gain weight");
	}
	else if (bmi<=24.9){
		p("\nRemarks: Normal");
		p("\nMust do: Keep it up");
	}
	else if (bmi<=29.9){
		p("\nRemarks: Overweight");
		p("\nMust do: You need to lose weight");
	}
	else if (bmi<=34.9){
		p("\nRemarks: Obese Class 1");
		p("\nMust do: You need to lose weight");
	}
	else if (bmi<=39.9){
		p("\nRemarks: Obese Class 2");
		p("\nMust do: You need to lose weight");
	}
	 else {
		p("\nRemarks: Morbid Obesity");
		p("\nMust do: You need to lose weight");
	}
	
}
