/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package io.github.theguy191919.udpft.net;

import io.github.theguy191919.udpft.protocol.ProtocolEventListener;

/**
 *
 * @author Yiwen Dong
 */
public interface AbstractProtocolSender {
    void send(byte[] bytearray);
    //void addListener(ProtocolEventListener listener);
    //void addListener(ProtocolEventListener listener, int listenFor);
}
