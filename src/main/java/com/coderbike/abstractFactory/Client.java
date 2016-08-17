package com.coderbike.abstractFactory;

/**
 * <p>客户端<p/>
 * Created with IDEA
 * author: liubingguang
 * date: 2016/8/17 10:48
 */
public class Client {

    public static void main(String[] args) {
        ComputerEngineer engineer = new ComputerEngineer();
        //engineer.makeComputer(new IntelFactory());

        engineer.makeComputer(new AMDFactory());
    }
}
