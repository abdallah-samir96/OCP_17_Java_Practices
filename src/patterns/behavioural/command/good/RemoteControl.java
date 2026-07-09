package patterns.behavioural.command.good;

public class RemoteControl  {

    public void press(Command command) {
        command.execute();
    }
}