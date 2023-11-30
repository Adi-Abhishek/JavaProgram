class EnumDemo
{
	//defining enum within class
	public enum Season{Winter,Spring,Summer,fall}
	public static void main(String args[])
	{
		for(Season S: Season.valueOf())
		{
			System.out.println(S);
		}
		System.out.println("value of Winter is"+Season.valueOf("Winter"));
		System.out.println("Index of Winter is"+Season.valueOf("Winter").ordinal());
		System.out.println("Index of Summer is"+Season.valueOf("Summer").ordinal());
	}
}