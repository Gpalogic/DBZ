package DBZ;

public class Frieza {
		public static int powerLvl;
		private int roundDash;
		private int warpWhip;
		private int destruction;
		private int vanishingGauge;
		private int deathBreak;
		

 public Frieza () {
	 powerLvl = 530000;
	 this.roundDash = 1500;
	 this.warpWhip= 2000;
	 this.destruction = 30000;
	 this.deathBreak = 8000;

	 this.vanishingGauge = 0;
 }
 public int getPowerLvl(){
	return powerLvl;
 }
 
    public int getroundDash () {
    	return roundDash;
    }
    public int getwarpWhip () {
    	return warpWhip;
    }
    public int getdestruction() {
    	return destruction;
    }
	public int getdeathBreak(){
		return deathBreak;
	}
	public void updatepowerLvl(int damage){
		powerLvl -= damage;

	}
    public  void updatevanishingGauge() {
    	this.vanishingGauge = 100;
    }
 }

