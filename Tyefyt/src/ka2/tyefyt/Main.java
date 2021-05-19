package ka2.tyefyt;


import ka2.tyefyt.entities.Creature;
import ka2.tyefyt.entities.NotARat;

public class Main {

	public static void main(String[] args) {


		Creature tc = new NotARat();
		
	System.out.println(tc.infoString());

	for(int n=0;n<100;n+=1) {
		tc.step();
		System.out.println(tc.infoString());
	}
	
	}

}
