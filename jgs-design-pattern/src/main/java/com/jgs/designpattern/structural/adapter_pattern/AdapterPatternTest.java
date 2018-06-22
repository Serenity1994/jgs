package com.jgs.designpattern.structural.adapter_pattern;

import com.jgs.designpattern.structural.adapter_pattern.raw.AudioPlayer;
import org.junit.Test;

public class AdapterPatternTest {
    @Test
    public void test(){
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("mp3","aaa.mp3");
        audioPlayer.play("mp4","bbb.mp4");
        audioPlayer.play("vlc","ccc.vlc");
        audioPlayer.play("avi","ddd.avi");
    }
}
