package com.designpattern.behavioral.state.demo;

class Vibration implements MobileAlertState {
    @Override
    public void alert(AlertStateContext alertStateContext) {
        System.out.println("vibration...");
    }

}
