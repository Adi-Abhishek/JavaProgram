class Consdemo
{
int x;
int y;
Consdemo()// defualt constructor
{
x=20;
y=30;
}
void display() // method
{
System.out.println(" x="+x);
System.out.println(" y="+y);
}
public static void main(String args[])
{
Consdemo obj=new Consdemo(); // constructor is executed
obj.display();// method is executed
}
}