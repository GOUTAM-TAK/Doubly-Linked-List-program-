package doubleLinkedList;

public class DoubleLinkedList {
	static class Node {
		private int data;
		private Node next;
		private Node prev;

		public Node() {
			data = 0;
			next = null;
			prev = null;
		}

		public Node(int ele) {
    		 this.data=ele;
    		 next=null;
    		 prev=null;
    	 }
     }

		private Node head;
		public DoubleLinkedList() {
			this.head=null;
		}
		
		public boolean isEmpty() {
			return head==null;
		}
		
		public void display() {
			if(isEmpty()) {
				throw new RuntimeException("list is Empty!!!");
			}
			Node trav=null;
			for(trav=head;trav!=null;trav=trav.next)
				System.out.print(trav.data+" ");
			System.out.println();
		}
		public int deleteFirst() {
			if(isEmpty()) {
				throw new RuntimeException("empty list!!!");
			}
			int ele = head.data;
			head=head.next;
			return ele;
		}
		public int deleteAtLast() {
			if(isEmpty()) {
				throw new RuntimeException("list is empty!!");
			}
			
		if(head.next==null) {
			return deleteFirst();
		}
		Node trav=head,temp=null;
		while(trav.next!=null) {
			temp=trav;
			trav=trav.next;
		}
		temp.next=null;
		return trav.data;
			
		}
		public void deleteAll() {
			if(isEmpty()) {
				System.out.println("already list empty!!");
				return;
			}
			head=null;
		}
		public int deleteAtPosition(int pos) {
			if(isEmpty()||pos<1) {
				throw new RuntimeException("list is empty!! or invalid position");
			}
			if(pos==1) {
				return deleteFirst();
			}else {
				Node trav=head,temp=null;
				for(int i=1;i<pos;i++) {
					if(trav.next==null) {
						System.out.println("position out of index!!!");
						return 0;
					}
					temp=trav;
					trav=trav.next;
				}
				if(trav.next==null) {
					return deleteAtLast();
				}else {
					temp.next=trav.next;
					return trav.data;
				}
			}
			
		}
		
		public int replaceNodeAtPosition(int ele,int pos) {
			if(isEmpty()||pos<1) {
				throw new RuntimeException("list empty!!! or Invalid operation");
			}
			Node newNode = new Node(ele);
			
			
			Node trav=head,temp=null;
			if(pos==1) {
				if(head.next==null) {
				head=newNode;
				return trav.data;
				}
				else {
					temp=head.next;
					newNode.next=head.next;
					 temp.prev=newNode;
			            head=newNode;
			            return trav.data;
				}
	           
			}
			for(int i=1;i<pos;i++) {
				if(trav.next==null) {
					throw new RuntimeException("position out of index!!!");
				}
				temp=trav;
				trav=trav.next;
				
			}
			if(trav.next==null) {
				temp.next=newNode;
				newNode.prev=temp;
				return trav.data;
			}
			temp.next=newNode;
			newNode.prev=temp;
			int value = trav.data;
			trav=trav.next;
			newNode.next=trav;
			trav.prev=newNode;
			return value;
		}
		public void addAtFirst(int ele) {
			Node newNode = new Node(ele);
			if(isEmpty()) {
				
				head=newNode;
				return;
				
			}
		
			newNode.next=head;
			head=newNode;
			
		}
		
		public void addAtPosition(int ele,int pos) {
			Node newNode = new Node(ele);
			if(isEmpty()) {
				System.out.println("list is empty so add at first node");
				head=newNode;	
				
			}
			else if(pos<=1) {
				newNode.next=head;
				head=newNode;
			}
			else {
				Node temp=null,trav=head;
				for(int i=1;i<pos;i++) {
					if(trav.next==null) {
						throw new RuntimeException("position not exist in list!!");
					}
					temp=trav;
					trav=trav.next;
				}
				newNode.prev=temp;
				temp.next=newNode;
				newNode.next=trav;
				trav.prev=newNode;
			}
		}
		
       public void addAtLast(int ele) {
    	   Node newNode = new Node(ele);
    	   Node trav=head;
    	   if(isEmpty()) {
    		   System.out.println("list already empty!! so add at first");
    		   head=newNode;
    		   return;
    	   }
    	   while(trav.next!=null) {
    		   trav=trav.next;
    	   }
    	   trav.next=newNode;
    	   newNode.prev=trav;
       }
}
