package commands;

import picocli.CommandLine;


@CommandLine.Command(
		name = "hello",
		version = "1.0.0",
		mixinStandardHelpOptions = true,
		requiredOptionMarker = '*',
		description = "This simple description",
		header = "Sample Command",
		optionListHeading ="%nOption are:%n")
public class MainCommand implements Runnable {
	
	/*@CommandLine.Option(names= {"-h", "--help"}, usageHelp = true)
	private boolean help;*/
	
	@CommandLine.Option(
			names={"-u", "--user"},
			required = false, description = "Provide User Name", 
			paramLabel="username")
	private String user;
	
	@Override
	public void run(){
		if(user == null || user.length()==0) {
			System.out.println("[hello] Hello");
		}else {
			System.out.println("[hello] Hello " + user);
		}
		
	}
}
