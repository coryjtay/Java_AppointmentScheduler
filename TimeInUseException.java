package edu.orangecoastcollege.cs170.ctaylor82.ic22;

public class TimeInUseException extends Exception {

	public TimeInUseException() {
		super("Time is already booked, please enter a different time.");
	}

	public TimeInUseException(String customMessage) {
		super(customMessage);
	}
}
