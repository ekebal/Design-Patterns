package tp1;

public class CountVisitor extends ElementStockageVisitor{
	
	protected int count;
	protected int nbCaractLimite;
	
	public CountVisitor (int nbCarMin)
	{
		super();
		this.count = 0;
		this.nbCaractLimite = nbCarMin;
	}

	@Override
	public void visitDirectory(Directory d) {
		
	}

	@Override
	public void visitFile(File f) {
		
		if (f.size() > this.nbCaractLimite)
		{
			this.count++;
		}
	}

	@Override
	public void visitLink(Link l) {
		
		if (l.size() > this.nbCaractLimite)
		{
			this.count++;
		}
		
	}

	@Override
	public void visitSymlink(Symlink sl) {
		
		if (sl.size() > this.nbCaractLimite)
		{
			this.count++;
		}
		
	}
	
	public int getCount()
	{
		return this.count;
	}

}
