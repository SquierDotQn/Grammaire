import java.util.HashSet;
import java.util.Set;


public class Alphabet {
	protected Set<SymboleTerminal> alphabet;
	
	public Alphabet(Set<SymboleTerminal> alphabet){
		this.alphabet = alphabet;
	}
	
	public Alphabet(){
		this.alphabet = new HashSet<SymboleTerminal>();
	}
	
	public boolean contains(SymboleTerminal s){
		return alphabet.contains(s);
	}
	
	public void addSymbole(SymboleTerminal s){
		alphabet.add(s);
	}
	
	public void removeSymbole(SymboleTerminal s){
		if(contains(s))
			alphabet.remove(s);
	}
	
}
