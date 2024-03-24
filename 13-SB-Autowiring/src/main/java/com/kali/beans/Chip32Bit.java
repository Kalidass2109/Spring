package com.kali.beans;

import org.springframework.stereotype.Component;

@Component("chip32")
public class Chip32Bit implements IChip {

	public Chip32Bit(){
		System.out.println("32Bit Chip :: Constructor");
	}
	@Override
	public boolean process() {
		System.out.println("chip32bit processing started....");
		return true;
	}

}
