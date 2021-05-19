package ka2.tyefyt.entities;

import ka2.tyefyt.pages.other.Pair;

public interface Moveable extends OnMap {
	
	default BaseEntity move(int w,int h) {
		Pair<Integer,Integer> vec=new Pair<>(w, h);
		move(vec);
		return (BaseEntity) this;
	}
	BaseEntity move(Pair<Integer, Integer> vector);
	
}
