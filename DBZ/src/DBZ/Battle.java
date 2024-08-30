package DBZ;

import java.util.Random;

public class Battle {
	private Goku goku;
	private  Frieza frieza;
	public Battle(Goku goku, Frieza frieza){
		this.goku = goku;
		this.frieza = frieza;
	    
	}
	    
	   public void Introduction(){
         System.out.println("Now that Goku has awoken, can he stand up to get rid of this universe's evil, or is Frieza's power too much to bear for Goku.");
	   }

	   public void firsBattle(Goku goku, Frieza frieza){
		System.out.println("These are the lists of Goku's attacks, 1. dragonFist, 2. kamehameha, 3. spiritBomb, 4. kiBlast ");
		  while(goku.getPowerLvl() < 0 || frieza.getPowerLvl() < 0){
			 
		  }
	   }
	    private void cardsAvailabe(int dragonFistCard, int kamehamaha, int spiritBomb, int kiBlast){
			int numOfCards = 0;
			Random rand = new Random();
			for (int i = 0; i < 4; i++){
				int val = rand.nextInt(4)
				if(val == 1){
					
			}
				

				}

			}
		}
	   /**
	 * @param attack
	 */
	

	
	private void attack(int attack){
		    int card = 0;
            switch (attack) {
                case 1 -> {
                    goku.updateNumberOfCards(dragonFistCard);
                    frieza.updatepowerLvl(goku.getDragonFist());
                    System.out.println("Take this Frieza");
                }
                case 2 -> {
                    frieza.updatepowerLvl(goku.getkamehamaha());
                    System.out.println("Kamehamehaaaa");
                }
                case 3 -> frieza.updatepowerLvl(goku.getSpiritBomb());
                case 4 -> frieza.updatepowerLvl(goku.getkiBlast());
                default -> throw new IllegalArgumentException("Interval must be from 1-4, please choose again");
            }
	   }
	   public void oppositionattack(){
		   Random rand = new Random();
		   int attack = 0;
		  int card = rand.nextInt(4);
		switch (attack) {
			case 1 -> {
				goku.updatepowerLvl(frieza.getroundDash());
				System.out.println("Take this you swine ");
			}
			case 2 -> {
				goku.updatepowerLvl(frieza.getwarpWhip());
				System.out.println(" Have fun monkey ");
			}
			case 3 -> {
				goku.updatepowerLvl(frieza.getdestruction());
			}
			case 4 -> {
			goku.updatepowerLvl(frieza.getdeathBreak());

			}
			default -> throw new IllegalArgumentException("Interval must be from 1-4, please choose again");
		}
   }
		  

	   
	   public void combo(int combo){
		 System.out.println("Alright Frieza, here I go !: ");
	   }

		
	}
	

}

