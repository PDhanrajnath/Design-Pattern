package com.designpattern.behavioral.state.demo;

public class Sound implements MobileAlertState {

    @Override
    public void alert(AlertStateContext alertStateContext) {
            System.out.println("sound...");
    }
}
