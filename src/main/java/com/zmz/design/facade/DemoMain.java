package com.zmz.design.facade;

import java.io.File;
/**
 * @Description: 客户端代码  外观模式
 * @Author: Zhu Mengze
 * @Date: 2021/9/29 10:59
 */
public class DemoMain {

    public static void main(String[] args) {
        /**
         * 感觉外观模式理解起来还是很好理解的
         *
         * 其实有点像在引用第三方jar包以后
         *
         * 抽取一个 类进行( ZcyRequest )
         *
         * 封装jar包内复杂子系统的调用 我的理解有点像 工具类
         *
         * 但是具体有以下区别：
         *   外观类的成员方法不全是静态方法，而工具函数通常都由静态方法组成
         *   外观依托于一个子模块或者子系统的代码，而工具函数通常要求独立（简而言之一个外观对应一个子系统）
         *
         * 外观模式的缺点是很容易出现上帝对象
         *
         *
         * 外观模式就相当于在一个外观对象中完成所有子系统（无论是自身系统或者第三方类）
         * 的创建、调用等一系列操作
         * 相当于暴露给外界的仅仅只有外观对象，调用者无需关注其内部的复杂子系统是如何运作的
         *
         *
         */

        VideoConversionFacade converter = new VideoConversionFacade();
        // 通过抽取一个外观实例 converter

        // 简化客户端的调用

        File mp4Video = converter.convertVideo("youtubevideo.ogg", "mp4");
        // ...
    }

}
