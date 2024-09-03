import javax.crypto.Mac;

public class DependencyInversionPrinciple {
    public static void main(String[] args) {
        Keyboard keyboard = new WiredKeyboard();
        Mouse mouse = new WiredMouse();
        MacBook macBook = new MacBook(keyboard, mouse);
        macBook.use();
    }
}

//Classes should depend on interfaces rather than concrete class

// We should call interfaces but not classes
// Lets imagine there is keyboard(wired keyboard and wireless keyboard), mouse(wired mouse and wireless mouse)
interface Keyboard{
    public void keyboard();
}

class WiredKeyboard implements Keyboard{
    public void keyboard() {
        System.out.println("Wired Keyboard");
    }
}

class WirelessKeyboard implements Keyboard{
    public void keyboard() {
        System.out.println("Wireless Keyboard");
    }
}

interface Mouse{
    public void mouse();
}

class WiredMouse implements Mouse{
    public void mouse() {
        System.out.println("Wired Mouse");
    }
}

class WirelessMouse implements Mouse{
    public void mouse() {
        System.out.println("Wireless Mouse");
    }
}


// this is wrong because we have to call interfaces not concrete classes
//class MacBook{
//    private WirelessKeyboard wirelessKeyboard;
//    private WirelessMouse wirelessMouse;
//    MacBook(WirelessKeyboard wirelessKeyboard, WirelessMouse wirelessMouse) {
//        this.wirelessKeyboard = wirelessKeyboard;
//        this.wirelessMouse = wirelessMouse;
//    }
//}

class MacBook{
    private Keyboard keyboard;
    private Mouse mouse;
    public MacBook(Keyboard keyboard, Mouse mouse) {
        this.keyboard = keyboard;
        this.mouse = mouse;
    }

    public void use(){
        keyboard.keyboard();
        mouse.mouse();
    }



}

