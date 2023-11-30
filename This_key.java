class Circle1{
	double x,y;
	double r;
	double circumference(){
		return 2*3.14159*r;
	}
	double area(){
		return (22/7)*r*r;
	}
	Circle1(double x, double y, double r){
		this.x =x; //set center x-coordinates
		this.y =y; // set center y-coordinates
		this.r =r; //set radius
	}
}
class Circle2{
	double x,y;
	double r;
	double circumference(){
		return 2*3.14159*r;
	}
	double area(){
		return (22/7)*r*r;
	}
	void setCircle2(double a, double b, double c){
		x=a; //set center x-coordinates
		y=b; // set center y-coordinates
		r=c; //set radius
	}
}
class This_key{
	public static void main(String args[]){
		Circle c1=new Circle1();
		Circle c2= new Circle2();
		c2.setCircle2(3.0,4.0,7.0);
		System.out.println("Circumference of circle1 " +c1.circumference());
		System.out.println("Area of circle1 " +c1.area());
		System.out.println("Circumference of circle2 " +c2.circumference());
		System.out.println("Area of circle2 " +c2.area());
	}
}
