package com.zmz.design.proxy.proxyimpl;

import com.zmz.design.proxy.medialib.ThirdPartyYouTubeClass;
import com.zmz.design.proxy.medialib.ThirdPartyYouTubeLib;
import com.zmz.design.proxy.medialib.Video;

import java.util.HashMap;

/**
 * 缓存代理
 * 本demo的核心 代理了ThirdPartyYouTubeLib的行为 同时新增了额外行为
 *
 */
public class YouTubeCacheProxy implements ThirdPartyYouTubeLib {
    private ThirdPartyYouTubeLib youtubeService;
    private HashMap<String, Video> cachePopular = new HashMap<String, Video>();
    private HashMap<String, Video> cacheAll = new HashMap<String, Video>();

    /**
     * 在实例化代理对象时 一定要把被代理对象同时实例化 这样才可以去执行目标对象的
     */
    public YouTubeCacheProxy() {
        this.youtubeService = new ThirdPartyYouTubeClass();
    }

    @Override
    public HashMap<String, Video> popularVideos() {
        if (cachePopular.isEmpty()) {
            cachePopular = youtubeService.popularVideos();
        } else {
            System.out.println("Retrieved list from cache.");
        }
        return cachePopular;
    }

    @Override
    public Video getVideo(String videoId) {
        Video video = cacheAll.get(videoId);
        if (video == null) {
            video = youtubeService.getVideo(videoId);
            cacheAll.put(videoId, video);
        } else {
            System.out.println("Retrieved video '" + videoId + "' from cache.");
        }
        return video;
    }

    public void reset() {
        cachePopular.clear();
        cacheAll.clear();
    }
}
