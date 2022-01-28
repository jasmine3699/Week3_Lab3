package com.info.cmd;

public class DontBuy implements Command {
    BookShelfDecider decider;
    
    
	public DontBuy(BookShelfDecider decider) {
		super();
		this.decider = decider;
	}


	@Override
	public void execute() {
		// TODO Auto-generated method stub
		decider.dontBuy();
	}

	
	
}
