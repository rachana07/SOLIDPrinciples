public class InterfaceSegmentedPrinciple {
}

//Interfaces should be such that client should not implement unnecessary functions they do not need
interface RestaurantEmployee{
    public void cookFood();
    public void cleanDishes();
    public void serveCustomers();
}

//here when we create Waiter class, he do not cookFood() and cleanDishes(), these will be uncessary methods
//class Waiter implements RestaurantEmployee{
//    public void cookFood() {
//        //unecessary method
//    }
//    public void cleanDishes() {
//        //unecessary method
//    }
//    public void serveCustomers() {
//
//    }
//}

interface WaiterInterface{
    public void serveCustomers();
    public void takeOrder();
}

interface ChefInterface{
    public void decideMenu();
    public void cookDishes();
}

class Waiter implements WaiterInterface{
    public void serveCustomers() {
        System.out.println("Serving Customers");
    }
    public void takeOrder() {
        System.out.println("Taking Order");
    }
}
