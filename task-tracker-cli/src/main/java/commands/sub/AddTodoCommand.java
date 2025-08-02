package commands.sub;

import java.util.concurrent.Callable;

import picocli.CommandLine;

@CommandLine.Command(
		name = "add",
		version = "1.0.0",
		mixinStandardHelpOptions = true,
		requiredOptionMarker = '*',
		description = "This  is Sub command to 'todo' and adds the task to the list",
		header = "Add Todo SubCommand",
		optionListHeading ="%nOption are:%n",
		commandListHeading = "%nSubCommands are:%n",
		subcommands = {AddTodoCommand.class}
		)

public class AddTodoCommand implements Callable<Integer>{

	@Override
	public Integer call() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("[add] Add Command");
		return 0;
	}

}
