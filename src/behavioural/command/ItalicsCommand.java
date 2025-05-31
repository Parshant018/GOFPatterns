package behavioural.command;

public class ItalicsCommand implements Command{

    private TextEditor editor;

    public ItalicsCommand(TextEditor editor) {
        this.editor = editor;
    }

    @Override
    public void executeCommand() {
        editor.italicText();
    }
}
