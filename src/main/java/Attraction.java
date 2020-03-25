public abstract class Attraction {
    private String name;
    private double rating;
    private int visitCount;

    public Attraction(String name, double rating, int visitCount){
        this.name = name;
        this.rating = rating;
        this.visitCount = visitCount;

    }

    public String getName() {
        return name;
    }



    public int getVisitCount() {
        return visitCount;
    }

    public void setVisitCount(int visitCount) {
        this.visitCount = visitCount;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }
}
