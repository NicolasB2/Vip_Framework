package model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Source_csv implements IDateSource {

	private File sourceFile;
	private String split;
	private int currentPosition;

	public Source_csv(File sourceFile, String split) {
		this.sourceFile = sourceFile;
		this.split = split;
		this.currentPosition = 1;
	}

	@Override
	public String[] getHeaders() {

		String[] columns = null;
		BufferedReader br;

		try {
			
			br = new BufferedReader(new FileReader(sourceFile));
			String line = br.readLine();
			columns = line.split(split);
			br.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return columns;
	}

	@Override
	public String fetchNewtRow() {
		
		BufferedReader br;
		currentPosition++;
		String line = "";
		try {
			
			br = new BufferedReader(new FileReader(sourceFile));
			
			for (int i = 0; i <= currentPosition; i++) {
				 line = br.readLine();
			}
			
			br.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return line;
	}

	public File getSourceFile() {
		return sourceFile;
	}

	public void setSourceFile(File sourceFile) {
		this.sourceFile = sourceFile;
	}

	public String getSplit() {
		return split;
	}

	public void setSplit(String split) {
		this.split = split;
	}
	
	

}
