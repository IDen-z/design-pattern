package com.zmz.design.facade;

/**
 * @Description: 复杂子系统  比特率读取
 * @Author: Zhu Mengze
 * @Date: 2021/9/29 10:55
 */
public class BitrateReader {

    public static VideoFile read(VideoFile file, Codec codec) {
        System.out.println("BitrateReader: reading file...");
        return file;
    }

    public static VideoFile convert(VideoFile buffer, Codec codec) {
        System.out.println("BitrateReader: writing file...");
        return buffer;
    }
}
