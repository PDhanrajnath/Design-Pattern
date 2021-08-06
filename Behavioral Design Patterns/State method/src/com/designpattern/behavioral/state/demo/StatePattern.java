package com.designpattern.behavioral.state.demo;

class StatePattern {

    public static void main(String[] args) {
        AlertStateContext stateContext = new AlertStateContext();
        stateContext.alert();
        stateContext.alert();
        stateContext.setState(new Sound());
        stateContext.alert();
        stateContext.setState(new Silent());
        stateContext.alert();
        stateContext.alert();
        stateContext.setState(new DND());
        stateContext.alert();
        stateContext.alert();
    }
}
