//doubleCharr
public String doubleChar(String str) {
  String strNew = "" ;
  
  for(int i=0; i<str.length(); i++) {
    strNew = strNew + str.charAt(i)+ str.charAt(i);
  }
  return strNew;
}

