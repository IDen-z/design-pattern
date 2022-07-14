package com.zmz.design.prototype;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;

/**
* @Description: 原型模式  通用形状接口  抽象类
* @Author: Zhu Mengze
* @Date: 2021/9/26 9:42
*/

/**
 *  在使用原型模式时，需要注意java中浅拷贝和深拷贝的区别
 *  主要在于引用对象是否copy
 *  深拷贝一般通过手动或者序列化的方式实现
 *
*/
@Data
@NoArgsConstructor
@AllArgsConstructor
public abstract class Shape {
    public int x;
    public int y;
    public String color;

    // 提供一个一目标对象为参数的有参构造
    public Shape (Shape target){
        if (target != null) {
            this.x = target.getX();
            this.y = target.getY();
            this.color = target.getColor();
        }
    }

    // 定义克隆方法
    public abstract Shape clone();

    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof Shape)) return false;
        Shape shape2 = (Shape) object2;
        return shape2.getX() == x && shape2.getY() == y && Objects.equals(shape2.getColor(), color);
    }





}
