package com.telran;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
public class UDPTest {
    Client client;

    @Before
    public void setup() throws Exception {
        new Server().start();
        client = new Client();
    }

    @Test
    public void whenCanSendAndReceivePacket__thenCorrect() throws Exception {
        String echo = client.sendEcho("hello server");
        assertEquals("hello server", echo);
        echo = client.sendEcho("server is working");
        assertFalse(echo.equals("hello server"));
    }

    @After
    public void tearDown() throws Exception {
        client.sendEcho("end");
        client.close();
    }
}