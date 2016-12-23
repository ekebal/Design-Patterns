package tp1;

import java.util.ArrayList;

public class Principale
{
	public static void main(String[] args) 
	{
		/*Directory racine = new Directory("racine") ;
		Directory d1 = new Directory("JAVA") ;
		Directory d2 = new Directory("src") ;
		
		File f1 = new File("File.java","classe File") ;
		File f2 = new File("Principale.java","classe Principale") ;
		
		Symlink sl = new Symlink("mon_lien_1",f2) ;
		Symlink s2 = new Symlink("JAVA") ;
		
		racine.add(d1) ;
		d1.add(d2) ;
		d2.add(f1) ;
		d2.add(f2) ;
		d2.add(s2) ;
		racine.add(sl) ;
		
		System.out.println(racine.absoluteAdress()) ;
		System.out.println("ls : ") ;
		racine.ls() ;
		System.out.println("taille : "+racine.size()) ;
		System.out.println("\n") ;
		
		System.out.println(d1.absoluteAdress()) ;
		System.out.println("ls : ") ;
		d1.ls() ;
		System.out.println("taille : "+d1.size()) ;
		System.out.println("\n") ;
		
		System.out.println(d2.absoluteAdress()) ;
		System.out.println("ls : ") ;
		d2.ls() ;
		System.out.println("taille : "+d2.size()) ;
		System.out.println("\n") ;
		
		System.out.println(f1.absoluteAdress()) ;
		System.out.println("cat : ") ;
		f1.cat() ;
		System.out.println("taille : "+f1.size()) ;
		System.out.println("\n") ;
		
		System.out.println(sl.absoluteAdress()) ;
		System.out.println("cat : ") ;
		sl.cat() ;
		System.out.println("taille : "+sl.size()) ;
		System.out.println("\n") ;
		
		ArrayList<String> rechercheSimple = racine.find("JAVA") ;
		
		System.out.println("resultat de notre recherche simple sur JAVA dans racine : ") ;
		racine.afficheCollection(rechercheSimple) ;
		System.out.println("\n") ;
		
		ArrayList<String> rechercheTransitive = racine.findR("JAVA") ;
		
		System.out.println("resultat de notre recherche transitive sur JAVA dans racine : ") ;
		racine.afficheCollection(rechercheTransitive) ;
		System.out.println("\n") ;
		
		racine.remove(d1) ;
		
		System.out.println(racine.absoluteAdress()) ;
		System.out.println("ls : ") ;
		racine.ls() ;
		System.out.println("taille : "+racine.size()) ;
		System.out.println("\n") ;
		
		*/
		
		Directory d = new Directory("Pastis") ;
		File f = new File("Martini.class","martini") ;//martini
		File f2 = new File("Ricard","ricard") ;//ricard
		Directory d2 = new Directory("Eau") ;
		File f3 = new File("Glaçons.class","glaçons") ;

		d.add(f) ;
		d.add(f2) ;
		d.add(d2) ;
		d2.add(f3) ;
		
		File f4 = new File("Duval","duval") ;
		
		System.out.println("AVANT"+"\n") ;
		System.out.println("taille "+d.name+" : "+d.size()) ;
		System.out.println("taille "+d2.name+" : "+d2.size()) ;
		System.out.println("taille "+f.name+" : "+f.size()) ;
		System.out.println("taille "+f2.name+" : "+f2.size()) ;
		System.out.println("taille "+f3.name+" : "+f3.size()) ;
		System.out.println("taille "+f4.name+" : "+f4.size()) ;
		
		d.ls();
		d2.ls();
		
		Directory d3 = new Directory("toto");
		File f5 = new File("tutu.class","tututu tutu") ;
		
		d3.add(f5);
		d3.add(f4);
		d2.add(d3);
		
		
//		ElementStockageVisitor rv = new RazVisitor();
//		d.accept(rv);
		
//		ElementStockageVisitor cv = new CountVisitor(4);
//		d.accept(cv);
//		System.out.println("\nnombre fichier : "+((CountVisitor) cv).getCount());

		//ElementStockageVisitor fv = new FindVisitor("Eau");
//		d.accept(fv);
//		System.out.println(((FindVisitor)fv).getAdrAbsByName().toString());
		
		ElementStockageVisitor jcv = new JavaCleanVisitor();
		d.accept(jcv);
		((JavaCleanVisitor)jcv).removeFile();
		
//		ElementStockageVisitor reqv = new RequeteVisitor("biggestSizeFile");
//		d.accept(reqv);
//		System.out.println("countFileWithBeginDot = " + ((RequeteVisitor) reqv).getCount());
//		System.out.println("biggestSizeFile = " + ((RequeteVisitor) reqv).getBiggestSizeFile().absoluteAdress());
		
		System.out.println("\nAPRES") ;
		System.out.println("taille "+d.name+" : "+d.size()) ;
		System.out.println("taille "+d2.name+" : "+d2.size()) ;
		System.out.println("taille "+f.name+" : "+f.size()) ;
		System.out.println("taille "+f2.name+" : "+f2.size()) ;
		System.out.println("taille "+f3.name+" : "+f3.size()) ;
		System.out.println("taille "+f4.name+" : "+f4.size()) ;
		
		d.ls();
		d2.ls();
		d3.ls();
		
		
		
		
	}
}
