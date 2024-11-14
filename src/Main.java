public class Main {
    public static void main(String[] args) {
        SocialNetwork network = new SocialNetwork();

        User Bobby = new User("Bobby");
        User Christian = new User("Christian");
        User Mikkel = new User("Mikkel");
        User Christina = new User("Christina");
        User Fie = new User("Fie");
        User Nikolas = new User("Nikolas");

        System.out.println();

        network.addUser(Bobby);
        network.addUser(Christina);
        network.addUser(Mikkel);
        network.addUser(Christian);
        network.addUser(Fie);
        network.addUser(Nikolas);

        System.out.println();

        Bobby.addFriends(Christina);
        Bobby.addFriends(Mikkel);
        Bobby.addFriends(Nikolas);

        System.out.println();

        Bobby.createPost("Hejsa! jeg inviterer til fødselsdag d. 20/11, håber i kan komme!");

        System.out.println();

        Nikolas.createPost("Fedt!, det lyder hyggeligt, jeg kommer");

        System.out.println();



        Bobby.getPosts().get(0).Like();
        Bobby.getPosts().get(0).Like();
        Bobby.getPosts().get(0).Like();
        Bobby.getPosts().get(0).Like();
        Bobby.getPosts().get(0).displayPost();
        Nikolas.getPosts().get(0).Like();


        System.out.println();

        network.showFriendsPost(Bobby);

    }
}