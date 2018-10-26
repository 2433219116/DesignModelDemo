package com.efanzyhang.responsibility;

/**
 * 项目名：MyApplication1024
 * 包名：com.efanzyhang.responsibility
 * 文件名：AbstractHandler
 * 创建者：efan.zyhang
 * 创建时间：2018/10/25 10:27
 * 描述： TODO
 */
public abstract class AbstractHandler {

    protected AbstractHandler nextHandler;

    /**
     * 处理请求方法
     *
     * @param request
     */
    protected void handleRequest(AbstractRequest request) {
        //判断请求级别和处理级别是否一致
        if (request.getRequestLevel() == getHandleLevel()) {
            //一致就由该对象处理
            handle(request);
        } else {
            //否则将请求分发给下一个对象
            if (nextHandler != null) {
                nextHandler.handleRequest(request);
            } else {
                //所有对象不为空时处理
                System.out.println("ALL HANDLER CAN NOT HANDLE THE REQUEST!");
            }
        }

    }

    /**
     * 处理级别
     * @return level
     */
    protected abstract int getHandleLevel();

    /**
     * 具体处理方式
     * @param request 请求对象
     *
     */
    protected abstract void handle(AbstractRequest request);
}
