package dotlab;


public class Dot 
{
	private static String[] 	LEGAL_COLOR_NAMES =
	{
		"RED", "YELLOW", "BLUE", "CYAN", "GREEN", "MAGENTA", "ORANGE", "BLACK"
	};
	private String colorName;
	private int x, y, radius;
	public Dot(String colorName, int x, int y, int radius)
	{
		Boolean colorCheck = false;
		for (int i = 0; i < LEGAL_COLOR_NAMES.length; i++)
		{
			if (LEGAL_COLOR_NAMES[i].equals(colorName))
			{
				colorCheck = true;
				this.colorName= colorName;
				break;
			}
			else
			{
				colorCheck = false;
			}
		}
		if (colorCheck == false)
		{
			throw new IllegalArgumentException(colorName + " is a bad color name");
		}
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	public String getColorName()
	{
		return colorName;
	}
	public int getX()
	{
		return x;
	}
	public int getY()
	{
		return y;
	}
	public int getRadius()
	{
		return radius;
	}
	public static void main(String[] args)
	{
		Dot b = new Dot("BLUE", 10, 20, 20);
		//Dot r = new Dot("PURPLE", 40, 50, 20);
		System.out.println(b.toString());
	}
	public String toString()
	{
		return getColorName() + " "+ getX() + " " + getY() + " " + getRadius();
	}
}

