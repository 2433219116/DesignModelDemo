package com.efanzyhang.single;

/**
 * 项目名：MyApplication1024
 * 包名：com.efanzyhang.single
 * 文件名：StoreHouse
 * 创建者：efan.zyhang
 * 创建时间：2018/10/24 19:45
 * 描述： TODO
 */

/**
 * 仓库类
 */
public class StoreHouse {
    private static StoreHouse storeHouse = null;
    //仓库商品数量
    private int quantity = 100;

    private StoreHouse() {
    }

    public static StoreHouse newInstance() {
        if (storeHouse==null){
            storeHouse=new StoreHouse();
        }
        return storeHouse;
    }

    //货物进出
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    //货物数量
    public int getQuantity() {
        return quantity;
    }

}
