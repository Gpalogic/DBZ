package DBZ;
import java.util.Random;


public class Goku {
	private static int powerLvl;
	private int dragonFist;
	private int kamehamaha;
	private int spiritBomb;
	private int kiBlast;
	private int vanishingGauge;
	private int numOfCards = 4 ;
	private int dragonFistCard = 1;
	private int kamehamahaCard = 1;
	private int spiritBombCard = 1;
	private int kiBlastCard = 1;
	

public Goku() {
	this.powerLvl =  90000;
	this.dragonFist = 2400;	
	this.kamehamaha = 9000;
	this.spiritBomb = 15000;
	this.vanishingGauge = 100;
	this.kiBlast = 1000;
}
 public int getPowerLvl(){
	return powerLvl;
 }
  
 public int getDragonFist(){
	return dragonFist;
 }

 public int getkamehamaha(){
	return kamehamaha;
 }
 public int getkiBlast(){
	return kiBlast;
 }
 public int getSpiritBomb(){
	return spiritBomb;
 }
 public int getVanishingGauge(){
	return vanishingGauge;
 }
  public void attackCard(int val){
	 if (val == 1){
           
	 }

  }

 public void attackdragonFist(int val) {
      if(dragonFistCard > 0){
		dragonFistCard -= 1;
	  }
 }
 public void attackkamehamaha(int val) {
	if(kamehamahaCard > 0){
		kamehamahaCard -= 1;
	  }
 }
 public void attackspiritBomb(int val) {
	 if(spiritBombCard > 0){
		spiritBombCard -= 1;
	 }
	 
 }
 public void updatepowerLvl(int damage){
	powerLvl -= damage;
 }
  public void updatevanishingGauge(){
	this.vanishingGauge  = 100;
  }
  public void updateNumberOfCards(int cardUsed){
           numOfCards -= cardUsed;
  }
   public void addCard(int addCard){
	Random rand = new Random();
     if(numOfCards < 4 && rand.nextInt(4) + numOfCards < 4){
		numOfCards += addCard;
     }
	}
	public void vanishingGauge(int powerLvl){

	}
	public void optforCombo(int numOfCards){
		
	}
}
