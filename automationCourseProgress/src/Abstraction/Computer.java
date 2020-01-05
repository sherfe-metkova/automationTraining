package Abstraction;

public class Computer {
    int year;
    double price;
    boolean isNotebook;
    double hardDiskMemory;
    double freeMemory;
    String operationSystem;

    Computer() {
        isNotebook = false;
        operationSystem = "Win XP";
    }

    Computer(int year, double price, double hardDiskMemory, double freeMemory) {
        this();
        this.year = year;
        this.price = price;
        this.hardDiskMemory = hardDiskMemory;
        this.freeMemory = freeMemory;
    }

    Computer(int year, double price, boolean isNotebook, double hardDiskMemory, double freeMemory, String operationSystem) {
        this.year = year;
        this.price = price;
        this.isNotebook = isNotebook;
        this.hardDiskMemory = hardDiskMemory;
        this.freeMemory = freeMemory;
        this.operationSystem = operationSystem;
    }

    public int comparePrice(Computer c) {
        if (price > c.price)
            return -1;
        else if (price < c.price)
            return 1;
        else
            return 0;
    }

    public void changeOperationSystem(String newOperationSystem) {
        operationSystem = newOperationSystem;
    }

    public void useMemory(double memory) {
        if (memory >= freeMemory)
            System.out.println("Not enough memory");
        else
            freeMemory = freeMemory - memory;
    }

    public void printFields(Computer computer) {
        System.out.println("Computer field values are:");
        System.out.println("Year: " + computer.year);
        System.out.println("Price: " + computer.price);
        System.out.println("Is it a notebook: " + computer.isNotebook);
        System.out.println("Free memory: " + computer.freeMemory);
        System.out.println("Operation system: " + computer.operationSystem);
    }
}
