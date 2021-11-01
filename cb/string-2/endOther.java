public boolean endOther(String a, String b) {
  boolean same;
  String smaller;
  String larger;
  if (a.length() < b.length()){
    smaller = a;
    larger = b;
  }
  else{
    smaller = b;
    larger = a;
  }
  larger = larger.toLowerCase();
  smaller = smaller.toLowerCase();
  int i = larger.length() - smaller.length();
  if (larger.substring(0,i+1).equals(smaller) || larger.substring(i,larger.length()).equals(smaller)){
    same = true;
  }
  else{
    same = false;
  }
  return same;
}
