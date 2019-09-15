package yap.commands;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import yap.commands.common.BaseCommand;
import yap.commands.common.CommandExecutionException;

public class CreateDirCommand extends BaseCommand {

  private String dirPath;

  @Override
  public Object execute() throws CommandExecutionException {
    Path path = Paths.get(dirPath);

    if (!Files.exists(path)) {
      try {
        Files.createDirectory(path);
      } catch (Exception ex) {
        throw new CommandExecutionException(ex);
      }
    }
    return null;
  }

  public String getDirPath() {
    return dirPath;
  }

  public void setDirPath(String dirPath) {
    this.dirPath = dirPath;
  }

}
