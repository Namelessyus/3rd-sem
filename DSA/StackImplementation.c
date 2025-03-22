#include <stdio.h>
#include <stdlib.h>

int stack[100], choice, n, top, x,i; //top is pointer
void push();
void pop();
void peek();
void display();
int main(){

top=-1;   //to empty the stack

printf("Enter the size of stack. (n<=100):");
scanf("%d", &n);

printf("\n 1 for push \n 2 for pop \n 3 for peek \n 4 for display \n 5 for exit");

while(1){
printf("\n Enter your choice: ");
scanf("%d" ,&choice);
switch(choice){
case 1:
push();
break;
case 2:
pop();
break;
case 3:
peek();
break;
case 4:
display();
break;
case 5:
exit(0);

default:
{
printf("\n Enter a valid choice 1-5");
}
}
}
return 0;
}
void push(){
if (top == n-1){// to check if the stack is full or not, overflow condition
printf ("\n Stack is overflowing");
}

else {
top=top+1;
printf("\nEnter the value to be pushed: ");
scanf("%d", &x);
stack[top]=x;
}
}

void pop(){
if(top == -1)
{
printf("\n Stack is underflow");
}
else
{
printf("\n The top most elements was %d", stack[top]);
top--;
}
}

void display()
{
if(top>=0)
{
printf("\n The element in Stack");
for(i=top; i>=0; i--){
printf("\n %d", stack[i]);
}

}
else{
printf("\n The stack is empty");
}
}

void peek(){
    if(top == -1)
{
printf("\n Stack is underflow");
}
else
{
printf("\n The top most elements is %d", stack[top]);
}
}
