package recursion;

import java.io.File;

public class Lister {
	
private File file;
private boolean showHidden;

	public Lister(File file, boolean showHidden)
	{
		this.file = file;
		this.showHidden = showHidden;
	}
	
	public void list()
	{
		listRecurse(file,"");
	}
	
	private void listRecurse(File file, String indent)
	{
		if(!showHidden)
		{
			if(file.isDirectory())
			{
				System.out.println(indent + file.getName() + ":");
				File[] f = file.listFiles();
				for(File d: f)
					listRecurse(d, indent + "   ");
			}
			else if(file.isFile())
			{
				System.out.println(indent + file.getName());
			}
		}
		else
		{
			if(file.getName().charAt(0) != '.' && file.isDirectory())
			{
				System.out.println(indent + file.getName() + ":");
				File[] f = file.listFiles();
				for(File d: f)
					listRecurse(d, indent + "   ");
			}
			else if(file.getName().charAt(0) != '.' && file.isFile())
			{
				System.out.println(indent + file.getName());
			}
		}
	}

	
	
	public static void main(String[] args)
	{
		File aFile = new File("C:/Users/preet/eclipse-workspace/lab5/Recursion");
		Lister fileLister = new Lister(aFile, false);
		fileLister.list();
	}
}
