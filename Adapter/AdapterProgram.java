package Adapter;

public class AdapterProgram {

    public static void main(String[] args) {

        OldCoffeeMachine oldCoffeeMachine = new OldCoffeeMachine();

        CoffeeTouchscreenAdapter coffeeTouchscreenAdapter = new CoffeeTouchscreenAdapter();
        coffeeTouchscreenAdapter.setOldCoffeeMachine(oldCoffeeMachine);

        coffeeTouchscreenAdapter.chooseFirstSelection();
        coffeeTouchscreenAdapter.chooseSecondSelection();

    }

}
