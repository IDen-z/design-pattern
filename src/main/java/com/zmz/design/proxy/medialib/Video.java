package com.zmz.design.proxy.medialib;

/**
 * 视频文件实体类
 */
public class Video {

    public String id;
    public String title;
    public String data;

    Video(String id, String title) {
        this.id = id;
        this.title = title;
        this.data = "Random video.";
    }




}
