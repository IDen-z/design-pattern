package com.zmz.design.abstractfactory;

/**
 * @Description: 抽象工厂
 * @Author: Zhu Mengze
 * @Date: 2021/9/27 20:02
 */

/**
 *  抽象工厂生产的是一类，比如gui工厂，button工厂和checkbox工厂都可以通过gui工厂生产
 *  提供了创建产品的接口
 *
 */
public interface GUIFactory {

    Button createButton();

    Checkbox createCheckbox();
}

/**
 *  抽象工厂方法具有开闭原则的倾斜性
 *
 *  例如如果我需要生产linux系统的button和checkbox时，
 *
 *  只需要新增一个linux系统的具体工厂类,以及对应的产品线即可
 *
 *  但是如果我想要生产除了button，checkbox以外的产品族，扩充一个新的dialog产品线时
 *
 *  那么所有的工厂都要进行修改
 *
 *
 *
 *
 */
