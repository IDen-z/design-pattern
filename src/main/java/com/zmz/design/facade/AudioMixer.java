package com.zmz.design.facade;

import java.io.File;

/**
 * @Description: 复杂子系统  混音
 * @Author: Zhu Mengze
 * @Date: 2021/9/29 10:55
 */
public class AudioMixer {

    public File fix(VideoFile result){
        System.out.println("AudioMixer: fixing audio...");
        return new File("tmp");
    }
}
