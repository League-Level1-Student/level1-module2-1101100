package _04_tea_maker;

import _04_tea_maker.Kettle.Water;

public class teaMakerRunner {
public static void main(String[] args) {
	TeaBag gTea = new TeaBag("GREEN");
	gTea.getFlavor();
	Kettle kettle = new Kettle();
	Water h20 = kettle.getWater();
	kettle.boil();
	Cup tCup = new Cup();
	
	if (h20.isHot() == true) {
	tCup.makeTea(gTea, h20);
	}
	
}
}
