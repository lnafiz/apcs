public boolean xyzThere(String str) {
   if ((str.length() > 2) && ((str.substring(0, 3)).equals("xyz"))){
        return true;
      }
 
 for (int i = 0; i <= str.length(); i++){
        if (i + 4 <= str.length()){
          if (((str.substring(i+1, i+4)).equals("xyz") && (!(str.substring(i, i+1)).equals(".")))){
            return true;
          }
        }
      }
      return false;
    }
*/
