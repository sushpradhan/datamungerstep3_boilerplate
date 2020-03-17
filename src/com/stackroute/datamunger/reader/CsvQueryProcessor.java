package com.stackroute.datamunger.reader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import com.stackroute.datamunger.query.DataTypeDefinitions;
import com.stackroute.datamunger.query.Header;

public class CsvQueryProcessor extends QueryProcessingEngine {
     File data;
     BufferedReader br;
	 String fileName;
	// Parameterized constructor to initialize filename
	public CsvQueryProcessor(String fileName) throws FileNotFoundException {
		this.fileName=fileName;
		
		
	}

	/*
	 * Implementation of getHeader() method. We will have to extract the headers
	 * from the first line of the file.
	 * Note: Return type of the method will be Header
	 */
	
	@Override
	public Header getHeader() throws IOException, FileNotFoundException{
		
		Header hd=new Header();
		data =new File(fileName);
		FileReader fr=new FileReader(data);
		br=new BufferedReader(fr);
		String query=br.readLine();
		{
		String[] res=query.trim().split(",");
		hd.setHeaders(res);
		return hd;
		}
		// read the first line

		// populate the header object with the String array containing the header names
	}

	/**
	 * getDataRow() method will be used in the upcoming assignments
	 */
	
	@Override
	public void getDataRow() {

	}

	/*
	 * Implementation of getColumnType() method. To find out the data types, we will
	 * read the first line from the file and extract the field values from it. If a
	 * specific field value can be converted to Integer, the data type of that field
	 * will contain "java.lang.Integer", otherwise if it can be converted to Double,
	 * then the data type of that field will contain "java.lang.Double", otherwise,
	 * the field is to be treated as String. 
	 * Note: Return Type of the method will be DataTypeDefinitions
	 */
	
	@Override
	public DataTypeDefinitions getColumnType() throws IOException {
		
		DataTypeDefinitions dt=new DataTypeDefinitions();
		
		data =new File("data/ipl.csv");
		FileReader fr=new FileReader(data);
		br=new BufferedReader(fr);
		
		String unused = br.readLine();
		String col=br.readLine();
		String[] out2=col.split(",");
		String res = "";
		for(int i=0;i<out2.length;i++)
		{
			try
			{
			Integer.parseInt(out2[i]);
			res=res.concat("java.lang.Integer ");
			}
			catch(Exception e)
			{
				try
				{
					Double.parseDouble(out2[i]);
					res=res.concat("java.lang.Double ");
				}
				catch(Exception f)
				{
					res=res.concat("java.lang.String ");
				}
			}
		}
		res=res.concat("java.lang.String");
		dt.setDataTypes(res.split(" "));

		return dt;
	}

}
