/**
 * 
 */
package ka2.tyefyt.entities;

import ka2.tyefyt.pages.other.Pair;

/**
 * @author 
 *
 */
public abstract class Creature extends BaseEntity implements Moveable, Living {
	int hp;
	int maxhp;
	Pair<Integer,Integer> positon;
	public Creature(String name, int hp) {
		this.setName(name);
		this.setDisplayName(name);
		this.hp=hp;
		this.maxhp=hp;
		this.positon=new Pair<>(0,0);
		
	}
	
	@Override
	public Pair<Integer, Integer> getPosition() {
	return this.positon;
	}


	@Override
	public BaseEntity setPosition(Pair<Integer, Integer> pos) {
		this.positon=pos;
		return this;
	}

	@Override
	public int getCurrentHP() {
		return this.hp;
	}

	@Override
	public int getMaxHP() {
	return this.maxhp;
	}

	@Override
	public BaseEntity setMaxHP( int newMax) {
		this.maxhp=newMax;
		return this;
	}

	@Override
	public BaseEntity move(Pair<Integer, Integer> vector) {
		this.positon.x+=vector.x;
		this.positon.y+=vector.y;
		return this;
	}


}
