//rotateLeft3
public int[] rotateLeft3(int[] nums) 
{
  int[]copyArr=new int[nums.length];
  boolean array=true;
  while(array)
		{
			copyArr[0] = nums[1];
      copyArr[1] = nums[2];
      copyArr[2] = nums[0];
			array=false;
		}
		return copyArr;
}

//reverse3
public int[] reverse3(int[] nums) {
  int[]copyArr=new int[nums.length];
  boolean array=true;
  while(array)
		{
			copyArr[0] = nums[2];
      copyArr[1] = nums[1];
      copyArr[2] = nums[0];
			array=false;
		}
		return copyArr;
}

//maxEnd3
public int[] maxEnd3(int[] nums) {
  int[]copyArr=new int[nums.length];
  if(nums[0]>nums[2])
  {
    	copyArr[0] = nums[0];
      copyArr[1] = nums[0];
      copyArr[2] = nums[0];
  }
  
  else if(nums[0]<nums[2])
  {
      copyArr[0] = nums[2];
      copyArr[1] = nums[2];
      copyArr[2] = nums[2];
  }
  
  else if(nums[0]==nums[2])
  {
      copyArr[0] = nums[0];
      copyArr[1] = nums[0];
      copyArr[2] = nums[0];
  }
  
  
  return copyArr;
  
}

//sum2
public int sum2(int[] nums) {
   if(nums.length == 0)
   {
        return 0;
   }
          
    if(nums.length == 1)
    {
        return nums[0];
    }
                    
    else
    {
    return nums[0] + nums[1];
    }
}

//middleWay
public int[] middleWay(int[] a, int[] b) {
  int[] new ={a[1], b[1]};
  return new;
}

//makeEnds
public int[] makeEnds(int[] nums) {
  int[] array ={nums[0], nums[nums.length-1]};
  return array;
}
