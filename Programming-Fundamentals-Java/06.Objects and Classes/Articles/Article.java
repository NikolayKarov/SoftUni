package ObjectsAndClasses_Exercises.Articles;

public class Article {
    public String title;
    public String content;
    public String author;

    public Article(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }


    public void edit(String newContent) {
        this.content = newContent;
    }

    public void changeAuthor(String newAuthor) {
        this.author = newAuthor;
    }

    public void rename(String newTitle) {
        this.title = newTitle;
    }

    @Override
    public String toString() {
        return title + " - " + content + ": " + author;
    }
}
