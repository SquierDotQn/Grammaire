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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((alphabet == null) ? 0 : alphabet.hashCode());
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
		Alphabet other = (Alphabet) obj;
		if (alphabet == null) {
			if (other.alphabet != null)
				return false;
		} else if (!alphabet.equals(other.alphabet))
			return false;
		return true;
	}
	
}
