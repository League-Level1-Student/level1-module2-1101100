package _02_sea_creature;

public class seaCreatureRunner {
public static void main(String[] args) {
	
	SeaCreature sBob = new SeaCreature("Spongebob");
	sBob.eat();
	sBob.laugh();
	
	SeaCreature sWard = new SeaCreature("Squidward");
	sWard.eat();
	sWard.laugh();
	
	SeaCreature pat = new SeaCreature("Patrick");
	pat.eat();
	pat.laugh();
}
}
