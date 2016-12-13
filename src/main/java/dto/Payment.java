package dto;


public class Payment {

    private String id;
    private String title;
    private int rating;

    public Payment(String id, String title, int rating) {
        this.id = id;
        this.title = title;
        this.rating = rating;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

}
