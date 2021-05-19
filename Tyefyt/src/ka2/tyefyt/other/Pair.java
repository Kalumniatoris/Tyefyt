package ka2.tyefyt.other;

public class Pair<X,Y> {
	public X x;
	public Y y;
	
	public Pair(X x,Y y) {
		this.x=x;
		this.y=y;
		
	}

	
	public String toString(){
		return "position: ("+this.x+","+this.y+")";
		
	}
}
