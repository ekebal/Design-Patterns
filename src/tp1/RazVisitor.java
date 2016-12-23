package tp1;

public class RazVisitor extends ElementStockageVisitor{
	
	public RazVisitor()
	{
		
	}

	@Override
	public void visitDirectory(Directory d) {
		
	}

	@Override
	public void visitFile(File f) {
		
		f.setContents("");
		
	}

	@Override
	public void visitLink(Link l) {
		
	}

	@Override
	public void visitSymlink(Symlink sl) {
	
	}
	
	

}
