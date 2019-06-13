// INCLUDE HEADER FILES NEEDED BY YOUR PROGRAM
// SOME LIBRARY FUNCTIONALITY MAY BE RESTRICTED
// DEFINE ANY FUNCTION NEEDED
// FUNCTION SIGNATURE BEGINS, THIS FUNCTION IS REQUIRED
#include <stdio.h>
// Main function
int main()
{
  // Enter your code here 
  int n;
  int i;
  scanf("%d",&n);
  if(n==0||n==1)
  {
    printf("neither\n");
    return;
  }
  if(n<0)
  {
    printf("composite\n");
    return;
  }
  for(i=2;i<n;i++)
  {
    if(n%i==0)
    {
      printf("composite\n");
      return;
    }
  }
  printf("prime\n");
    
   return 0;
}