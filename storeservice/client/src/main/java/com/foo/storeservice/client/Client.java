package com.foo.storeservice.client;

import com.foo.storeservice.StoreService;

public final class Client {

    StoreService service;

    public void setService(StoreService service) {
        this.service = service;
    }

    public void run() {
        System.out.println("Invoking sayHi...");
        System.out.println("server responded with: " + service.storeMessage("test message1"));
        System.out.println();
    }

}
