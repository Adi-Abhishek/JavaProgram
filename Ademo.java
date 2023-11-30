class Ademo // example for encapsulation
{
int a;//variables
int b;
void read()//method
{
a=34;
b=89;
}
void display() // method
{
System.out.println(" a="+a+"b="+b);
}
public static void main(String args[])
{
Ademo obj=new Ademo();
obj.read(); // methods are invoked with object-objectname dot operator method name
obj.display();
}
}