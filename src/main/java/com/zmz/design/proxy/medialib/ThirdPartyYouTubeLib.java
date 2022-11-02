package com.zmz.design.proxy.medialib;

import java.util.HashMap;

/**
 * 远程服务接口
 */
public interface ThirdPartyYouTubeLib {

    HashMap<String, Video> popularVideos();

    Video getVideo(String videoId);

}
