package com.zhang.abstractFactory.enums;

public enum HumanEnum {
	YellowMaleHuman("com.zhang.abstractFactory.human.YellowMaleHuman"),
	YellowFemaleHuman("com.zhang.abstractFactory.human.YellowFemaleHuman"),
	WhiteMaleHuman("com.zhang.abstractFactory.human.WhiteMaleHuman"),
	WhiteFemaleHuman("com.zhang.abstractFactory.human.WhiteFemaleHuman"),
	BlackMaleHuman("com.zhang.abstractFactory.human.BlackMaleHuman"),
	BlackFemaleHuman("com.zhang.abstractFactory.human.BlackFemaleHuman");
	
	private String value = "";
	
	HumanEnum(String value){
		this.value = value;
	}
	
	public String getValue(){
		return this.value;
	}
}
