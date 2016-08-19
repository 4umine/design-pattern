package com.coderbike.abstractFactory;

/**
 * <p>intel主板<p/>
 * Created with IDEA
 * author: liubingguang
 * date: 2016/8/17 10:26
 */
public class IntelMainboard extends Mainboard {

    /**
     * 主板插槽针孔数
     */
    private int cpuHoles;

    public IntelMainboard(int cpuHoles) {
        this.cpuHoles = cpuHoles;
    }

    @Override
    public void caculate() {
        System.out.println("Intel主板插槽孔数：" + this.cpuHoles);
    }
}
