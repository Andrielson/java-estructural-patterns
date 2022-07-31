package com.github.andrielson.adapter.tvPort.devices;

import com.github.andrielson.adapter.tvPort.intefaces.VGA;

public class OldMonitor implements VGA {

	@Override
	public void setImage(String image) {
		System.out.println(">>> This is your video: " + image);
	}
	
}
