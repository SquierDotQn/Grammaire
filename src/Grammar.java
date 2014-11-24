import java.util.List;
import java.util.Set;

public abstract class Grammar {
	protected Alphabet al;
	protected Set<SymboleNonTerminal> symNnTerm;
	protected SymboleNonTerminal initial;
	protected List<RegleProduction> productions;

	public Grammar(Alphabet al, Set<SymboleNonTerminal> symNnTerm, SymboleNonTerminal initial, List<RegleProduction> productions) {
		this.al = al;
		this.symNnTerm = symNnTerm;
		this.initial = initial;
		this.productions = productions;
	}
	
	public abstract boolean accept(String mot);

}
