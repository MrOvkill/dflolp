package dflolp;

import java.util.Random;

public class Common
{
	public static final String sep = System.getProperty("file.separator");
	public static final String osname = System.getProperty("os.name");
	public static final String osvers = System.getProperty("os.version");
	public static String p_err = ("" + (char)(0x001));
	public static String p_sep = ("" + (char)(0x002));
	public static String p_ping = ("" + (char)(0x003));
	public static String p_pong = ("" + (char)(0x004));
	public static String p_quit = ("" + (char)(0x005));
	private static Random rand;
	public static void sleep(int amt)
	{
		long a = System.currentTimeMillis();
		long b = System.currentTimeMillis();
		while ((b - a) <= amt)
		{
			b = System.currentTimeMillis();
		}
	}
	public static void echo(String msg)
    {
        System.out.println("[OVK] " + msg);
    }
	public static int randInt(int min, int max)
	{
		int toreturn = -1;
		while (toreturn < 0)
		{
			rand = new Random();
			int n = max - min + 1;
			int i = rand.nextInt() % n;
			toreturn = min + i;
		}
		return toreturn;
	}
	public static void initvars()
	{
		p_err = ("" + (char)(0x001));
		p_sep = ("" + (char)(0x002));
		p_ping = ("" + (char)(0x003));
		p_pong = ("" + (char)(0x004));
		p_quit = ("" + (char)(0x005));
	}
}
