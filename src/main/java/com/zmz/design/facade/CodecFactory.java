package com.zmz.design.facade;

/**
 * @Description: 复杂子系统  编码译码器
 * @Author: Zhu Mengze
 * @Date: 2021/9/29 10:53
 */
public class CodecFactory {

    public static Codec extract(VideoFile file) {
        String type = file.getCodecType();
        if (type.equals("mp4")) {
            System.out.println("CodecFactory: extracting mpeg audio...");
            return new MPEG4CompressionCodec();
        }
        else {
            System.out.println("CodecFactory: extracting ogg audio...");
            return new OggCompressionCodec();
        }
    }

}
