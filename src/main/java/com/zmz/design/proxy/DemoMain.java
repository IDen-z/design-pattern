package com.zmz.design.proxy;

import com.zmz.design.proxy.downloader.YouTubeDownloader;
import com.zmz.design.proxy.medialib.ThirdPartyYouTubeClass;
import com.zmz.design.proxy.proxyimpl.YouTubeCacheProxy;


/**
 * 代理模式常见于虚拟代理 动态代理 保护代理
 * <p>
 * 本demo通过利用一个缓存代理对象 实际执行的方法仍然是代理对象的method 但是通过利用缓存代理可以实现缓存功能
 * 当目标对象的执行过程无法修改时
 * 此时就可以通过代理模式建立代理对象实现 新增额外行为的目的
 */
public class DemoMain {

    public static void main(String[] args) {
        YouTubeDownloader naiveDownloader = new YouTubeDownloader(new ThirdPartyYouTubeClass());
        YouTubeDownloader smartDownloader = new YouTubeDownloader(new YouTubeCacheProxy());

        long naive = test(naiveDownloader);
        long smart = test(smartDownloader);
        System.out.print("Time saved by caching proxy: " + (naive - smart) + "ms");

    }

    private static long test(YouTubeDownloader downloader) {
        long startTime = System.currentTimeMillis();

        // User behavior in our app:
        downloader.renderPopularVideos();
        downloader.renderVideoPage("catzzzzzzzzz");
        downloader.renderPopularVideos();
        downloader.renderVideoPage("dancesvideoo");
        // Users might visit the same page quite often.
        downloader.renderVideoPage("catzzzzzzzzz");
        downloader.renderVideoPage("someothervid");

        long estimatedTime = System.currentTimeMillis() - startTime;
        System.out.print("Time elapsed: " + estimatedTime + "ms\n");
        return estimatedTime;
    }
}
