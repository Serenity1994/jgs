package com.jgs.designpattern.structural.adapter_pattern.raw;

public class Mp4Player implements AdvanceMediaPlayer {
    @Override
    public void playVlc(String fileName) {

    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Play mp4:" + fileName);
    }
}
