package com.designpattern.behavioral.state.demo;

class Silent implements MobileAlertState {
    @Override
    public void alert(AlertStateContext alertStateContext) {
        System.out.println("silent...");
    }

}
