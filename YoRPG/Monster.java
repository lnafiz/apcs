public class Monster{
  private String name;
  private int health = 0;
  
  public Monster(String input){
    name = input;
  }
  
  public boolean isAlive(){
    return health > 0;
  }
  
  public int changeHealth(){
    health -= damage;
  }
}// end class
