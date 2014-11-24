
public class SymboleNonTerminal extends Symbole {

	public SymboleNonTerminal(char symbole) {
		if('A' <= symbole && symbole <= 'Z'){
			super.symbole = symbole;
		}else{
			super.symbole = 0;
		}
	}

}
