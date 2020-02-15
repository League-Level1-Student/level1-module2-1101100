package _03_smurf;

public class smurfRunner {

public static void main(String[] args) {
	
	Smurf handy = new Smurf("Handy");
	Smurf pSmurf = new Smurf ("Papa Smurf");
	Smurf smurfette = new Smurf ("Smurfette");
	
	handy.eat();
	String nameH = handy.getName();
	System.out.println(nameH);
	
	String namePS = pSmurf.getName();
	String pSHat = pSmurf.getHatColor();
	String pSGender = pSmurf.isGirlOrBoy();
	System.out.println(namePS);
	System.out.println(pSHat);
	System.out.println(pSGender);
	
	String nameSEtte = smurfette.getName();
	String sEtteHat = smurfette.getHatColor();
	String sEtteGender = smurfette.isGirlOrBoy();
	System.out.println(nameSEtte);
	System.out.println(sEtteHat);
	System.out.println(sEtteGender);
	
}
	
}
