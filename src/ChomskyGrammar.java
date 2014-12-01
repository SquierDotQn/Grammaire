import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class ChomskyGrammar extends Grammar {

	public ChomskyGrammar(Alphabet al, Set<SymboleNonTerminal> symNnTerm,
			SymboleNonTerminal initial, List<RegleProduction> productions) {
		super(al, symNnTerm, initial, productions);
	}

	@Override
	public boolean accept(String mot) {
		return analyseCYK(mot);
	}

	private boolean analyseCYK(String mot) {
		int i, l, n, m;
		SymboleTerminal a;
		ArrayList<Symbole> prod = new ArrayList<Symbole>();
		n = mot.length();
		Cells[][] cellule = new Cells[n][n];
		for (i = 1; i <= n; i++) {
			prod.clear(); // On ne veut que le caractère a(i)
			a = new SymboleTerminal(mot.charAt(i)); 
			prod.add(a);
			for (SymboleNonTerminal X : this.symNnTerm) {
				if (productions.contains(new RegleProduction(X, prod))) // X -> ai € P
					cellule[1][i].add(X);
			}
		}
		for (l = 2; l < n; l++) {
			for (i = 1; i <= n - l + 1; i++) {
				for (m = 1; m < l; m++) {
					for (RegleProduction rp : this.productions) {
						SymboleNonTerminal X = rp.getSymbole();
						List<List<Symbole>> nonTerms = rp.getNonTerminalProd();
						for (List<Symbole> yz : nonTerms) {
							if (yz.size()==2 // YZ
										&& productions.contains(new RegleProduction(X, yz/* YZ */)) // X -> YZ € P
										&& cellule[m][i].contains(yz.get(0)/* Y */)
										&& cellule[l - m][i + m].contains(yz.get(1)/* Z */))
								cellule[l][i].add(X);
						}
					}
				}
			}
		}
		return (cellule[n][1].contains(this.initial));
	}

}