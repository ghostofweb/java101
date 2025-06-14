public class interfaces {
    // we will take instance of YouTube
    private String title;
    private int numberOfLikes;

    public interfaces(String title, int numberOfLikes) {
        this.title = title;
        this.numberOfLikes = numberOfLikes;
    }

    public int getNumberOfLikes() {
        return numberOfLikes;
    }

    public void setNumberOfLikes(int numberOfLikes) {
        this.numberOfLikes = numberOfLikes;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return STR."interfaces{title='\{title}', numberOfLikes=\{numberOfLikes}}";
    }
}
