package dotlab;

import java.io.*;


public class DotReader 
{
	private BufferedReader			br;
	
	public DotReader(BufferedReader br)
	{
		this.br = br;
	}
	
	public Dot readDot() throws IOException, DotException
	{
		String singleLine = br.readLine();
		System.out.println(singleLine);
		if (singleLine == null)
		{
			return null;
		}
		String[] dot = singleLine.split(",");
		String colorName = dot[0];
		int x = Integer.parseInt(dot[1]);
		int y = Integer.parseInt(dot[2]);
		int radius = Integer.parseInt(dot[3]);

		if (dot.length != 4)
		{
			DotException de = new DotException("Please use 3 properties only.");
			throw de;
		}
		Dot d = new Dot(colorName, x, y, radius);
		return d;
	}
}
