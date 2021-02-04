package factoryMethod;

public class Main {
    public static void main(String[] args) {
        Computer pc=ComputerFactory.getComputer("PC","2","500GB","2.4GHz");
        Computer server=ComputerFactory.getComputer("Server","4","1000GB","2.9GHz");
        System.out.println("Factory PC ::"+pc);
        System.out.println("Factory Server ::"+server);
    }
}
