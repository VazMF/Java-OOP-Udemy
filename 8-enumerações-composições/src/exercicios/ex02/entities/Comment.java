package exercicios.ex02.entities;

public class Comment {

    private String text;

    public Comment() {
    }

    public Comment(String _text) {
        text = _text;
    }

    public String getText() {
        return text;
    }

    public void setText(String _text) {
        text = _text;
    }
}
