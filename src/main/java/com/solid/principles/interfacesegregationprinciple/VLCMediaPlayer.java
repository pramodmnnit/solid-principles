package com.solid.principles.interfacesegregationprinciple;

public class VLCMediaPlayer implements AudioMediaPlayer, VideoMediaPlayer {

  @Override
  public void playAudio() {
    System.out.println("Playing audio on VLC player");
  }

  @Override
  public void playVideo() {
    System.out.println("Playing video on VLC player");
  }
}
