public class test2test{

public static int div(){
int n = 253;
for(int i=0; i<50; i++){
  n = (n+3) / 2;
}
return n;
}

public static int disco(int x, int y){
  int m = x;
  int i = 1;
  while(m%y != 0){
    m = i*x;
    i += 1;
  }
  return m;
}

  
public static void main(String[] args){
  System.out.println(div());
    System.out.println(disco(10,8));

}


}
