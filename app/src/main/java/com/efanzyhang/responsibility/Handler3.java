package com.efanzyhang.responsibility;

/**
 * 项目名：MyApplication1024
 * 包名：com.efanzyhang.responsibility
 * 文件名：Handler1
 * 创建者：efan.zyhang
 * 创建时间：2018/10/25 11:07
 * 描述： TODO
 */
public class Handler3 extends AbstractHandler {
    @Override
    protected int getHandleLevel() {
        return 3;
    }

    @Override
    protected void handle(AbstractRequest request) {
        System.out.println(request.getRequestContent()+" request level:"+request.getRequestLevel()+" has been handled by"+" handle level:"+getHandleLevel());
    }
}
