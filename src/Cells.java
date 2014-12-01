import java.util.ArrayList;


public class Cells {
	
	private ArrayList<Symbole> cell;
	
	public Cells(){
		this.cell = new ArrayList<Symbole>();
	}

	public void add(Symbole s) {
		cell.add(s);
	}
	
	public boolean contains(Symbole symbole){
		return this.cell.contains(symbole);
	}
	

}
