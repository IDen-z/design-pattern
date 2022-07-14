package com.zmz.design.facade;

import java.io.File;
/**
 * @Description: 客户端代码
 * @Author: Zhu Mengze
 * @Date: 2021/9/29 10:59
 */
public class DemoMain {

    public static void main(String[] args) {
        VideoConversionFacade converter = new VideoConversionFacade();
        // 通过抽取一个外观实例 converter

        // 简化客户端的调用

        File mp4Video = converter.convertVideo("youtubevideo.ogg", "mp4");
        // ...
    }

}
