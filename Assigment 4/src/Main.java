import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		Animal[] animal = new Animal[12];
		animal[0] = new Bluejay();
		animal[1] = new Caterpillar();
		animal[2] = new Deer();
		animal[3] = new Fox();
		animal[4] = new Grass();
		animal[5] = new Grasshopper();
		animal[6] = new Hawk();
		animal[7] = new Mouse();
		animal[8] = new Rabbit();
		animal[9] = new Squirrel();
		animal[10] = new Trees();
		animal[11] = new Wolf();
		
		
		String[][] World = new String[15][15];
		
		for(int i = 0; i<World.length; i++) {
			for (int j = 0; j<World[i].length; j++) {
				World[i][j] = animal[rand.nextInt(11)].getName();
				System.out.print(World[i][j] + "   ");
			} 
			System.out.println("");
		}

		
	}

}
