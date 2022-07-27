public class Node {
	public Node next;
	private String word;
	
	public Node() {
		
	}
	
	public Node(String word) {
		if(word!=null) {
			this.word=word;
		}
	}

	public String getWord() {
		return word;
	}
}