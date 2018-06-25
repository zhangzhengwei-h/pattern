package com.zhang.command;

public abstract class Command {
	protected CodeGroup cg = new CodeGroup();
	protected RequirementGroup rg = new RequirementGroup();
	protected PageGroup pg = new PageGroup();
	
	public abstract void execute();
}
