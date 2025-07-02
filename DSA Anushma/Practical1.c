int stack[100], choice, n, top, x,i;
void push();
void pop();
int main(){
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
