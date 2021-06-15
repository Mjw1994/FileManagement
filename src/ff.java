public class ff {
    private String NameofFile;
  
    //list<NameofFile> files = new ArrayList<>();

    public void setNameofFile(String NameofFile){
        this.NameofFile=NameofFile;
    }
  
    public String getNameofFile(){
    return NameofFile;
  }
  
  
  @Override
  public String toString(){
      return "function [The file name ="+NameofFile+"is exixt]";
  }
  }
  