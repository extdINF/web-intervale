package dto;

import java.util.List;

public class Category implements Comparable<Category> {

    private String name;
    private String title;
    private int rating;
    private List<Payment> payments;

    public Category(String name, String title, int rating, List<Payment> payments) {
        this.name = name;
        this.title = title;
        this.rating = rating;
        this.payments = payments;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public List<Payment> getPayments() {
        return payments;
    }

    public void setPayments(List<Payment> payments) {
        this.payments = payments;
    }

    public int compareTo(Category o) {
        return o.getRating() - this.getRating();
    }
}
