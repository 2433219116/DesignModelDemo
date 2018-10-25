package com.efanzyhang.responsibility;

/**
 * 项目名：MyApplication1024
 * 包名：com.efanzyhang.responsibility
 * 文件名：test
 * 创建者：efan.zyhang
 * 创建时间：2018/10/25 11:11
 * 描述： TODO
 */
public class test {

    public static void main(String args[]) {
        //实例化处理者对象
        Handler1 handler1 = new Handler1();
        Handler2 handler2 = new Handler2();
        Handler3 handler3 = new Handler3();

        //连接下一个节点
        handler1.nextHandler = handler2;
        handler2.nextHandler = handler3;

        //实例化请求者对象
        Request1 request1 = new Request1("request1");
        Request2 request2 = new Request2("request2");
        Request3 request3 = new Request3("request3");

        //处理请求对象
        handler1.handleRequset(request1);
        handler1.handleRequset(request2);
        handler1.handleRequset(request3);
    }


}
