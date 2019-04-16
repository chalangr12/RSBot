import org.powerbot.script.PollingScript;
import org.powerbot.script.Script;
import org.powerbot.script.rt6.ClientContext;


@Script.Manifest(
        name = "Script Example",
        description = "Basic Script Example"
)
public class Main extends PollingScript<ClientContext> {
    @Override
    public void start() {
        System.out.println("Script Started!");
    }

    @Override
    public void poll() {
        System.out.println("Hello, RSBot!");
    }

    @Override
    public void stop() {
        System.out.println("Script Stopped!");
    }
}