package com.zmz.design.factory.method;

import lombok.Data;

/**
 * @Description: 具体创建者-HtmlDialog
 * @Author: Zhu Mengze
 * @Date: 2021/9/26 19:19
 */
@Data
public class HtmlDialog extends Dialog {


    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
