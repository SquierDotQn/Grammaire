
public abstract class Symbole {
	protected char symbole;
	
	
	public String toString(){
		return ""+symbole;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + symbole;
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
		Symbole other = (Symbole) obj;
		if (symbole != other.symbole)
			return false;
		return true;
	}
	
}
