interface Worker {
    void work();
    void report();
}

abstract class Manager implements Worker {
    public void work() {
        System.out.println("Manager working...");
    }
    // did not implement report() — hence abstract
}

public class Interfaces extends Manager {
    public void report() {
        System.out.println("ProjectManager reporting...");
    }

    public static void main(String[] args) {
        Interfaces pm = new Interfaces();
        pm.work();
        pm.report();
    }
}
