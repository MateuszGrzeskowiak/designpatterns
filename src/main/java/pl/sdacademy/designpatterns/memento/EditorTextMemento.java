package pl.sdacademy.designpatterns.memento;

public class EditorTextMemento {
    //te same pola co klasa, ktorej zapis reprezentujemy
    private String value;

    public EditorTextMemento(final EditorText editorText) {
        //deep copy!!!! nie shallow copy. tzn nie '=' dla obiektow!!!
        value = editorText.getValue();
    }

    public String getValue() {
        return value;
    }
}
