import java.util.ArrayList;
import java.util.List;


public class RegleProduction {
	protected SymboleNonTerminal symbole;
	protected List<List<Symbole>> produit;
	
	public RegleProduction(SymboleNonTerminal symbole, List<Symbole> premierProduit){
		this.symbole = symbole;
		produit = new ArrayList<List<Symbole>>();
		produit.add(premierProduit);
	}
	
	public void addProduit(List<Symbole> unProduit){
		if(produit.contains(unProduit)){
			return;
		}
		produit.add(unProduit);
	}
	
	public void removeProduit(List<Symbole> unProduit){
		if(!produit.contains(unProduit)){
			return;
		}
		produit.remove(unProduit);
	}
	
	public List<List<Symbole>> getProduits(){
		return produit;
	}
	
}
