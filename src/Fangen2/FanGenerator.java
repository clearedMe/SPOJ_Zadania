package Fangen2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;

//inna wersja, krotsza ale nieobiektowo

public class FanGenerator
{
	public static void main(String[] args)
	{
		try
		{
			
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			StringBuilder builder = new StringBuilder(400);
			String result[] = new String[400];
			
			String line;
			while ((line = reader.readLine()) != null)
			{
				int fanSize = Integer.parseInt(line);
				int direction = (int) Math.signum(fanSize);
				fanSize = Math.abs(fanSize);
				
				if (fanSize > 1)
				{
					int starsForFirst = 1;
					int dotsForFirsto = fanSize-1;
					int starsForSecond = fanSize;
					int dotsForSecond = 0;
					
					for (int i =0; i < fanSize; i++)
					{
						builder.setLength(0);
						
						for (int k =0; k < starsForFirst; k++)
							builder.append("*");
						for (int k =0; k < dotsForFirsto; k++)
							builder.append(".");
						for (int k =0; k < starsForSecond; k++)
							builder.append("*");
						for (int k =0; k < dotsForSecond; k++)
							builder.append(".");
						
						if (direction == 1)
						{
							result[i] = builder.toString();
							result[fanSize*2 -i -1] = builder.reverse().toString();
						} else
						{
							result[fanSize*2 -i -1] = builder.toString();	
							result[i] = builder.reverse().toString();					
						}
						
						starsForFirst++;
						dotsForFirsto--;
						starsForSecond--;
						dotsForSecond++;
					}
					
					for (int i =0; i < fanSize*2; i++)
						System.out.println(result[i]);	
					
				} else
				if (fanSize == 0)
				{
					break;
				}
			
				System.out.println();
			}
			
			reader.close();
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}
