class Circle{
	double x,y;
	double r;
	double circumference(){
		return 2*3.14159*r;
	}
	double area(){
		return (22/7)*r*r;
	}
	Circle(double a, double b, double c){
		x=a; //set center x-coordinates
		y=b; // set center y-coordinates
		r=c; //set radius
	}
}
class Constructor{
	public static void main(String args[]){
		Circle c1=new Circle(3.0,4.0,6.0);
		Circle c2=new Circle(-4.0,5.0,9.0);
		System.out.println("Circumference of circle1 " +c1.circumference());
		System.out.println("Area of circle1 " +c1.area());
		System.out.println("Circumference of circle2 " +c2.circumference());
		System.out.println("Area of circle2 " +c2.area());
	}
}