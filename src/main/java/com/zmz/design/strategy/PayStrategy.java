package com.zmz.design.strategy;

/**
 * 通用的支付方法接口
 */
public interface PayStrategy {

    boolean pay(int paymentAmount);

    void collectPaymentDetails();

}
