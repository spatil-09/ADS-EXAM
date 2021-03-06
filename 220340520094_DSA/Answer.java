import java.util.Scanner;
class Answer{
	static class LinkedList
	{
		Node head;
		Node tail;
		LinkedList()
		{
			this.head = null;
			this.tail = null;
		}
		
	public void insert(int data)
	{
		Node newone = new Node(data);
		if(this.head == null)
		{
			this.head = newone;
		}
		else
		{
			this.tail.next = newone;
		}
		this.tail = newone;
	}
	

	public Node reverse(Node head)
	{
		//LinkedList llist = new LinkedList();
		Node n = head;
		int count = 0;
		while(n!=null)
		{
			count++;
			n = n.next;
		}
		int[] arr = new int[count];
		count = 0;
		while(n!=null && count<arr.length)
		{
			arr[count] = n.data;
			n = n.next;
			count++;
		}
		for(int i=arr.length-1;i>=0;i--)
		{
			
			this.insert(arr[i]);
			
		}
		return head;
		
	}
    }

	static class Node
	{
		Node next;
		int data;
		Node(int data)
		{
		this.data = data;
		this.next = null;
		}
		
	}
	
	public static void display(Node node)
	{
		while(node!=null)
		{
			System.out.println(node.data);
			node = node.next;
		}

	}


	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		for(int i=0;i<test;i++)
		{
			LinkedList llist = new LinkedList();
		int count = sc.nextInt();
		for(int j=0;j<count;j++)
		{
			int value = sc.nextInt();
			llist.insert(value);
		}
		Node rev = llist.reverse(llist.head);
		
		display(rev);
		}
	}
}