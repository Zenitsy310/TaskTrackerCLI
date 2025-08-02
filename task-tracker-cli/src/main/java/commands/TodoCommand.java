package commands;

import java.util.concurrent.Callable;

import picocli.CommandLine;

@CommandLine.Command(
		name = "todo",
		version = "1.0.0",
		mixinStandardHelpOptions = true,
		requiredOptionMarker = '*',
		description = "This  is simple todo command",
		header = "Todo CLI",
		optionListHeading ="%nOption are:%n")

public class TodoCommand implements Callable<Integer> {
	final Integer SUCCESS = 0;
	final Integer FAILURE = 1;
	
	
	public static void main (String[] args) {
		int exitStatus = new CommandLine(new TodoCommand()).execute("--help");
		System.exit(exitStatus);
	}
	
	
	@Override
	public Integer call() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("[todo] Welcome to Todo");
		return SUCCESS;
	}
	
	

}
