package Adapter;

public class CoffeeTouchscreenAdapter implements CoffeeMachineInterface {

    private OldCoffeeMachine oldCoffeeMachine;

    public void setOldCoffeeMachine(OldCoffeeMachine oldCoffeeMachine) {
        this.oldCoffeeMachine = oldCoffeeMachine;
    }

    @java.lang.Override
    public void chooseFirstSelection() {
        this.oldCoffeeMachine.selectA();
    }

    @java.lang.Override
    public void chooseSecondSelection() {
        this.oldCoffeeMachine.selectB();
    }

}
