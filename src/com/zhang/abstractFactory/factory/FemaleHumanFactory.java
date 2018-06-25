package com.zhang.abstractFactory.factory;

import com.zhang.abstractFactory.enums.HumanEnum;
import com.zhang.abstractFactory.human.Human;

public class FemaleHumanFactory extends AbstreactHumanFactory{

	@Override
	public Human createWhiteHuman() {
		return super.createHuman(HumanEnum.WhiteFemaleHuman);
	}

	@Override
	public Human createBlackHuman() {
		return super.createHuman(HumanEnum.BlackFemaleHuman);
	}

	@Override
	public Human createYellowHuman() {
		return super.createHuman(HumanEnum.YellowFemaleHuman);
	}
	
}
