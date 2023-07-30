package section7_solid;

/**
 * S - Single Responsibility Principle
 *      - A Class should have one and only one reason to change
 *
 * O - Open-closed Principle
 *      - Objects or entities should be open for extension but closed for modification
 *
 * L - Liskov Substitution Principle
 *      - Objects of super class shall be replaced with objects of subclasses
 *
 * I - Interface Segregation Principle
 *      - A client should never be forced to implement an interface that it does not use
 *
 * D - Dependency Inversion Principle
 *      - High level modules should not directly depend on low level modules, instead they should depend on abstraction
 *
 */

public class solid5 {
    public static void main(String[] args) {
        MyMessenger messenger = new MyMessenger("TCP");
        messenger.send("a", "SOLID");
    }
}

// Application Layer - High Level Module
class MyMessenger {
    ProtocolHandler handler;
    public MyMessenger(String protocol){
        handler = ProtocolHandlerFactory.getProtocolHandler(protocol);
    }
    public void send(String to, String message){
        handler.sendMessage("message to " + to + " message " + message);
    }
}

// Transport Layer - Low Level Module
class TCPProtocolHandler implements ProtocolHandler {
    public void sendMessage(String message){
        System.out.println("TCPProtocolHandler sending message " + message);
    }
}

class UDPProtocolHandler implements ProtocolHandler {
    public void sendMessage(String message){
        System.out.println("UDPProtocolHandler sending message " + message);
    }
}


class ProtocolHandlerFactory {
    public static ProtocolHandler getProtocolHandler(String protocol){
        if("TCP".equalsIgnoreCase(protocol))
            return new TCPProtocolHandler();
        else if ("UDP".equalsIgnoreCase(protocol)) {
            return new UDPProtocolHandler();
        }
        else
            return null;
    }
}

interface ProtocolHandler {
    void sendMessage(String message);
}
