#include<stdio.h>
	int main ()
	{
		int a[20],i,temp,j,n;
		printf("Enter the number of elements: ");
		scanf("%d",&n);
		printf("\n Enter the Array to be sort: ");
		for (i=0;i<n;i++)
		{
			scanf("%d",&a[i]);
		}
		printf("The sorted array is:\n");
		for(i=1;i<n-1;i++);
		{
			temp=a[i];
			j=i-1;
			while(j>=0 && temp<a[j])
			{
				a[j+1]=a[j];
				j=j-1;
			}
			a[j+1]=temp;
		}
		printf("\nSorted array:\n");
		for(i=0;i<n;i++)
		{
			printf("%d\t",a[i]);
		}
	}


