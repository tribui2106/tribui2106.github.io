package yap.commands.common;

import java.util.ArrayList;
import java.util.List;

public abstract class BaseCommand {

	List<CommandParameter> paramList = new ArrayList<>();

	protected ExecutionContext context = null;

	private boolean ignoreOnError = false;

	public abstract Object execute() throws CommandExecutionException;

	public BaseCommand addParameter(CommandParameter... params) {
		for (CommandParameter param : params) {
			paramList.add(param);
		}
		return this;
	}

	public CommandParameter getParameter(String paramName) {
		String name;
		for (CommandParameter param : paramList) {
			name = param.getName();
			if (name != null && name.equalsIgnoreCase(paramName)) {
				return param;
			}
		}
		return null;
	}

	public int getNrParameters() {
		return paramList.size();
	}

	public boolean isIgnoreOnError() {
		return ignoreOnError;
	}

	public void setIgnoreOnError(boolean ignoreOnError) {
		this.ignoreOnError = ignoreOnError;
	}

}
