package com.efanzyhang.observer;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Observable;
import java.util.Observer;

/**
 * 项目名：MyApplication1024
 * 包名：com.efanzyhang.observer
 * 文件名：Coder
 * 创建者：efan.zyhang
 * 创建时间：2018/10/24 14:06
 * 描述： TODO
 */
public class Coder implements Observer {
    private String current;
    private String name;

    public Coder(String name) {
        this.name = name;
    }

    /**
     * 此方法中只看1就可以，其他只是测试时间，地区等
     * 此方法是接口实现的方法
     * @param o
     * @param arg
     */
    @Override
    public void update(Observable o, Object arg) {
        System.out.println(name + "收到了" + "Radio" + "发布的" + arg);//1
        Date d = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss SSSS", Locale.getDefault());
        current = simpleDateFormat.format(d);
        System.out.println(current+"     当前地区:"+Locale.getDefault()+"      被观察者："+o);
    }
}
