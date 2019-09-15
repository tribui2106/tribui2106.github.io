package yap.testutils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileUtils {
  public static void deleteFile(String filename) {
    try {
      Files.delete(Paths.get(filename));
    } catch (Exception ex) {
    }
  }

  public static boolean existFileName(String fileName) {
    return Files.exists(Paths.get(fileName));
  }

  public static void createReadOnlyDir(String fileName) throws IOException {
    Path roDir = Files.createDirectory(Paths.get(fileName));
  }
  
}
