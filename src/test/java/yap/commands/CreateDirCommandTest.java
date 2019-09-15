package yap.commands;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;

import yap.testutils.FileUtils;

public class CreateDirCommandTest {

  @Test
  public void testCreateDirCommand() {
    String dirName = "./target/testCreateDir";
    CreateDirCommand createDirCmd = new CreateDirCommand();
    try {
      createDirCmd.setDirPath(dirName);
      createDirCmd.execute();
      assertEquals(dirName, createDirCmd.getDirPath());
      assertTrue(FileUtils.existFileName(dirName));
    } catch (Exception ex) {
      fail("Exception");
    } finally {
      FileUtils.deleteFile(dirName);
    }
  }

  @Test
  public void testCreateDirCommandError() {
    String dirName = null;
    CreateDirCommand createDirCmd = new CreateDirCommand();
    try {
      createDirCmd.setDirPath(dirName);
      createDirCmd.execute();
      fail("NullPointerException has been throw");
    } catch (Exception ex) {
      ex.printStackTrace();
    }
  }
  
}
