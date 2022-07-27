public class ListOfWord {//Done 7/26/22.
	private Node head;
	
	public ListOfWord() {
		
	}
	
	public boolean append(String s){//This works 7-26-22.
		if(s!=null) {
			if(head==null) {
				head=new Node(s);
				return true;
			}
		
			if(head.getWord().equals(s))return false;//Checks for duplicate.
			
			Node n=head;
			while(n.next!=null) {
				if(n.getWord().equals(s))return false;//Stops any duplicate words.
				n=n.next;//Continually goes through the list.
			}
			n.next=new Node(s);
			if(n.next!=null)return true;
			else return false;
		}return false;
	}
	
	
	public boolean removeWord(String s) {//Done. -7/26/22
		if(head!=null||s!=null) {
			if(head.getWord().equals(s)&&head.next==null) {
				head=null;
				return true;//This removes the head if there is a match and only the head exists.
			}
			
			if(head.getWord().equals(s)) {
				head=head.next;
				return true;
			}	
		
			Node n=head;
			while(n.next!=null) {
				if(n.next.getWord().equals(s)) {
					n.next=n.next.next;
					return true;
				}
				n=n.next;
			}
		}return false;
	}
	
	
	public boolean locateWord(String s){//Works and tested 7/26/22
		if(s!=null&&head!=null) { 
			Node n=head;
			while(n.next!=null) {
				if(n.getWord().equals(s))return true;
				n=n.next;
			}
		}return false;
	}
	
	public void displayAllWords() {//Done and tested 7/25/22
		if(head!=null) {
			Node n=head;
			while(n!=null) {
				System.out.println(n.getWord());
				n=n.next;
			}
		}else System.out.println("List is empty!");
	}	
}