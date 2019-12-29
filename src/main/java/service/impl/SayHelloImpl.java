package service.impl;

import service.ISayHello;

public class SayHelloImpl implements ISayHello {

    @Override
    public void sayHello() {
        System.out.println("Hello");
    }
}
