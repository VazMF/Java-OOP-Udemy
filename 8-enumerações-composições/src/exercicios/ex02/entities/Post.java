package exercicios.ex02.entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {

    private Date moment;
    private String title;
    private String content;
    private Integer likes;

    private List<Comment> comments = new ArrayList<>();
    private  static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    public Post() {
    }

    public Post(Date _moment, String _title, String _content, Integer _likes) {
        moment = _moment;
        title = _title;
        content = _content;
        likes = _likes;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date _moment) {
        moment = _moment;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String _title) {
        title = _title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String _content) {
        content = _content;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer _likes) {
        likes = _likes;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void addComment(Comment comment) {
        comments.add(comment);
    }

    public void removeComment(Comment comment) {
        comments.remove(comment);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(title + "\n");
        sb.append(likes);
        sb.append(" Likes - ");
        sb.append(sdf.format(moment) + "\n");
        sb.append(content + "\n");
        sb.append("Comments: \n");
        for (Comment comment : comments) {
            sb.append(comment.getText() + "\n");
        }
        return  sb.toString();
    }
}
