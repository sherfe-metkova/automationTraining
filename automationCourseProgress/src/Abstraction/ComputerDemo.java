package Abstraction;

public class ComputerDemo {
    public static void main(String[] args) {

        Computer lenovo = new Computer(2019, 2899.0, false, 256.0, 100.0, "Windows");
        Computer dell = new Computer(2018,3490,true,256, 200, "iOS");

        lenovo.useMemory(100);
        dell.changeOperationSystem("Windows");

        lenovo.printFields(lenovo);
        dell.printFields(dell);

        System.out.println(dell.comparePrice(lenovo));

    }
}
