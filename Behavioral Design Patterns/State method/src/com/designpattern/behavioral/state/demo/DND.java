package com.designpattern.behavioral.state.demo;

public class DND implements MobileAlertState{
    @Override
    public void alert(AlertStateContext alertStateContext) {
            System.out.println("((---- DND mode ----))");
    }
}
