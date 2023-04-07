package P07ObjectsAndClassesExercise.P02Articles;

public class Article {
//•	Title – a string
//•	Content – a string
//•	Author – a string
    private String title;
    private String content;
    private String author;

    public Article(String title, String content, String author) {
        this.title=title;
        this.content=content;
        this.author=author;
    }

    public String getAuthor() {
        return this.author;
    }

    public String getContent() {
        return content;
    }

    public String getTitle() {
        return title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return String.format("%s - %s: %s", this.title, this.content, this.author);
    }




    //•	Edit (new content) – change the old content with the new one
//•	ChangeAuthor (new author) – change the author
//•	Rename (new title) – change the title of the article
//•	override ToString – print the article in the following format:
//            "{title} - {content}:{author}"


}
