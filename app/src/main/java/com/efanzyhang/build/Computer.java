package com.efanzyhang.build;

/**
 * 项目名：MyApplication1024
 * 包名：com.efanzyhang.build
 * 文件名：Computer
 * 创建者：efan.zyhang
 * 创建时间：2018/10/26 15:08
 * 描述： 静态内部类方式实现
 */
public class Computer {
    public String mBroad;
    public String mCpu;
    public String mCache;
    public String mDiskCache;
    public String mDisplay;

    public Computer(Builder builder) {
        this.mBroad = builder.mBroad;
        this.mCpu = builder.mCpu;
        this.mCache = builder.mCache;
        this.mDiskCache = builder.mDiskCache;
        this.mDisplay = builder.mDisplay;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "mBroad='" + mBroad + '\'' +
                ", mCpu='" + mCpu + '\'' +
                ", mCache='" + mCache + '\'' +
                ", mDiskCache='" + mDiskCache + '\'' +
                ", mDisplay='" + mDisplay + '\'' +
                '}';
    }

    public static class Builder {
        public String mBroad;
        public String mCpu;
        public String mCache;
        public String mDiskCache;
        public String mDisplay;

        public Builder setBroad(String broad) {
            this.mBroad = broad;
            return this;
        }

        public Builder setCpu(String cpu) {
            this.mCpu = cpu;
            return this;
        }

        public Builder setCache(String cache) {
            this.mCache = cache;
            return this;
        }

        public Builder setDiskCache(String diskCache) {
            this.mDiskCache = diskCache;
            return this;
        }

        public Builder setDisplay(String display) {
            this.mDisplay = display;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }
}
