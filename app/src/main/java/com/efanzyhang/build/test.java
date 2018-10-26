package com.efanzyhang.build;

/**
 * 项目名：MyApplication1024
 * 包名：com.efanzyhang.build
 * 文件名：Test
 * 创建者：efan.zyhang
 * 创建时间：2018/10/26 15:22
 * 描述： TODO
 */
public class test {
    public static void main(String[] args) {

        Computer computer = new Computer.Builder()
                .setBroad("ausaus")
                .setCache("8G")
                .setDiskCache("256GB")
                .setCpu("Intel core i7")
                .setDisplay("GEFORCE GTX960m")
                .build();

        System.out.println(computer);

        ComputerOut out=ComputerOut.Builder()
                .setBroad("12354")
                .setCache("4G")
                .setDiskCache("666GB")
                .setCpu("AMD")
                .setDisplay("A")
                .build();

        System.out.println(out);
    }
}
