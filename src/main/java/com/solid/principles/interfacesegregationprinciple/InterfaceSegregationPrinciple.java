package com.solid.principles.interfacesegregationprinciple;

public class InterfaceSegregationPrinciple {

  public static void main(String[] args) {
    WinampMediaPlayer audioMediaPlayer = new WinampMediaPlayer();
    VLCMediaPlayer videoMediaPlayer = new VLCMediaPlayer();
    audioMediaPlayer.playAudio();
    videoMediaPlayer.playVideo();
    videoMediaPlayer.playAudio();
  }
}
