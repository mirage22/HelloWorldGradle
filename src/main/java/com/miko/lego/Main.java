package com.miko.lego;

/**
 * @author miroslavkopecky
 *
 * Lego EV3 RemoteSound App
 *
 */
public class Main {

    public static void main(String[] args) {
        RemoteController remoteController = new RemoteControllerImp();
        remoteController.playSound();
    }

}
