package tp1;
import java.lang.reflect.*;

public class RequeteVisitor extends ElementStockageVisitor{
	
	protected int count;
	protected File biggestSizeFile;
	protected String requete;

	public RequeteVisitor(String r)
	{
		this.requete = r;
		this.biggestSizeFile = new File("");
	}

	@Override
	public void visitDirectory(Directory d) {
		
	}

	@Override
	public void visitFile(File f) {
		
		Class r = this.getClass();
		Class[] cArg = new Class[1];
        cArg[0] = File.class;
        
        try
        {
        	Method Mreq = r.getDeclaredMethod(this.requete, cArg);
        	Mreq.invoke(this, f);
        }
        catch(NoSuchMethodException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
            System.out.println(e.toString());
        }
		
	}

	@Override
	public void visitLink(Link l) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visitSymlink(Symlink sl) {
		// TODO Auto-generated method stub
		
	}
	
	public void countVoidFile(File f)
	{
		if (f.size() == 0)
		{
			this.count++;
		}
	}
	
	public void countFileWithBeginDot(File f)
	{
		String[] resSplit = f.absoluteAdress().split("/");
		
		if (resSplit[resSplit.length-1].charAt(0) == '.') 
		{
			this.count++;
		}
	}
	
	public void biggestSizeFile(File f)
	{
		if (f.size() > this.biggestSizeFile.size()) 
		{
			this.biggestSizeFile = f;
		}
	}
	
	public int getCount()
	{
		return this.count;
	}
	
	public File getBiggestSizeFile() 
	{
		return biggestSizeFile;
	}

}
