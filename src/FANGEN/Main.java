package FANGEN;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main
{
	public static void main(String[] args)
	{
		
	 try
	   {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		FanCharSet chars = new FanCharSet('*', '.');
		int fanSize;

		
		while ((fanSize = Integer.parseInt(reader.readLine())) != 0)
			{
				new ConsoleFanGenerator(fanSize, chars).draw();
			}
		} catch(Exception exception)
		{
			exception.printStackTrace();
		}
	}
}



