class Circle{
	double x,y; //the Circumference of the center
	double r; //the radius
	
	//Methods that return circumference 
	double circumference(){
		return 2*3.14159*r;
	}
	//Method that return area
	double area(){
		return (22/7)*r*r;
	}
}
//Declaring object of the Circle class
//The following class declare an object of type circle

class CircleDemo{
	public static void main(String args[]){
		Circle c = new Circle();
		c.x=0.0;
		c.y=4.5;
		c.r=5.0;
		System.out.println("Circumference"+c.circumference());
		System.out.println("Area"+c.area());
	}
}