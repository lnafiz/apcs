public String makeOutWord(String out, String word) {
  String str = out;
  String a = str.substring(0,2);
  String b = str.substring(2,4);
  return a + word + b;
}
