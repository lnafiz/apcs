public class test2test{
byte bruh = 89;    

public static int eleven(){
 double x = 5; double y = 2;
  int m = (int)(x + y + x / y - x * y - x / (10*y));
 return m;
}
 
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

 public static int add(){
   int p = 3;
   int q = 1;
   int sum = 0;
   while (p <= 10){
   sum += p%q;
     p+=1;
     q+=1;
   }
   return sum;
 }

public static int xAndY(){
  int x = 123; int y = 0;
  while (x>0){
  y *= 10;
  y += x%10;
  x /= 10;  
  }
  return y;
}
 
public static void main(String[] args){
  System.out.println(div());
    System.out.println(disco(10,8));
    System.out.println(add());
    System.out.println(3==2);
      System.out.println(!(1<=2));
    System.out.println(xAndY());
 System.out.println(eleven());
 
}


}
