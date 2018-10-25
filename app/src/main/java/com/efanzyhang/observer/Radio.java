package com.efanzyhang.observer;

import java.util.Observable;

/**
 * 项目名：MyApplication1024
 * 包名：com.efanzyhang.observer
 * 文件名：Radio
 * 创建者：efan.zyhang
 * 创建时间：2018/10/24 14:08
 * 描述： TODO
 */
public class Radio extends Observable {
    /**
     * 自定义方法
     * @param content
     */
    public void postMessage(String content) {
        //设置一个内部标志位注明数据发生了变化
        setChanged();
        //调用一个列表中所有的Observer的update()方法
        notifyObservers(content);
    }
}
