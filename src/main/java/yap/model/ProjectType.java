package yap.model;

public enum ProjectType {
  
  STANDALONE_APP("Standalone"),
  SERVICE_APP("Service");
  
  private String typeName;
  
  private ProjectType(String typeName) {
    setTypeName(typeName);
  }

  public String getTypeName() {
    return typeName;
  }

  public void setTypeName(String typeName) {
    this.typeName = typeName;
  }
  
  
}
