package com.main;

import commands.MainCommand;
import picocli.CommandLine;

public class Main{


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new CommandLine(new MainCommand()).execute("-u=oleg");
		
		
		/*final CommandLine cmd = new CommandLine(new MainCommand());
		final CommandLine.ParseResult parseResult = cmd.parseArgs(args);
		if(!parseResult.errors().isEmpty()) {
			System.out.println(cmd.getUsageMessage());
		}
		int exitCode = cmd.execute(args);
		System.exit(exitCode);*/
    }
	
}