#include <stdio.h>
#include <stdlib.h>

#define MAX 100
int cqueue[MAX],rear,front,choice,n,input;
void dequeue();
void enqueue();
void display();

int main(){
    rear=-1;
    front=-1;
    printf("Enter number between length 1-100: ");
    scanf("%d",&n);
    while(1){
        printf("\n1 for enqueue\n2 for dequeue\n3 for display\n4 to exit: ");
        scanf("%d",&choice);
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
                printf("Choose corect one: \n");
        }
    }

    return 0;
}
void dequeue(){
    if(front==-1&&rear==-1){
        printf("queue underflow \n");
        return;
    }else{
        printf("deleted: %d",cqueue[front]);
    }
    if(rear==front){
        rear=-1;
        front=-1;
    }else{
        front=(front+1)%n;
    }
}
void enqueue(){
    if((front==rear+1)||(front==0&&rear==n-1)){
        printf("queue overflow");
        return;
    }
    printf("\n enter your number: ");
    scanf("%d",&input);
    if(rear==-1&&front==-1){
        front=0;
        rear=0;
    }else{
        rear=(rear+1)%n;
    }
    cqueue[rear]=input;
}
void display(){
	int i;
    printf("\n");
    if(front==-1&&rear==-1){
        printf("empty \n");
        return;
    }
    int front_pos=front,rear_pos=rear;
    if(rear_pos<=front_pos){
        for(i=front_pos; i<=n-1;i++){
            printf("%d ",cqueue[i]);
        }
        front_pos=0;
        for( i=front_pos; i<=rear_pos;i++){
            printf("%d ",cqueue[i]);
        }
    }else{
        for( i=front_pos; i<=rear_pos;i++){
            printf("%d ",cqueue[i]);
        }
    }
    printf("\n");
}
