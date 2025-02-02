//has23
public boolean has23(int[] nums) {
  for(int i=0; i<nums.length; i++)
  {
    if(nums[i]==2 || nums[i]==3)
    {
      return true;
    }
  }
  return false;
}

//no23
public boolean no23(int[] nums) {
  for(int i=0; i<nums.length; i++)
  {
    if(nums[i]==2 || nums[i]==3)
    {
      return false;
    }
  }
  return true;
}

//makeLast
public int[] makeLast(int[] nums) {
  int[] arr=new int[nums.length*2];
  arr[arr.length-1]=nums[nums.length-1];
  return arr;
}

//double23
public boolean double23(int[] nums) {
 if(nums.length==0)
 {
   return false;
 }
 
 if(nums.length==1)
 {
   return false;
 }
 
 if(nums.length==2)
 {
   if(nums[0]==2 && nums[1]==2 || nums[0]==3 && nums[1]==3)
   {
     return true;
   }
 }
 return false;
}

//fix23
public int[] fix23(int[] nums) {
  for(int i = 0;i< nums.length-1;i++) 
    {
        if(nums[i]==2 && nums[i+1]==3)
        {
            nums[i+1]=0;
        }
    }
    return nums;
}

//start1
public int start1(int[] a, int[] b) {
 	int count=0;
	for(int i=0;i<1;i++)
	{
	  if(a.length > 0 && a[0] == 1)
	  {
		  count++;
	  }
	}
		  
	int core=count;
		  
	for(int i=0;i<1;i++)
	{
		if(b.length > 0 && b[0] == 1)
		{
		  core++;
		}
	}
	return core;
}

//biggerTwo
public int[] biggerTwo(int[] a, int[] b) {
  if(a[0]+a[1]<b[0]+b[1])
  {
    return b;
  }
  
  return a;
}

//makeMiddle
public int[] makeMiddle(int[] nums) {
  int[] middle={nums[nums.length / 2 - 1], nums[nums.length / 2]};
  return middle;
}

//plusTwo
public int[] plusTwo(int[] a, int[] b) {
  int[] twoArr={a[0], a[1], b[0], b[1]};
  return twoArr;
}
