package com.fuzailshaikh.structural.adapter;

public class Mp4Player implements AdvancedMediaPlayer {

	@Override
	public void playMp4(String fileName) {
		System.out.println("Playing " + fileName + " using MP4 player");
	}
	
}
