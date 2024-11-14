public class Post {

    private User author;
    private String content;
    private int likes;

    public Post(User author, String content) {
        this.author = author;
        this.content = content;
        this.likes = 0;
    }

    public User getAuthor(){
        return author;
    }

    public String getContent() {
        return content;
    }

    public void Like(){
        likes++;
    }
    public void displayPost() {
        System.out.println("Post by " + author.getName() + ": " + content);
        System.out.println("Likes: " + likes);
    }
}
