package ka2.tyefyt.entities;

import java.util.Random;

public class NotARat extends Creature {
	Random rnd=new Random();
	
public NotARat() {
	super("NotARat",10);
	
	
	this.setPosition(rnd.nextInt(100),rnd.nextInt(100));
	
	
	this.setPosition(positon);
	this.setDisplayName("Not A Rat");
}

@Override
public void step() {
	this.move(rnd.nextInt(2)-1, rnd.nextInt(2)-1);
	// TODO Auto-generated method stub
	
}
}
