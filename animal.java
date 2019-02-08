class animal{
    public animal(String atype){
      type= new String(atype);
    }
    public String toString(){
      return "class is:"+" "+type+", ";
    }
    private String type;
    public void sound() {}
  }
class dog extends animal {
    public dog(String aname){
      super("dog");
      name= aname;
      breed= "unknown";
    }
    public dog(String aname, String abreed){
      super("dog");
      name=aname;
      breed=abreed;
    }
    @Override
    public String toString(){
      return super.toString()+" "+"name is:"+" "+name+", "+"breed is:"+" "+breed;
    }
    @Override
    public void sound(){
      System.out.println("waow   waow");
    }
    protected String name;
    protected String breed;

  }
  class cat extends animal{
    public cat(String aname){
    super("cat");
    name= aname;
    breed= "unknown";
   }
    public cat(String aname, String abreed){
      super("cat");
      name=aname;
      breed=abreed;
    }
    @Override
    public String toString(){
      return super.toString()+" "+"name is:"+" "+name+", "+"breed is:"+"  "+breed;
    }
    @Override
     public void sound(){
      System.out.println("miaaown");
     }
     protected String name;
     protected String breed;
  }
  class duck extends animal{
    duck(String aname){
    super("duck");
    name=aname;
    breed="unknown";
  }
  duck(String aname, String abreed){
    super("duck");
    name=aname;
    breed=abreed;
  }

  @Override
  public String toString(){
    return super.toString()+" "+"name is:"+" "+name+", "+"breed is:"+" "+breed;
  }
  @Override
  public void sound(){
    System.out.println(" quack quack");
  }
  protected String name;
  protected String breed;
}
class spanial extends dog{
  spanial(String aname){
  super(aname, "spanial");
}
}