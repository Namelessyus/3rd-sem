#include <stdio.h>
#include <stdlib.h>

int cqueue[100], choice, n, rear, front, x, i;
void enqueue();
void dequeue();
void display();
int main(){
	
		rear=-1;
		front=-1;
		
		printf("Enter the length of circular queue where maximum lenght is 100: ");
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
		if(front==0 && rear==100-1){
			printf ("\n Circular Queue is overflowing");
		}else{
			rear=(rear+1)%100;
			printf("\n Enter the value to be pushed: ");
			scanf("%d", &x);
			if(front==-1 && rear ==-1){
				front=0;
				rear=0;
			}
		cqueue[rear]=x;
		}
	}

void dequeue(){
		if(front == -1 && rear==0)
		{	
			printf("\n Circular queue is underflowing");                                                                                                                                                                          
		}
		else if(rear==front)
		{
			printf("\n The dequeue element is %d", cqueue[front]);
		    rear=-1;
	        front=-1;
	    }else{
	        printf("deleted: %d",cqueue[front]);
	        front=(front+1)%100;
	    }
	}
	
void display(){
	int front_pos = front,rear_pos=rear;
		if(front == -1)
		{
			printf("Circular Queue is empty \n");
			return;
		}
		prtintf("Circular Queue elements: \n");
		if(front_pos <=rear_pos)
		while(front_pos <=rear_pos)
		{
			printf("%d", cqueue[front_pos]);
			front_pos++;
		}
		else
		{
		while(front_pos <= 100-1)
		{
			printf("%d",cqueue[front_pos]);
			front_pos++;
		}
		front_pos=0;
		while(front_pos <= rear_pos)
		{
			printf("%d", cqueue[front_pos]);
			front_pos++;
		}
		}
		printf("\n");
		}
		



	
