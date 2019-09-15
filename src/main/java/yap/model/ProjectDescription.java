package yap.model;

public class ProjectDescription {
  String projectName;
  String version;
  ProjectType projectType;
  
  public String getProjectName() {
    return projectName;
  }
  public void setProjectName(String projectName) {
    this.projectName = projectName;
  }
  public String getVersion() {
    return version;
  }
  public void setVersion(String version) {
    this.version = version;
  }
  public ProjectType getProjectType() {
    return projectType;
  }
  public void setProjectType(ProjectType projectType) {
    this.projectType = projectType;
  }  
  
}
