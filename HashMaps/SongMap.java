import java.util.HashMap;
import java.util.Set;

public class SongMap {
    public static void main(String[] args){
        HashMap<String, String> trackMap = new HashMap<String, String>();

        trackMap.put("Take It Easy", "Well, I'm a-running down the road, Tryin' to loosen my load, I've got seven women on my mind");
        trackMap.put("Hotel California", "On a dark desert highway, cool wind in my hair, Warm smell of colitas, rising up through the air");
        trackMap.put("Peaceful Easy Feeling", "I like the way your sparkling earrings lay, Against your skin so brown");
        trackMap.put("Tequila Sunrise", "It's another tequila sunrise, Starin' slowly 'cross the sky, said goodbye");

        // System.out.println(trackMap.get("Hotel California"));

        Set<String> keys = trackMap.keySet();
        for(String key : keys) {
            System.out.println(key + ": " + trackMap.get(key));
        }
    }
}