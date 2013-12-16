package dflolp;

public class Common
{
	public static void sleep(int amt)
	{
		long a = System.currentTimeMillis();
		long b = System.currentTimeMillis();
		while ((b - a) <= amt)
		{
			b = System.currentTimeMillis();
		}
	}
}
