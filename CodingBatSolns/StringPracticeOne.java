//helloName
public String helloName(String Jordan) {
   return "Hello " + Jordan + "!";
}

//makeABBA
public String makeAbba(String a, String b) {
    return a+b+b+a;
}

//makeTags
public String makeTags(String total, String points) {
   return "<" + total + ">" + points + "</"+ total + ">" ;
}

//firstHalf
public String firstHalf(String str) {
  int lengthOfString=str.length();
  int stringDivTwo=lengthOfString/2;
  return str.substring(0, stringDivTwo);
}
