package abstractMethod;

public class Main {

    public static void main(String[] args) {
        Computer pc=ComputerFactory.getComputer(new PCFactory("2","2.4Ghz","500GB"));
        Computer server=ComputerFactory.getComputer(new ServerFactory("4","3.9GHz","1TB"));
        System.out.println("PC:: "+pc);
        System.out.println("Server:: "+server);
    }

}
