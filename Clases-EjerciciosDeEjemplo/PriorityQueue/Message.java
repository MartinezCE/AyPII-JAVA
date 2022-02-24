package PriorityQueue;

public class Message implements Comparable<Message> {

private	String text;
private	Urgency urgency;

public Message(String text, Urgency urgency) {
	this.text = text;
	this.urgency = urgency;
}

@Override
public int compareTo(Message other) {
	// TODO Auto-generated method stub
	return this.urgency.compareTo(other.urgency);
}

@Override
public String toString() {
	return "Message [text=" + text + ", urgency= "+ urgency + "]";
}
	
	
}
