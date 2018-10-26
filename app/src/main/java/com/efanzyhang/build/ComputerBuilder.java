package com.efanzyhang.build;

/**
 * 项目名：MyApplication1024
 * 包名：com.efanzyhang.build
 * 文件名：ComputerBuilder
 * 创建者：efan.zyhang
 * 创建时间：2018/10/26 21:41
 * 描述： 建造类
 */
public class ComputerBuilder {
    public String mBroad = null;
    public String mCpu = null;
    public String mCache = null;
    public String mDiskCache = null;
    public String mDisplay = null;

    ComputerBuilder() {

    }

    public ComputerBuilder setBroad(String broad) {
        this.mBroad = broad;
        return this;
    }

    public ComputerBuilder setCpu(String cpu) {
        this.mCpu = cpu;
        return this;
    }

    public ComputerBuilder setCache(String cache) {
        this.mCache = cache;
        return this;
    }

    public ComputerBuilder setDiskCache(String diskCache) {
        this.mDiskCache = diskCache;
        return this;
    }

    public ComputerBuilder setDisplay(String display) {
        this.mDisplay = display;
        return this;
    }

    public ComputerOut build() {
        return new ComputerOut(this);
    }
}
