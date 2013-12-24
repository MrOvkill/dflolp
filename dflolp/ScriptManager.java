package dflolp;

import java.io.*;
import org.python.util.PythonInterpreter;

public class ScriptManager
{
	public static boolean callFromFile(String filename)
	{
		File scpt = new File(filename);
		if(!scpt.exists() && scpt.isFile())
		{
			System.out.println("No such script: " + filename);
			return false;
		}
		PythonInterpreter interp = new PythonInterpreter();
		try
		{
			interp.execfile(filename);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}
		return true;
	}
}
