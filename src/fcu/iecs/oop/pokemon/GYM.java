package fcu.iecs.oop.pokemon;




public class GYM {

	
	public static void fight( Pokemon p1,  Pokemon p2) {
		
		   
		if((int)(Math.random()*2+1)==1)
		{
			
			 System.out.println("Winner is "+p1.getName());
			 p1.setCp(100);
			 System.out.println(p1.getCp()+500); 
		}
		else
		{
		
			 System.out.println("Winner is "+p2.getName());
			 p2.setCp(300);
			 System.out.println(p2.getCp()+500);
		}
	}


}
