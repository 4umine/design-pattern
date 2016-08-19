package com.coderbike.abstractFactory;

/**
 * <p>amd主板<p/>
 * Created with IDEA
 * author: liubingguang
 * date: 2016/8/17 10:28
 */
public class AMDMainboard extends Mainboard {

    /**
     * 主板插槽针孔数
     */
    private int cpuHoles;

    public AMDMainboard(int cpuHoles) {
        this.cpuHoles = cpuHoles;
    }

    @Override
    public void caculate() {
        System.out.println("AMD主板插槽孔数：" + this.cpuHoles);
    }
}
