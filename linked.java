package examples;

public class linked {
	        private Node head;
			private Node tail;
			private int size;
		
		public class Node
		{
			private int val;
			private Node next;
			public Node(int val)
			{
				this.val=val;
			}
			public Node(int val,Node next)
			{
				this.val=val;
				this.next=next;
			}
		}
		public void insertFirst(int val)
		{
			Node node=new Node(val);
			node.next=head;
			head=node;
			if(tail==null)
			{
				tail=head;
			}
			size=size+1;
			
		}
		public void insertLast(int val)
		{
			Node node=new Node(val);
			if(tail==null)
			{
				insertFirst(val);
				return;
			}
			else
			{
				tail.next=node;
				tail=node;
				size++;
			}
		}
		public void insertRandom(int val,int index)
		{
			
			if(index==0)
			{
				insertFirst(val);
				return;
			}
			else if(index==size)
			{
				insertLast(val);
				return;
			}
			else
			{
				Node temp=head;
				for(int i=1;i<index;i++)
				{
					temp=temp.next;
				}
				Node node=new Node(val,temp.next);
				temp.next=node;
				size++;
			}
		}
		public int deleteFirst()
		{
			int val=head.val;
			head=head.next;
			if(head==null)
			{
				tail=null;
			}
			size--;
			return val;
		}
		public int deleteLast()
		{
			if(size<=1)
			{
			 return	deleteFirst();
			}
			
				Node sec=get(size-2);
				int val=tail.val;
				tail=sec;
				tail.next=null;
			    size--;
			    return val;
		}
		public Node get(int index)
		{
			Node temp=head;
			for(int i=0;i<index;i++)
			{
				temp=temp.next;
			}
			return temp;
		}
		public int deleteRandom(int index)
		{
			Node prev=get(index-1);
			int val=prev.next.val;
			prev.next=prev.next.next;
			return val;
		}
		public void display()
		{
			Node temp=head;
			while(temp!=null)
			{
				System.out.print(temp.val+"->");
				temp=temp.next;
			}
			System.out.println("END");
		}
	    public static void main(String[] args)
	    {
	    	linked LL=new linked();
	    	LL.insertFirst(1);
	    	LL.insertFirst(2);
	    	LL.insertFirst(3);
	    	LL.insertFirst(4);
	    	LL.display();
	    	LL.insertLast(4);
	    	LL.insertLast(5);
	    	LL.insertLast(6);
	    	LL.insertRandom(9, 3);
	    	LL.display();
	    	LL.deleteFirst();
	    	LL.deleteLast();
	    	LL.deleteRandom(3);
	    	LL.display();
	    	
	    }
	}


