package com.coderbike.abstractFactory;

/**
 * <p>描述<p/>
 * Created with IDEA
 * author: liubingguang
 * date: 2016/8/17 10:39
 */
public class AMDFactory extends AbstracFactory {

    @Override
    public Cpu createCpu() {
        return new AMDCpu(938);
    }

    @Override
    public Mainboard createMainboard() {
        return new AMDMainboard(938);
    }
}
