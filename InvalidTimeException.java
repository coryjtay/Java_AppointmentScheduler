package edu.orangecoastcollege.cs170.ctaylor82.ic22;

public class InvalidTimeException extends Exception {

	public InvalidTimeException() {
		super("Invalid time, please enter a time between 1 and 6 pm.");
	}

	public InvalidTimeException(String customMessage) {
		super(customMessage);
	}
}
