package com.efanzyhang.observer;

/**
 * 项目名：MyApplication1024
 * 包名：com.efanzyhang.observer
 * 文件名：Test
 * 创建者：efan.zyhang
 * 创建时间：2018/10/24 14:04
 * 描述： TODO
 */
public class Test {
    public static void main(String args[]) {
        //实例化被观察者
        Radio radio = new Radio();
        //实例化多个观察者
        Coder coder1 = new Coder("张大大");
        Coder coder2 = new Coder("赵小小");
        Coder coder3 = new Coder("凌小小");
        //邦定观察者与被观察者
        radio.addObserver(coder1);
        radio.addObserver(coder2);
        radio.addObserver(coder3);
        //执行被观察者定义的方法
        radio.postMessage("你们今天要加班，而且没有加班费");
    }
}
