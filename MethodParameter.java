class Circle{
	double x,y;
	double r;
	double circumference(){
		return 2*3.14159*r;
	}
	double area(){
		return (22/7)*r*r;
	}
	void setCircle(double a, double b, double c){
		x=a; //set center x-coordinates
		y=b; // set center y-coordinates
		r=c; //set radius
	}
}
class MethodParameter{
	public static void main(String args[]){
		Circle c1= new Circle();
		Circle c2=new Circle();
		
		//Initialize the Circle
		c1.setCircle(3.0,4.0,5.0);
		c2.setCircle(9.0,4.0,6.0);
		System.out.println("Circumference Circle1"+c1.circumference());
		System.out.println("Area of circle1" +c1.area());
		System.out.println("Circumference Circle2"+c2.circumference());
		System.out.println("Area of Circle2" +c2.area());
		
	}
}