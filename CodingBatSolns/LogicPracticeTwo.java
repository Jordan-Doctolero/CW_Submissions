//alarmClock:
public String alarmClock(int day, boolean vacation) {
 if(vacation==false &&(day>=1 && day <=5))
 {
   return "7:00";
 }
 
 if(vacation==false &&(day==0 || day==6))
 {
   return "10:00";
 }
 
 if(vacation==true && (day>=1 && day<=5))
 {
   return "10:00";
 }
 
 else return "off";
}

//in1To10:
public boolean in1To10(int n, boolean outsideMode) {
  if(outsideMode==false && (n>=1 && n<=10))
  {
    return true;
  }
  
  if(outsideMode==true && (n<=1 || n>=10))
  {
    return true;
  }
  
  if(outsideMode==false && (n<=1 || n>10))
  {
    return false;
  }
 
  if(outsideMode==true && (n>1 || n<810))
  {
    return false;
  }
  
  
  else return false;
}

//old35:
public boolean old35(int n) {
  if(n%3==0 && n%5==0)
  {
    return false;
  }
  
  if(n%3==0 && n%5!=0)
  {
    return true;
  }
  
  if(n%3!=0 && n%5==0)
  {
    return true;
  }
  
  
  else return false;
  

}
