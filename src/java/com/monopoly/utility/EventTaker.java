/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.monopoly.utility;

import com.monopoly.client.ws.GameDoesNotExists_Exception;
import com.monopoly.client.ws.InvalidParameters_Exception;
import com.monopoly.ws.MonopolyWSClient;
import java.io.IOException;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Platform;

/**
 *
 * @author ShiloMangam
 */
public class EventTaker extends TimerTask {

    private MonopolyWSClient monopolyClient;

    public EventTaker(MonopolyWSClient monopolyClient) {
        this.monopolyClient = monopolyClient;
    }

    @Override
    public void run() {

        try {

            System.out.println("take events");
            try {
                this.monopolyClient.getEvents(this.monopolyClient.getLastEvent());
            } catch (GameDoesNotExists_Exception | IOException | InterruptedException ex) {
                Logger.getLogger(EventTaker.class.getName()).log(Level.SEVERE, null, ex);
            }

        } catch (InvalidParameters_Exception ex) {
            System.out.println("error");
        }
      

    }

}
