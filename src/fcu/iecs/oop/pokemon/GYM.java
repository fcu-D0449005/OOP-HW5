package fcu.iecs.oop.pokemon;




public class GYM {
	private static Pokemon p1;
	private static Pokemon p2;

	public static void fight( Pokemon p1,  Pokemon p2) {
		int cp = 0;
		   
		System.out.println((int)(Math.random()*2+1));
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

	public static Pokemon getP1() {
		return p1;
	}

	public static void setP1(Pokemon p1) {
		GYM.p1 = p1;
	}
	public static Pokemon getP2() {
		return p2;
	}

	public static void setP2(Pokemon p2) {
		GYM.p2 = p2;
	}
	

}
