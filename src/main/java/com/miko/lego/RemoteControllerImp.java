package com.miko.lego;

import lejos.hardware.Audio;
import lejos.remote.ev3.RemoteEV3;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.MalformedURLException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;

/**
 * @author
 */
public class RemoteControllerImp implements RemoteController {
    private static final String EV3BRICK_IP = "YOUR IP ADDRESS";
    private Logger logger = LoggerFactory.getLogger(RemoteControllerImp.class);

    @Override
    public boolean playSound() {
        boolean result = false;
        try{
            logger.debug("PLAY SOUND");
            RemoteEV3 ev3Brick = new RemoteEV3(EV3BRICK_IP);
            ev3Brick.setDefault();

            Audio soundProcessor = ev3Brick.getAudio();

            List<Integer> tones = new ArrayList<>(asList(0,1,2,3,4,5));
            tones.forEach(tone -> {
                soundProcessor.systemSound(tone);
            });

            result = true;
        }catch (MalformedURLException e){
            logger.error("MalformedURLException = " + e);
        }catch (RemoteException e){
            logger.error("RemoteException = " + e);
        }catch (NotBoundException e){
            logger.error("NotBoundException = " + e);
        }
        return result;
    }

}
