package com.coderbike.abstractFactory;

/**
 * <p>amd cpu<p/>
 * Created with IDEA
 * author: liubingguang
 * date: 2016/8/17 10:24
 */
public class AMDCpu extends Cpu {

    /**
     * 针脚数
     */
    private int pinCount;

    public AMDCpu(int pinCount) {
        this.pinCount = pinCount;
    }

    @Override
    public void caculate() {
        System.out.println("AMD cpu针脚数：" + this.pinCount);
    }
}
