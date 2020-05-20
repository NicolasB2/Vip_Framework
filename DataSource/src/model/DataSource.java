package model;

import java.io.File;
import java.util.HashMap;

public class DataSource implements IDateSource {

	public final static String FILE_CSV = "FileCSV";
	public final static String DATA_BASE = "DataBase";

	private String type;
	private Source_db source_db;
	private Source_csv source_csv;
	
	public DataSource(File sourceFile, String split) {
		this.type = FILE_CSV;
		source_csv = new Source_csv(sourceFile, split);
	}

	public DataSource(HashMap<String, String> data) {
		this.type = DATA_BASE;
	}
	
	@Override 
	public String[] getHeaders() {

		switch (type) {
		case FILE_CSV:
			return source_csv.getHeaders();

		case DATA_BASE:
			return source_db.getHeaders();

		}
		return null;
	}

	@Override
	public String fetchNewtRow() {
		
		switch (type) {
		case FILE_CSV:
			return source_csv.fetchNewtRow();

		case DATA_BASE:
			return source_db.fetchNewtRow();

		}
		return null;
	}

}
