package com.solid.principles.interfacesegregationprinciple.violation;

public class VLCMediaPlayer implements MediaPlayer {

  @Override
  public void playVideo() {
    System.out.println("Playing video");
  }

  @Override
  public void playAudio() {
    System.out.println("Playing audio");
  }
}
