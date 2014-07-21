package com.miko.lego;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author miroslavkopecky
 *
 * Simple Test Remote PlaySound
 */
public class RemoteCacheTest {

    @Test
    public void runRemoteSoundTest(){
        RemoteController remoteController = new RemoteControllerImp();
        assertTrue(remoteController.playSound());
    }

}
