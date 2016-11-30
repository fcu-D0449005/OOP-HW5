package fcu.iecs.oop.pokemon;




public class GYM {

	
	public static void fight( Pokemon p1,  Pokemon p2) {
		int cp = 0;
		   
		if((int)(Math.random()*2+1)==1)
		{
			 p1 = new Pokemon("Psyduck", 100);
			 cp=cp+500;
			 System.out.println("Winner is Psyduck");
			 System.out.println(100+cp);
		}
		else
		{
		     p2 = new Pokemon("Pikachu", 300);
			 cp=cp+500;
			 System.out.println("Winner is Pikachu");
			 System.out.println(300+cp);
		}
	}

	
}
