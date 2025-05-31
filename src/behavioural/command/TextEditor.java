package behavioural.command;

public class TextEditor {
    private String content;

    public void boldText() {
        content = "Bold text";
    }

    public void italicText() {
        content = "Italic text";
    }

    public String getText() {
        return this.content;
    }
}
