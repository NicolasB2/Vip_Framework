package utils;

import java.io.File;
import java.util.HashMap;

public class StatisticalReport {

	private HashMap<String, Double> counters;

	public StatisticalReport(HashMap<String, Double> counters) {
		super();
		this.counters = counters;
	}

	public StatisticalReport() {
		throw new UnsupportedOperationException();
	}

	public void initializateStatistics() {
		throw new UnsupportedOperationException();
	}

	public void addStatisticalCounter() {
		throw new UnsupportedOperationException();
	}
	
	public void updateCounters(int String, int Double) {
		throw new UnsupportedOperationException();
	}

	public File generateReport() {
		throw new UnsupportedOperationException();
	}
	
	public HashMap<String, Double> getCounters() {
		return counters;
	}

	public void setCounters(HashMap<String, Double> counters) {
		this.counters = counters;
	}


}