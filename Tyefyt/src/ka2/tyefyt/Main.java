package ka2.tyefyt;


import ka2.tyefyt.pages.*;
import ka2.tyefyt.entities.Creature;
import ka2.tyefyt.entities.NotARat;

public class Main {

	public static void main(String[] args) {


		Creature tc = new NotARat();
		
		System.out.printf("%s%n%d/%d%n",tc.getDisplayName(),tc.getCurrentHP(),tc.getMaxHP());
		System.out.printf("%d:%d%n",tc.getPosition().x,tc.getPosition().y);
		
		
		tc.move(10,10);

		
		System.out.printf("%s%n%d/%d%n",tc.getDisplayName(),tc.getCurrentHP(),tc.getMaxHP());
		System.out.printf("%d:%d%n",tc.getPosition().x,tc.getPosition().y);
		
		tc.move(-21, 12);
		System.out.printf("%s%n%d/%d%n",tc.getDisplayName(),tc.getCurrentHP(),tc.getMaxHP());
		System.out.printf("%d:%d%n",tc.getPosition().x,tc.getPosition().y);
		
		
	}

}
