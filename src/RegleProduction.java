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
	
	public SymboleNonTerminal getSymbole(){
		return symbole;
	}
	
	public List<List<Symbole>> getNonTerminalProd(){
		boolean hasTerminal = false;
		List<List<Symbole>> nonTerminals = new ArrayList<List<Symbole>>();
		for(List<Symbole> l : produit){
			hasTerminal = false;
			for(Symbole s : l){
				if(s instanceof SymboleTerminal){
					hasTerminal = true;
				}
			}
			if(!hasTerminal){
				nonTerminals.add(l);
			}
		}
		return nonTerminals;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((produit == null) ? 0 : produit.hashCode());
		result = prime * result + ((symbole == null) ? 0 : symbole.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RegleProduction other = (RegleProduction) obj;
		if (produit == null) {
			if (other.produit != null)
				return false;
		} else if (!produit.equals(other.produit))
			return false;
		if (symbole == null) {
			if (other.symbole != null)
				return false;
		} else if (!symbole.equals(other.symbole))
			return false;
		return true;
	}

	
}
