public class Playground extends Attraction {

    public Playground(String name, int rating, int visitorCount){
        super(name, rating, visitorCount);
    }

    public boolean ticket(Visitor visitor, int price){
        if (visitor.getAge() >= 18){
            this.setVisitCount(this.getVisitCount() + 1);
            visitor.setMoney(visitor.getMoney() - price);
            return true;
        }else{
            return false;
        }
    }
}

