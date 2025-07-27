interface Animal {
    boolean feed(boolean timeToEat);
    void groom();
    void pet();
}

class Gorilla implements Animal {

    @Override
    public boolean feed(boolean timeToEat) {
        if (timeToEat) {
            System.out.println("Feeding gorilla..."); 
            return true;
        } else {
            System.out.println("Not time to eat.");
            return false;
        }
    }

    @Override
    public void groom() {
        System.out.println("Grooming gorilla...");
    }

    @Override
    public void pet() {
        System.out.println("Attempting to pet the gorilla...");
    }
}

public class Task_16 {
    public static void main(String[] args) {
        Gorilla g = new Gorilla();

        g.feed(true);
        g.groom();
        g.pet();
    }
}
