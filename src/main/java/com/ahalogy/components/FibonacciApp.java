package com.ahalogy.components;

import org.apache.commons.cli.Options;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.ParseException;
import org.apache.commons.cli.CommandLine;;

public class FibonacciApp 
{
    public static void main(String[] args)
    {
        Fibonacci f = new Fibonacci();
        int numInSequence = 0;
        Options options = new Options();
        CommandLineParser parser = new DefaultParser();
        
        options.addOption("n", true, "Number of terms in series");
        
        try {
        	CommandLine cmd = parser.parse(options, args);
        	
        	if (cmd.hasOption('n')) {
        		numInSequence = Integer.parseInt(cmd.getOptionValue('n'));
        	}
        	
        }
        catch (ParseException e) {
        	e.printStackTrace();
        }
        
        	
        f.generateSequence(numInSequence);
        
    }
}
