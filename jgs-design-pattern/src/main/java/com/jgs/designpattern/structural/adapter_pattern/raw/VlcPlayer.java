package com.jgs.designpattern.structural.adapter_pattern.raw;

public class VlcPlayer implements AdvanceMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("Play vlc:" + fileName);
    }

    @Override
    public void playMp4(String fileName) {
        //
    }
}
