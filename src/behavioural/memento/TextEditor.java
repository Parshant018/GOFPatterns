package behavioural.memento;

public class TextEditor {

    public String content;

    public void write(String content) {
        this.content = content;
    }

    public EditorMemento save() {
        return new EditorMemento(content);
    }

    public void restore(EditorMemento memento) {
        content = memento.getContent();
    }

    public String getContent() {
        return this.content;
    }
}
