package com.zmz.design.facade;

/**
 * @Description: 外观模式-复杂子系统 音响文件
 * @Author: Zhu Mengze
 * @Date: 2021/9/29 10:46
 */
public class VideoFile {

    private String name;
    private String codecType;

    public VideoFile(String name) {
        this.name = name;
        this.codecType = name.substring(name.indexOf(".") + 1);
    }

    public String getCodecType() {
        return codecType;
    }

    public String getName() {
        return name;
    }

}
