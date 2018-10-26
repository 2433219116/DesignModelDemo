package com.efanzyhang.build;

/**
 * 项目名：MyApplication1024
 * 包名：com.efanzyhang.build
 * 文件名：ComputerOut
 * 创建者：efan.zyhang
 * 创建时间：2018/10/26 21:36
 * 描述： 宿主类和建造者类分离
 */
public class ComputerOut {
    public String mBroad;
    public String mCpu;
    public String mCache;
    public String mDiskCache;
    public String mDisplay;

    public ComputerOut(ComputerBuilder builder) {
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

    public static ComputerBuilder Builder(){
        return new ComputerBuilder();
    }
}
