package com.kali.beans;

import org.springframework.stereotype.Component;

@Component("chip64")
public class chip64Bit implements IChip {

	public chip64Bit() {
		System.out.println("Chip64Bit :: Constructor");
	}
	@Override
	public boolean process() {
		System.out.println("chip64bit processing started....");
		return true;
	}

}
