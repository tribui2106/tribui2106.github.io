package yap.commands.common;

import java.util.ArrayList;
import java.util.List;

public class CommandExecutor {

  private List<BaseCommand> commandList = new ArrayList<>();
  
  private ExecutionContext executionContext = new ExecutionContext();
  

  public void execute() throws CommandExecutionException {
    for (BaseCommand command : commandList) {
      try {
        command.execute();
      } catch (CommandExecutionException ex) {
        throw ex;
      }
    }
  }

  public void add(BaseCommand command) {
    commandList.add(command);
  }

  public BaseCommand get(int index) {
    return commandList.get(index);
  }
  
  public synchronized void setContext(String key, Object value) {
	  executionContext.addContext(key, value);
  }

}
