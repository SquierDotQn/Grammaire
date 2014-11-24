
public class SymboleTerminal extends Symbole {

	public SymboleTerminal(char symbole) {
		if('a' <= symbole && symbole <= 'a'){
			super.symbole = symbole;
		}else{
			super.symbole = 0;
		}
	}
	
}
