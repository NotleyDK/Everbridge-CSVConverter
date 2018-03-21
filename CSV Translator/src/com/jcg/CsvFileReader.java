package com.jcg;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
/**
 * @author ashraf_sarhan
 *
 */
public class CsvFileReader {
	
	//Delimiter used in CSV file
	private static final String COMMA_DELIMITER = ",";
	
	//TODO - make this dynamic 
	//Possibly need to move this below the header line
	//to take advantage of number of rows and labels
	//might need to read in a config file to map headings to.
	//Step 1: Identify columns in customer file.
	//Step 2: Define matching/mapping for columns in EB format
	//Step 3: Call CustomerCSVImport to map columns
	//Step 4: Export data to CSV file.
	
	//TODO - Continue conversion to CustomerCSVImports class
	//List<CustomerCSVImport> CustomerCSVImports = new ArrayList<CustomerCSVImport>();
	
	//TODO These may become redundant as we use the CustomerCSVImport to map attributes
	//Student attributes index
	private static final int STUDENT_ID_IDX = 0;
	private static final int STUDENT_FNAME_IDX = 1;
	private static final int STUDENT_LNAME_IDX = 2;
	private static final int STUDENT_RECORDTYPE_IDX=3;
	private static final int STUDENT_GENDER = 4; 
	private static final int STUDENT_AGE = 5;
	
	
	public static void readCsvFile(String fileName, String fileName2) {

		BufferedReader fileReader = null;
     
        try {
        	
        	//Create a new list of student to be filled by CSV file data 
        	List<Student> students = new ArrayList<Student>();
        	
            String line = "";
            
            //Create the file reader
            fileReader = new BufferedReader(new FileReader(fileName));
            
            
            //Read the CSV file header to skip it
            fileReader.readLine();
            
            //TODO - Map these values to Everbridge values
            Reader in = new FileReader(fileName);
            CSVParser parser = new CSVParser(in, CSVFormat.DEFAULT);
            List<CSVRecord> csvRecords = parser.getRecords();
            parser.close();
            
            for(int itemNumber=0; itemNumber < csvRecords.get(0).size();itemNumber++ )
            {
            	System.out.println("Header item: " + csvRecords.get(0).get(itemNumber));
            }
            
            
            //TODO - MAP INGESTED HEADER LABELS TO EVERBRIDGE FORMAT
            //Initially this might need to be static, later selected and editable via GUI
            
            //Read the file line by line starting from the second line
            while ((line = fileReader.readLine()) != null) {
                //Get all tokens available in line
                String[] tokens = line.split(COMMA_DELIMITER);
                if (tokens.length > 0) {
                	//Create a new student object and fill his  data
					Student student = new Student(Long.parseLong(tokens[STUDENT_ID_IDX]), tokens[STUDENT_FNAME_IDX], tokens[STUDENT_LNAME_IDX], tokens[STUDENT_RECORDTYPE_IDX], tokens[STUDENT_GENDER], Integer.parseInt(tokens[STUDENT_AGE]));
					students.add(student);
				}
            }
            
            //Print the new student list
            for (Student student : students) {
				System.out.println("Student data imported:" + student.toString());
			}
            //Writing Student Data to CsvFileWriter
			CsvFileWriter.writeCsvFile(fileName2,students);
        } 
        catch (Exception e) {
        	System.out.println("Error in CsvFileReader !!!");
            e.printStackTrace();
        } finally {
            try {
                fileReader.close();
            } catch (IOException e) {
            	System.out.println("Error while closing fileReader !!!");
                e.printStackTrace();
            }
        }

	}

}