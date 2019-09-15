package yap.commands.common;

public class CommandExecutionException extends Exception {
  
  private static final long serialVersionUID = 6380028526697298668L;
  
  /**
   * The error code.
   */
  private final int errorCode;
  
  public CommandExecutionException() {
    super();
    errorCode = -1;
  }

  public CommandExecutionException(int errorCode) {
    this.errorCode = errorCode;
  }
  
  public CommandExecutionException(Throwable ex) {
    super(ex);
    errorCode = -1;
  }

  public CommandExecutionException(Throwable ex, int errorCode) {
    super(ex);
    this.errorCode = errorCode;
  }
  
  public int getErrorCode() {
    return errorCode;
  }
  
}
