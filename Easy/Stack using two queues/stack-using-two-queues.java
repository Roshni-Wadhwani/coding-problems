//{ Driver Code Starts
import java.util.*;


class StackUsingQueues
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
			Queues g = new Queues();
			
			int q = sc.nextInt();
			while(q>0)
			{
				int QueryType = sc.nextInt();
				if(QueryType == 1)
				{
					int a = sc.nextInt();
					g.push(a);
				}
				else if(QueryType == 2)
				System.out.print(g.pop()+" ");
			q--;
			}	
			System.out.println();
				
			
			
		t--;
		}
	}
}


// } Driver Code Ends



class Queues
{
    Queue<Integer> q1 = new ArrayDeque<Integer>();
    Queue<Integer> q2 = new ArrayDeque<Integer>();
    
    //Function to push an element into stack using two queues.
    void push(int a)
    {
	    // Your code here	
	    q1.add(a);
	    while(!q2.isEmpty()){
	        int top=q2.remove();
	        q1.add(top);
	    }
	    while(!q1.isEmpty())            {
	        int elem=q1.remove();
	        q2.add(elem);
	    }
    }
    
    //Function to pop an element from stack using two queues. 
    int pop()
    {
	    // Your code here
	    if(!q2.isEmpty())               return q2.remove();
	    return -1;
    }
	
}

