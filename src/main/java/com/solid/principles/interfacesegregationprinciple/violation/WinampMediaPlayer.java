package com.solid.principles.interfacesegregationprinciple.violation;

/**
 * This class violates the interface segregation principle because video player is not supported for
 * Winamp player, but we still have to implement it here. ISP states that instead of having single
 * interface, we should have client specific interface
 */
public class WinampMediaPlayer implements MediaPlayer {

  @Override
  public void playVideo() {
    throw new RuntimeException("Video player is not supported for Winamp player");
  }

  @Override
  public void playAudio() {
    System.out.println("Playing audio on Winamp player");
  }
}
