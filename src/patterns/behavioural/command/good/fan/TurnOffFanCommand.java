package patterns.behavioural.command.good.fan;

import patterns.behavioural.command.good.Command;

public class TurnOffFanCommand implements Command {

    private final Fan fan;
    public TurnOffFanCommand(Fan fan) {
        this.fan = fan;
    }
    @Override
    public void execute() {
        fan.turnOff();
    }
}
