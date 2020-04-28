package com.gqzdev.app;

import javax.servlet.ServletException;

public class Test {

    public static void main(String[] args) {
        try {
            SpringApplicationZhong.run();
        } catch (ServletException e) {
            e.printStackTrace();
        }
    }
}
