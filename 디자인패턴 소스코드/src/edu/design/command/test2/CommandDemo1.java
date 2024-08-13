package edu.design.command.test2;

// Command interface
interface Command {
    void execute();
}

// ConcreteCommand class to turn the light on
class LightOnCommand implements Command {
    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOn();
    }
}

// ConcreteCommand class to turn the light off
class LightOffCommand implements Command {
    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOff();
    }
}

// Receiver class
class Light {
    public void turnOn() {
        System.out.println("The light is on.");
    }

    public void turnOff() {
        System.out.println("The light is off.");
    }
}

// Invoker class
class Switch {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void press() {
        command.execute();
    }
}

// Client class
public class CommandDemo1 {
    public static void main(String[] args) {
        Light light = new Light();
        
        Command lightOn = new LightOnCommand(light);
        Command lightOff = new LightOffCommand(light);
        
        Switch lightSwitch = new Switch();
        
        lightSwitch.setCommand(lightOn);
        lightSwitch.press();
        
        lightSwitch.setCommand(lightOff);
        lightSwitch.press();
    }
}
