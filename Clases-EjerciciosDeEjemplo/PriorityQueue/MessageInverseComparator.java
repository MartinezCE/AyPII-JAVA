package PriorityQueue;

import java.util.Comparator;

public class MessageInverseComparator implements Comparator<Message> {

	@Override
	public int compare(Message messageA, Message messageB) {
		// TODO Auto-generated method stub
		return messageA.compareTo(messageB)* (-1);
	}

}
