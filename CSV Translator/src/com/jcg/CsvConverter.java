package com.jcg;

import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;

public class CsvConverter implements ActionListener
{
 
   	JButton jbnConvert, jbnExit;
   	JFrame appFrame;
   	Container cPane;
   	
   	Date now = new Date();
    SimpleDateFormat formattedDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    

   	
   public static void main(String args[])
   {
      new CsvConverter();    
   }

   public CsvConverter()
   { 	
	
	    createGUI();

   }

   	public void createGUI(){
   		
   		/*Create a frame, get its content pane and set layout*/
   		appFrame = new JFrame("CSV Converter");

   		cPane = appFrame.getContentPane();
   		cPane.setLayout(new GridBagLayout());
   		
   		//Arrange components on contentPane and set Action Listeners to each JButton
   		arrangeComponents();
   		
   		//Frame Dimensions
   		appFrame.setSize(200,200);
   		appFrame.setResizable(true);
   		appFrame.setVisible(true);
   		appFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

   	}
   	
   	public void arrangeComponents()
   	{	    

   		jbnConvert  = new JButton("Convert");
   		jbnExit    = new JButton("Exit");


        //Action Buttons - Clear Display
        GridBagConstraints gridBagConstraintsx25 = new GridBagConstraints();
        gridBagConstraintsx25.gridx = 0;
        gridBagConstraintsx25.insets = new Insets(5,5,5,5); 
        gridBagConstraintsx25.gridy = 1;
        cPane.add(jbnConvert, gridBagConstraintsx25);

        //Action Buttons - Exit Application
        GridBagConstraints gridBagConstraintsx26 = new GridBagConstraints();
        gridBagConstraintsx26.gridx = 1;
        gridBagConstraintsx26.gridy = 1;
        gridBagConstraintsx26.insets = new Insets(5,5,5,5); 
        cPane.add(jbnExit, gridBagConstraintsx26);
   		
   		jbnConvert.addActionListener(this);
   		jbnExit.addActionListener(this);
   	}

   	//Listen for relevant event
   	public void actionPerformed (ActionEvent e)
   	{
   		
   		if (e.getSource() == jbnConvert)
   		{
            //TODO
   			convert();
        }

   		else if (e.getSource() == jbnExit)
   		{			
   			System.exit(0);
   		}
   		
   	}
   	

    public void convert(){
   	 
    	//TODO - Add file opening menu item.
    	String fileName = System.getProperty("user.home")+"/chubbContacts.csv";
 		String fileName2 = System.getProperty("user.home")+"/everbridgeContacts.csv";
 		
 		System.out.println("\nReading and Writing CSV file:");
 		CsvFileReader.readCsvFile(fileName,fileName2);
 		
 		System.out.println("Written CSV file...");
 		//CsvFileWriter.writeCsvFile(fileName2);
 		//CsvFileReader.writeCsvFile(fileName2);
    	
     }

   }
