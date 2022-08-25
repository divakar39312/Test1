package com.Bridgelabz;

interface area
{
     // method for calculating area
	double Calculate(double a,double b);
}
class Rect implements area
{
//	public double calculate(double a,double b) {
//		return (a*b);
//	}

	@Override
	public double Calculate(double a, double b) {
		// TODO Auto-generated method stub
		return (a*b);
	}
}
class Square implements area
{
	

	
//	public double Calculate(double a) {
//		// TODO Auto-generated method stub
//		return a*a;
//	}


	@Override
	public double Calculate(double a, double b) {
		// TODO Auto-generated method stub
		return a*a;
	}
}
public class TestInterface {
	
public static void main(String[] args) {
	Rect r=new Rect();
	Square s=new Square();
	area a;
	a=r;
	a=s;
	System.out.println(a.Calculate(30, 20));
	System.out.println(a.Calculate(10,20));
}
}
