package com.zhang.abstractFactory.factory;

import com.zhang.abstractFactory.enums.HumanEnum;
import com.zhang.abstractFactory.human.Human;

public abstract class AbstreactHumanFactory implements HumanFactory{
	public Human createHuman(HumanEnum humanEnum){
		Human human = null;
		
		if(!humanEnum.getValue().equals("")){
			try {
				human = (Human) Class.forName(humanEnum.getValue()).newInstance();
			} catch (InstantiationException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		}
		
		return human;
	}
}
