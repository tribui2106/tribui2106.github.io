package yap.commands.common;

public class CommandParameter {
  private String name;
  private Object Value;
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public Object getValue() {
    return Value;
  }
  public void setValue(Object value) {
    Value = value;
  }    
}
