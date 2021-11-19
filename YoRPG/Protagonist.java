public class Protagonist{
  private String name;
  private int health = 100;
  private int nextAttackDmg;
  
  public Protagonist(String input){
  name = input;
  }
  
  public String getName(){
    return name;
  }
  
  public boolean isAlive(){
    return health > 0;
  }
  
  public void changeHealth(){
    health -= damage;
  }  
  
  }
}// end of class
