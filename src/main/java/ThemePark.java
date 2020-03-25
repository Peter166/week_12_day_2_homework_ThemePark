import java.util.ArrayList;

public class ThemePark implements IConnect {
    private String name;
    private ArrayList<IConnect> places;

    public ThemePark(String name){
        this.places = new ArrayList<IConnect>();
        this.name = name;
    }

    public void connect(IConnect place){
        places.add(place);
    }



}
