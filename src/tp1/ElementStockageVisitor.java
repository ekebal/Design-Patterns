package tp1;

public abstract class ElementStockageVisitor {
	
	public ElementStockageVisitor()
	{
		
	}
	
	public abstract void visitDirectory(Directory d);
	public abstract void visitFile(File f);
	public abstract void visitLink(Link l);
	public abstract void visitSymlink(Symlink sl);

}
