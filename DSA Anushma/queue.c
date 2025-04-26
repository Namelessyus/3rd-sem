#include <stdio.h>
#include <stdlib.h>

int queue[100], choice, n, rear, front, x, i;
void enqueue();
void dequeue();
void display();
int main(){
	
	rear=-1;
	front=-1;
	
	printf("Enter lenght of queue (n<=100):");
	scanf("%d", &n);
	
	printf("\n 1 for enqueue \n 2 for dequeue \n 3 for display \n 4 for exit");
	while(1){
		printf("\n Enter your choice: ");
		scanf("%d" ,&choice);
		switch(choice){
			case 1:
				enqueue();
			break;
			case 2:
				dequeue();
			break;
			case 3:
				display();
			break;
			case 4:
				exit(0);
			default:
				printf("\n Enter a number between 1-5");		
		}
	}
	return 0;
}
	
void enqueue(){
	if (rear >= n-1){
		printf ("\n Queue is overflowing");
	}else{
		rear=rear+1;
		printf("\n Enter the value to be pushed: ");
		scanf("%d", &x);
		if(front==-1){
			front=0;
		}
	queue[rear]=x;
	}
}


void dequeue(){
	if(front == -1 || front==rear+1)
	{	
		printf("\n Queue is underflow");                                                                                                                                                                          
	}
	else
	{
		printf("\n The dequeue element is %d", queue[front]);
		front++;
	}
}


void display()
{
if(rear>=0)
{
printf("\n The element in Queue");
for(i=rear; i>=front; i--){ 
	printf("\n %d", queue[i]);
}

}
else{
	printf("\n The queue is empty");
}
}

