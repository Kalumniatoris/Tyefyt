package ka2.tyefyt.entities;

import ka2.tyefyt.other.Pair;

public interface OnMap {

	Pair<Integer, Integer> getPosition();
	BaseEntity setPosition(Pair<Integer, Integer> newPos);
	default BaseEntity setPosition(int x,int y) {
		Pair<Integer,Integer>newPos=new Pair<>(x, y);
		this.setPosition(newPos);
		return (BaseEntity) this;
	};
	
}
