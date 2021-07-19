package commandPattern;

import java.util.Stack;

public class CommandHistory {

	private Stack<Command> commandHistory = new Stack<>();

	public void push(Command c) {
		commandHistory.push(c);
	}

	public Command pop() {
		return commandHistory.pop();
	}

	public boolean isEmpty() {
		return commandHistory.isEmpty();
	}

}
