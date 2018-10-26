package com.efanzyhang.single;

/**
 * 项目名：MyApplication1024
 * 包名：com.efanzyhang.single
 * 文件名：Test
 * 创建者：efan.zyhang
 * 创建时间：2018/10/24 19:45
 * 描述： TODO
 */
public class Test {

    public static void main(String[] args) {
        StoreHouse mStoreHouse1 = StoreHouse.newInstance();
        StoreHouse mStoreHouse2 = StoreHouse.newInstance();
        Carrier Carrier1 = new Carrier(mStoreHouse1);
        Carrier Carrier2 = new Carrier(mStoreHouse2);

        System.out.println("两个是不是同一个？");

        //这里用equals而不是用 == 符号，因为 == 符号只是比较两个对象的地址
        if (mStoreHouse1.equals(mStoreHouse2)) {
            System.out.println("是同一个");
        } else {
            System.out.println("不是同一个");
        }

        //搬运工搬完货物之后出来汇报仓库商品数量
        Carrier1.MoveIn(30);
        System.out.println("仓库商品余量：" + Carrier1.mStoreHouse.getQuantity());
        Carrier2.MoveOut(50);
        System.out.println("仓库商品余量：" + Carrier2.mStoreHouse.getQuantity());
    }

}
