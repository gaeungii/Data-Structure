package chap6;

public class QueueNode {
	int data;
	QueueNode next;
	
	public QueueNode(int data) {
		this.data = data;
		this.next = null;
	}
	public int getData() {
		return this.data;
	}
	public void nextNode(QueueNode next) {
		this.next = next;
	}
}
