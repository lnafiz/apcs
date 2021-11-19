public class Protagonist{
  private String name;
  private int health = 100;
  private int nextAttackDmg;
  private int damage;
  
  public Protagonist(String input){
  name = input;
  }
  
  public String getName(){
    return name;
  }
  
  public boolean isAlive(){
    return health > 0;
  }
  
  public void changeHealth(int damage){
    health -= damage;
  }  
  
  public void specialize(){
    
  }
  
  public void normalize(){
  
  }
  
  public int attack(){
  
  }

}// end of class
