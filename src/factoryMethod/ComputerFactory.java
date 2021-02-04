package factoryMethod;

public class ComputerFactory {
    public static Computer getComputer(String type, String ram, String cpu, String hdd) {
        if ("PC".equalsIgnoreCase(type)) {
            return new PC(ram, cpu, hdd);
        }
        else if ("Server".equalsIgnoreCase(type)){
            return new Server(ram, cpu, hdd);
        }
        return null;
    }
}
