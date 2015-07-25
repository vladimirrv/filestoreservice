package com.foo.storeservice.server;

import java.util.logging.Logger;

import javax.jws.WebService;

import com.foo.storeservice.StoreService;

@WebService
public class StoreServiceImpl implements StoreService {

    private static final Logger LOG = Logger.getLogger(StoreServiceImpl.class.getPackage().getName());

    @Override
    public String storeMessage(String name) {
        LOG.info("Executing operation storeMessage");
        System.out.println("Executing operation storeMessage");
        System.out.println("Message received: " + name + "\n");
        return "Message " + name;
    }

}
