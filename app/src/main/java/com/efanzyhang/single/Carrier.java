package com.efanzyhang.single;

/**
 * 项目名：MyApplication1024
 * 包名：com.efanzyhang.single
 * 文件名：Carrier
 * 创建者：efan.zyhang
 * 创建时间：2018/10/24 19:45
 * 描述： TODO
 */

/**
 * 搬货工人类
 */
public class Carrier {
        public StoreHouse mStoreHouse;

        public Carrier(StoreHouse storeHouse){
            this.mStoreHouse = storeHouse;
        }

        //搬货进仓库
        public void MoveIn(int i){
            mStoreHouse.setQuantity(mStoreHouse.getQuantity()-i);
        }

        //搬货出仓库
        public void MoveOut(int i){
            mStoreHouse.setQuantity(mStoreHouse.getQuantity()-i);
        }
}
