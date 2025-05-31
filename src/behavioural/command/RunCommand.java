package behavioural.command;

public class RunCommand {
    public void run() {
        TextEditor editor = new TextEditor();

        Command italicCommand = new ItalicsCommand(editor);
        Button button = new Button();
        button.setCommand(italicCommand);
        button.click();

        System.out.println(editor.getText());
    }
}
