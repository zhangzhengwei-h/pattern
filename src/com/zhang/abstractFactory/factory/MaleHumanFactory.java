package com.zhang.abstractFactory.factory;

import com.zhang.abstractFactory.enums.HumanEnum;
import com.zhang.abstractFactory.human.Human;

public class MaleHumanFactory extends AbstreactHumanFactory{

	@Override
	public Human createWhiteHuman() {
		return super.createHuman(HumanEnum.WhiteMaleHuman);
	}

	@Override
	public Human createBlackHuman() {
		return super.createHuman(HumanEnum.BlackMaleHuman);
	}

	@Override
	public Human createYellowHuman() {
		return super.createHuman(HumanEnum.YellowMaleHuman);
	}
	
}
