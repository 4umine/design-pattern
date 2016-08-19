package com.coderbike.abstractFactory;

/**
 * <p>intel cpu<p/>
 * Created with IDEA
 * author: liubingguang
 * date: 2016/8/17 10:21
 */
public class IntelCpu extends Cpu {

    /**
     * 针脚数
     */
    private int pinCount;

    public IntelCpu(int pinCount) {
        this.pinCount = pinCount;
    }

    @Override
    public void caculate() {
        System.out.println("Intel cpu针脚数：" + this.pinCount);
    }
}
