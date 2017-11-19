/**
 * Created by Juan Ignacio on 5/7/2017.
 */
public class StringUtils {

    public static boolean included(String word, String searched){
        word = word.toUpperCase();
        searched = searched.toUpperCase();
        searched = searched.trim();

        if(!(word.contains(searched) || word.equals("")) || searched.equals("")){
            return false;
        }

        return true;
    }
}
