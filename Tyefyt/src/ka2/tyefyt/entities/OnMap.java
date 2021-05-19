package ka2.tyefyt.entities;

import ka2.tyefyt.pages.other.Pair;

public interface OnMap {

	Pair<Integer, Integer> getPosition();
	BaseEntity setPosition(Pair<Integer, Integer> newPos);
	
	
}
