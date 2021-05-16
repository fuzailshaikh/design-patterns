package com.fuzailshaikh.structural.adapter;

public class Main {

	public static void main(String[] args) {
		MediaAdapter adapter = new MediaAdapter();
		adapter.play("mp4", "file/audio.mp4");
		adapter.play("mp3", "file/old-audio.mp3");
	}
	
}
