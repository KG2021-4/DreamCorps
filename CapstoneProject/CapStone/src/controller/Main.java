package controller;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new ControllerVideoManagement();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
