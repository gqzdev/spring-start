package com.gqzdev.test;

/**
 * @ClassName: ClassPath
 * @author: ganquanzhong
 * @date: 2020/5/6 16:18
 */
public class ClassPath {

    public static void main(String[] args){

        System.out.println(ClassPath.class.getResource("/").getPath());
    }
}
