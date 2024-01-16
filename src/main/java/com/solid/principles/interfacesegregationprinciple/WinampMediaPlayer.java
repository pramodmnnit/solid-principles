package com.solid.principles.interfacesegregationprinciple;

public class WinampMediaPlayer implements AudioMediaPlayer {

  @Override
  public void playAudio() {
    System.out.println("Playing audio on Winamp player");
  }
}
