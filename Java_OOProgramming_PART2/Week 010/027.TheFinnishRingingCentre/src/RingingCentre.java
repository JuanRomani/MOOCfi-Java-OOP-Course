import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RingingCentre {

    private Map<Bird, List<String>> observations;

    public RingingCentre(){
        this.observations = new HashMap<>();
    }

    public void observe(Bird bird, String place){
        if (!observations.containsKey(bird)){
            observations.put(bird, new ArrayList<>());
        }

        observations.get(bird).add(place);
    }

    public void observations(Bird bird){
        if (observations.containsKey(bird)){
            System.out.println(bird.toString() + " observations: " + observations.get(bird).size());

            for (String location : observations.get(bird)){
                System.out.println(location);
            }

        } else {
            System.out.println(bird.toString() + " observations: 0");
        }
    }
}
