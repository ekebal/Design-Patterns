package tp1;

import java.util.*;

public class FindVisitor extends ElementStockageVisitor {
	
	protected Collection<String> adrAbsByName;
	protected String name;
	
	public FindVisitor(String name)
	{
		super();
		this.adrAbsByName = new ArrayList<String>();
		this.name = name;
	}

	@Override
	public void visitDirectory(Directory d) {
		
	}

	@Override
	public void visitFile(File f) {
		
		String[] resSplit = f.absoluteAdress().split("/");
		
		boolean trouve = false;
		
		for (int i=0; i<resSplit.length; i++)
		{
			if (resSplit[i].equals(this.name))
			{
				trouve = true;
			}
		}
		
		if (trouve)
		{
			this.adrAbsByName.add(f.absoluteAdress());
		}
		
	}

	@Override
	public void visitLink(Link l) {
		
	}

	@Override
	public void visitSymlink(Symlink sl) {
		
	}
	
	public Collection<String> getAdrAbsByName()
	{
		return this.adrAbsByName;
	}
	
	
	

}
