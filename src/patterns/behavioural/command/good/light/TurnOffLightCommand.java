package patterns.behavioural.command.good.light;

import patterns.behavioural.command.good.Command;

public class TurnOffLightCommand implements Command {

    private final Light light;

    public TurnOffLightCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOff();
    }
}