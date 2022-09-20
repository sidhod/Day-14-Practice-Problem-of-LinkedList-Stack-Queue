package queue;

import java.util.Scanner;


public class Queue {
	private int maxSize;  
	  private int[] queueArray;  
	  private int front;  
	  private int rear;  
	  private int currentSize;  
	
	
	public Queue(int size)  
	  {  
	    this.maxSize = size;  
	    this.queueArray = new int[size];  
	    front = 0;  
	    rear = -1;  
	    currentSize = 0;  
	  }  
	  /* Queue:Insert Operation */  
	  public void insert(int item)  
	  {  
	    /* Checks whether the queue is full or not */  
	    if(isQueueFull())  
	    {  
	      System.out.println("Queue is full!");  
	      return;  
	    }  
	    if(rear == maxSize - 1)  
	{  
	      rear = -1;  
	    }  
	    /* increment rear then insert element to queue */  
	    queueArray[++rear] = item;  
	    currentSize++;  
	    System.out.println("Item added to queue: " + item);  
	  }  
	  /* Queue:Delete Operation */    
	  public int delete()  
	  {  
	    /* Checks whether the queue is empty or not */  
	    if(isQueueEmpty())  
	    {  
	      throw new RuntimeException("Queue is empty");  
	    }  
	    /* retrieve queue element then increment */  
	    int temp = queueArray[front++];  
	    if(front == maxSize)  
	    {  
	      front = 0;  
	    }  
	    currentSize--;  
	    return temp;  
	  }  
	  /* Queue:Peek Operation */      
	  public int peek()  
	  {  
	    return queueArray[front];  
	  }  
	  /* Queue:isFull Operation */   
	  public boolean isQueueFull()  
	  {  
	    return (maxSize == currentSize);  
	  }      
	  /* Queue:isEmpty Operation */   
	  public boolean isQueueEmpty()  
	{  
	    return (currentSize == 0);  
	  }  
	public static void main(String[] args) {  
	    int choice=0;  
	    Scanner sc = new Scanner(System.in);  
	    Queue queue = new Queue(10);      
	    System.out.println("*********Stack Implementation using array*********\n"); 
	    
	  
	    while(choice != 4)  
	    {  
	        System.out.println("Chose one from the below options...");  
	        System.out.println("1.Push\n2.Pop\n3.Exit");  
	        System.out.println("Enter your choice \n");        
	        choice = sc.nextInt();  
	        switch(choice)  
	        {  
	            case 1:  
	            {   
	            	System.out.println("Enter value in queue");
	            	 int val = sc.nextInt();
	            	 queue.insert(val);
	               
	                break;  
	            }  
	            case 2:  
	            {  
	            	System.out.println("Item deleted from queue: " + queue.delete());
	                break;  
	            }  
	              
	            case 3:   
	            {  
	                System.out.println("Exiting....");  
	                System.exit(0);  
	                break;   
	            }  
	            default:  
	            {  
	                System.out.println("Please Enter valid choice ");  
	            }   
	        };  
	    }  
	}  

}
