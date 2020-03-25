public class Rollercoaster extends Attraction implements ITicketed, IReviewed, IConnect {

    private double price;
   public Rollercoaster(String name, int rating, int visitorCount, double price){
    super(name, rating,visitorCount);
    this.price = price;
    }

    public boolean ticket(Visitor visitor){
       double actualPrice = this.price;
       if (visitor.getHeight() >= 200){
          actualPrice = this.price * 2;
       }
        if (visitor.getAge() >= 12 && visitor.getHeight() >= 145){
            this.setVisitCount(this.getVisitCount() + 1);

            visitor.setMoney(visitor.getMoney() - actualPrice);
            return true;
        }else{
            return false;
        }

    }

    public String getName(){
       return this.getName();
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String connect(String data){
       return "bullshit " + data;
    }
}
