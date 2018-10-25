package com.efanzyhang.responsibility;

/**
 * 项目名：MyApplication1024
 * 包名：com.efanzyhang.responsibility
 * 文件名：AbstractRequest
 * 创建者：efan.zyhang
 * 创建时间：2018/10/25 10:35
 * 描述： TODO
 */
public abstract class AbstractRequest {
    //请求内容
    protected Object object;

    //内容赋值
    public AbstractRequest(Object object) {
        this.object = object;
    }

    //获取请求级别
    protected abstract int getRequestLevel();

    /**
     * 获取请求内容
     * @return
     */
    protected Object getRequestContent() {
        return object;
    }
}
