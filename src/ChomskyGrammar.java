import java.util.List;
import java.util.Set;


public class ChomskyGrammar extends Grammar {

	public ChomskyGrammar(Alphabet al, Set<SymboleNonTerminal> symNnTerm,
			SymboleNonTerminal initial, List<RegleProduction> productions) {
		super(al, symNnTerm, initial, productions);
	}

	@Override
	public boolean accept(String mot) {
		return false;
	}

}
