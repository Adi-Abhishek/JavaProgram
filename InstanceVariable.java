import java.io.*;
class InstanceVariable{
	public String geek; //Declared Instance Variable 
	public GFG()
	{
		//Default constructor
		this.geek="Abhishek"; //Initializing Instance Variable 
	}
	//Main Method 
	public static void main(String args[]){
		GFG name= new GFG();
		System.out.println("Geek name is:" +name.geek);
	}
}