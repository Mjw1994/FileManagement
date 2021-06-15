public class NameofFile {
  private String NameofFile;

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
