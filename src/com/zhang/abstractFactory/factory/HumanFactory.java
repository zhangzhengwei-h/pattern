package com.zhang.abstractFactory.factory;

import com.zhang.abstractFactory.human.Human;

public interface HumanFactory {
	Human createWhiteHuman();
	Human createBlackHuman();
	Human createYellowHuman();
}
