package com.coderbike.abstractFactory;

/**
 * <p>电脑工程师<p/>
 * Created with IDEA
 * author: liubingguang
 * date: 2016/8/17 10:41
 */
public class ComputerEngineer {

    private Cpu cpu;
    private Mainboard mainboard;

    /**
     * 组装电脑
     * @param factory
     */
    public void makeComputer(AbstracFactory factory) {
        prepareHardwares(factory);
        testHardwares();
    }

    /**
     * 准备硬件
     */
    private void prepareHardwares(AbstracFactory factory) {
        this.cpu = factory.createCpu();
        this.mainboard = factory.createMainboard();
    }

    /**
     * 测试硬件
     */
    private void testHardwares() {
        if (this.cpu != null) {
            System.out.println("cpu已准备好");
            this.cpu.caculate();
        }

        if (this.mainboard != null) {
            System.out.println("主板已准备好");
            this.mainboard.caculate();
        }
    }
}
