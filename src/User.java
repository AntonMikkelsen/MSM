import java.util.ArrayList;

public class User {

    private String name;
    private ArrayList<User> friends = new ArrayList<>();
    private ArrayList<Post> posts = new ArrayList<>();

    public User(String name){
        this.name = name;
        this.friends = new ArrayList<>();
        this.posts = new ArrayList<>();
    }

    public ArrayList<Post> getPosts() {
        return posts;
    }

    public ArrayList<User> getFriends() {
        return friends;
    }

    public String getName() {
        return name;
    }

    public void addFriends (User user){
        if (!friends.contains(user)){
            friends.add(user);
            System.out.println(user.getName() + "has been added to your friendslist");
        } else {
            System.out.println("User is already on your friendslist");
        }
    }

    public void createPost (String content){
        Post newPost = new Post(this, content);
        posts.add(newPost);
        System.out.println("New post created by " + name + ": " + content);

    }
}
