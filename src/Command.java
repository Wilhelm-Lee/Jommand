import java.lang.String;

public class Command implements ICommand {

    public static final Command NULL_COMMAND = null;

    private String mName;
    private Command[] mSubcommands;

    public Command(String name, Command[] subcommands) throws IllegalArgumentException {

        if (name == null) {
            throw new IllegalArgumentException("Commands' names cannot applied to null!");
        }

        this.mName = name;

        if (subcommands == null) {
            this.mSubcommands = new Command[0];
        } else {
            this.mSubcommands = subcommands;
        }
    }

    @Override
    public int execution() {
        return 0;
    }
}

