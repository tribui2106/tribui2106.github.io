package yap.model;

public enum LanguageType {

  LANGUAGE_JAVA("Java"),
  LANGUAGE_JAVASCRIPT("Javascript"),  
  LANGUAGE_TYPESCRIPT("Typescript");
  
  private String language;
  
  private LanguageType(String language) {
    this.language = language;
  }


  public String getLanguage() {
    return language;
  }
  
  
}
