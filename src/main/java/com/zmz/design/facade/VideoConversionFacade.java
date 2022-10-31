package com.zmz.design.facade;

import java.io.File;

/**
 * @Description: 视频转换外观接口
 * @Author: Zhu Mengze
 * @Date: 2021/9/29 10:58
 */

/**
 *  通过创建一个封装所需功能并隐藏其他代码的外观类
 *
 *  使得客户端无需直接与各种复杂子系统进行交互，大大隐藏了系统的复杂性
 *
 *  也使得内部复杂子系统的相关接口方法并没有直接暴露给客户端
 *
 *  外观模式在代码编写中非常常见
 *
 *  在使用时避免出现  上帝对象  与所有的系统发生耦合
 *
 *
 *  通过引入本外观模式类 调用者无需知道编码译码 比特率读取的内部子系统的操作
 *  仅关注该类提供的convertVideo方法即可
 *
 */

public class VideoConversionFacade {

    // 外观模式整理复杂子系统  仅暴露一个接口给客户端调用
    public File convertVideo(String fileName, String format) {
        System.out.println("VideoConversionFacade: conversion started.");
        // 第一个子系统 VideoFile类 进行创建
        VideoFile file = new VideoFile(fileName);
        // 第二个子系统 编码译码器 根据传入的VideoFile类 返回Codec编码
        Codec sourceCodec = CodecFactory.extract(file);
        // 外观模式中的部分业务操作
        Codec destinationCodec;
        if (format.equals("mp4")) {
            destinationCodec = new OggCompressionCodec();
        } else {
            destinationCodec = new MPEG4CompressionCodec();
        }
        // 第三个子系统 比特率读取 并 转换
        VideoFile buffer = BitrateReader.read(file, sourceCodec);
        VideoFile intermediateResult = BitrateReader.convert(buffer, destinationCodec);
        File result = (new AudioMixer()).fix(intermediateResult);
        System.out.println("VideoConversionFacade: conversion completed.");
        return result;
    }

}
