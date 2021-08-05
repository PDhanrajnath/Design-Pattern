package com.designpattern.behavioral.state.demo;

class AlertStateContext {
    private MobileAlertState currentState;

    public AlertStateContext() {
        //when constructor invokes vibration class is initiated until the state is changed
        currentState = new Vibration();
    }

    public void setState(MobileAlertState state) {
        currentState = state;
    }

    public void alert() {
        currentState.alert(this);
    }
}
