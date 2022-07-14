package com.zmz.design.composite;

/**
 * @Description: 组合模式-通用形状接口
 * @Author: Zhu Mengze
 * @Date: 2021/10/8 16:32
 */
import java.awt.*;

public interface Shape {
    int getX();
    int getY();
    int getWidth();
    int getHeight();
    void move(int x, int y);
    boolean isInsideBounds(int x, int y);
    void select();
    void unSelect();
    boolean isSelected();
    void paint(Graphics graphics);
}