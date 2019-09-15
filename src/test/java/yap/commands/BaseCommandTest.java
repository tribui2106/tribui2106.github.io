package yap.commands;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Test;

import yap.commands.common.BaseCommand;
import yap.commands.common.CommandExecutionException;
import yap.commands.common.CommandParameter;

public class BaseCommandTest {
  
  class DummyCommand extends BaseCommand {

    @Override
    public Object execute() throws CommandExecutionException {
      return null;
    }    
  }
  
  @Test
  public void testParameter() {
    DummyCommand dummy = new DummyCommand();
    CommandParameter cmdParam = new CommandParameter();
    cmdParam.setName("server");
    cmdParam.setValue("localhost");
    dummy.addParameter(cmdParam);
    assertEquals("nr of parameter has to be > 0", 1, dummy.getNrParameters());
    assertNotNull("Value does not found", dummy.getParameter("server"));
    assertEquals("Value does not found", "localhost", dummy.getParameter("server").getValue());
  }
  
  @Test
  public void testParameterNotFound() {
    DummyCommand dummy = new DummyCommand();
    CommandParameter cmdParam = new CommandParameter();
    cmdParam.setName("server");
    cmdParam.setValue("localhost");
    dummy.addParameter(cmdParam);
    assertNull(dummy.getParameter("servers"));
  }
  
}
