package com.efanzyhang.responsibility;

/**
 * 项目名：MyApplication1024
 * 包名：com.efanzyhang.responsibility
 * 文件名：Request1
 * 创建者：efan.zyhang
 * 创建时间：2018/10/25 11:11
 * 描述： TODO
 */
public class Request1 extends AbstractRequest {
    public Request1(Object object) {
        super(object);
    }

    @Override
    protected int getRequestLevel() {
        return 1;
    }
}
