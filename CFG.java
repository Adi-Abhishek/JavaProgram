import java.io.*;
class CFG{
	//main method
	public static void main(String[] args) throws IOException{
		//creating BufferedReader object
		//InputStreamReader converts  byte to stream of character
		BufferedReader bfn= new BufferedReader(new InputStreamReader(System.in));
		//Asking for input from user
		System.out.println("Enter String:");
		System.out.println("Enter Integer:");
		
		//String readung internally 
		String str = bfn.readLine();
		//Integer reading internally 
		int it = Integer.parseInt(bfn.readLine());
		//printing String
		System.out.println("Entered String:" +str);
		//printing integer
		System.out.println("Entered Integer:"+it);
	}
}