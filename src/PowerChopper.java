import org.powerbot.script.PollingScript;
import org.powerbot.script.Script;
import org.powerbot.script.rt4.ClientContext;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Script.Manifest(name = "Chop'n'Drop", description = "Cuts Willow Logs and drops them")
public class PowerChopper extends PollingScript<ClientContext>{
    private List<Task> taskList = new ArrayList<Task>();

    @Override
    public void start() {
        taskList.addAll(Arrays.asList(new Chop(ctx), new Drop(ctx)));
    }
    @Override
    public void poll(){
        for(Task task:taskList){
            if(task.activate()){
                task.execute();
            }
        }
    }

}
