#include<stdio.h>

int fact(int n);

int main(){
	int n;
	printf("Enter a Number: ");
	scanf("%d",&n);
	
	printf("\n Factorial of a number %d is: %d  \n",n,fact(n));
	return 0;
}
	int fact(int num)
	{
		if( num == 0){
			return 1;	
		}else{
		return(num*fact(num-1));
		}
	}

