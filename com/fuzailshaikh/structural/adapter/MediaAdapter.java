package com.fuzailshaikh.structural.adapter;

public class MediaAdapter implements MediaPlayer {
	AdvancedMediaPlayer advancedMusicPlayer;

	public MediaAdapter() {
		advancedMusicPlayer = new Mp4Player();
	}

	@Override
	public void play(String audioType, String fileName) {
		if (audioType.equalsIgnoreCase("mp4")) {
			advancedMusicPlayer.playMp4(fileName);
		} else {
			System.out.println("Playing " + fileName + " using legacy player");
		}
	}

}
