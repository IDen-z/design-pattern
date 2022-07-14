package com.zmz.design.prototype;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
/**
* @Description: 一个形状
* @Author: Zhu Mengze
* @Date: 2021/9/26 9:59
*/
public class Circle extends Shape {
    // 子类特有
    public int radius;

    public Circle(Circle target) {
        super(target);
        if (target != null) {
            this.radius = target.getRadius();
        }
    }

    @Override
    public Shape clone() {
        return new Circle(this);
    }

    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof Circle) || !super.equals(object2)) return false;
        Circle shape2 = (Circle) object2;
        return shape2.radius == radius;
    }
}
