package yap.commands;

import static org.junit.Assert.fail;

import org.junit.Test;

import yap.commands.common.CommandExecutor;

public class CommandExecutorTest {
  
  @Test
  public void testCommandExecutor() {
    try {
      CommandExecutor executor = new CommandExecutor();
      
      executor.execute();
      
    } catch (Exception ex) {
      fail("Exception");
    }
  }
}
