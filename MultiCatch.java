class MultiCatch{
	public static void main(String args[]){
		int i= args.length; //number of argument in the command line
		try{
			String myString= new String[i];
			if(args[0].equals("Java"));  //#1 If i=0 then myString null pointer error
				System.out.println("First word is java !");
			System.out.println(" Number of Argument= "+i);
			int x=18/i;  //#2: Divide by zero error
			int y[]={555,999};  //y is an array of size 2 and index are 0,1
			y[i]=x;  //#3: Index is out of range may occur if i>1
		}
		catch(NullPointerException e){   //To catch the error at #1
			System.out.println("A null pointer exception: "+ e);
		}
		catch(ArithmeticException e){     //To catch the error at #2
			System.out.println("Divide by 0: "+ e);
		}
		catch(ArrayIndexOutofBoundsException e){ // To catch the Error at #3
			System.out.println("Array index OoB:" +e);
		}
	}
}