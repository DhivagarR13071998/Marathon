package classroomassignments;

public class Calculator {
	
	public void add(int a, int b) {
	System.out.println(a+b);

}
	public void add(int a, int b, int c) {
		System.out.println(a+b+c);

	}
	public void multiply(double a, double b) {
		System.out.println(a*b);
	}
	public void multiply(int a, double b) {
		System.out.println(a*b);
	}
	public static void main(String[] args) {

Calculator Calc=new Calculator();
Calc.add(1, 2);
Calc.add(1, 2, 3);
Calc.multiply(255.5, 255.5);
Calc.multiply(1, 100.00);
}}