package com.zhang.abstractFactory;

import com.zhang.abstractFactory.factory.FemaleHumanFactory;
import com.zhang.abstractFactory.factory.HumanFactory;
import com.zhang.abstractFactory.factory.MaleHumanFactory;
import com.zhang.abstractFactory.human.Human;

public class Test {
	public static void main(String[] args) {
		HumanFactory maleHumanFactory = new MaleHumanFactory();
		
		HumanFactory femaleHumanFactory = new FemaleHumanFactory();
		
		Human maleYellowHuman = maleHumanFactory.createYellowHuman();
		maleYellowHuman.cry();
		maleYellowHuman.laugh();
		maleYellowHuman.run();
		maleYellowHuman.sex();
		
		Human femaleWhiteHuman = femaleHumanFactory.createWhiteHuman();
		femaleWhiteHuman.cry();
		femaleWhiteHuman.run();
		femaleWhiteHuman.sex();
	}
}
