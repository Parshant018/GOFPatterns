package behavioural.memento;

public class RunMemento {

    public void run() {
        TextEditor editor = new TextEditor();
        editor.write("Hello A");
        CareTaker careTaker = new CareTaker();
        careTaker.saveState(editor);
        editor.write("Hello B");
        careTaker.saveState(editor);

        careTaker.undo(editor);
        System.out.println(editor.getContent());
    }
}
