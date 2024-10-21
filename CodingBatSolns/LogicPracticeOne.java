//cigarParty
public boolean cigarParty(int cigars, boolean isWeekend) {
  if(isWeekend)
    return 40<= cigars;
   
  else
  {
    return 40<= cigars && cigars <= 60;
  }

}

//dateFashion
public int dateFashion(int you, int date) {
     if(you <= 2 || date <= 2)
        return 0;
          
    if(you >= 8 || date >= 8)
        return 2;
     
    else
    {
       return 1;
    }
}

//squirrelPlay
public boolean squirrelPlay(int temp, boolean isSummer) {
  if (isSummer==true && (temp>= 60 && temp <=100))
  {
    return true;
  }
  
  if(isSummer==false && (temp>=60 && temp <=90))
  {
    return true;
  }
 
   else
   {
      return false;
   }
  
}

//caughtSpeeding
public int caughtSpeeding(int speed, boolean isBirthday) {
  if(isBirthday==true && speed>=66 && speed<86)
  {
    return 1;
  }
  
  if(isBirthday==true && speed<66)
  {
    return 0;
  }
  
  if(speed>61 && speed<=81)
  {
    return 1;
  }
  
  if(speed>=81)
  {
    return 2;
  }
  
  return 0;
  
}

//sortaSum
public int sortaSum(int a, int b) {
  if((a+b)>=10 && (a+b)<=19)
  {
    return 20;
  }
  else
  {
    return a+b;
  }
}
