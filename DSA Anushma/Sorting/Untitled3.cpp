#include<stdio.h>
int main(){
	int a[20],n,low=0,upp,mid,key,i,loc=0;
	printf("enter number of array:");
	scanf("%d",&n);

	printf("enter the number in ascending order:\n");
	for(i=0;i<n;i++)
		scanf("%d",&a[i]);
	printf("enter element to be searched:");
	scanf("%d",&key);
	upp=n-1;
	while(low<=upp){
	
	mid=int((upp+low)/2);
	if(a[mid]==key){
	
		printf("element found at %d",mid);
		return 0;
	}
	if(key<a[mid]){
		upp=mid-1;
	}else if(key>a[mid]){
		low=mid+1;
	}
	}
	printf("item not found");
	return 0;
}
