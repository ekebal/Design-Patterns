package tp1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class JavaCleanVisitor extends ElementStockageVisitor{
	
	protected Collection<ElementStockage> filesToRemove;
	
	public JavaCleanVisitor()
	{
		super();
		this.filesToRemove = new ArrayList<ElementStockage>();
	}

	@Override
	public void visitDirectory(Directory d) {
		
	}

	@Override
	public void visitFile(File f) {
		
		if (f.absoluteAdress().matches(".*\\.class"))
		{
			filesToRemove.add(f);
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
	
	public void removeFile()
	{
		for(ElementStockage e : this.filesToRemove)
		{
			e.parent.remove(e);
		}
	}
	
	
	

}
