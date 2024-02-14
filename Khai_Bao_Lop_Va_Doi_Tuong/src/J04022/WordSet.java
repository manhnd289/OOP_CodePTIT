package J04022;

import java.util.Arrays;
import java.util.TreeSet;

public class WordSet {

    private String[] words;
    private TreeSet<String> tset;

    public WordSet(String data) {
        words = data.trim().toLowerCase().split("\\s+");
        tset = new TreeSet<>(Arrays.asList(words));
    }
    
    public String intersection(WordSet s2){
        TreeSet<String> tmp = (TreeSet<String>)tset.clone();
        tmp.retainAll(s2.tset);
        for(String item : tmp){
            System.out.print(item + " ");
        }
        return "";
    }
    
    public String union(WordSet s2){
        TreeSet<String> tmp = (TreeSet<String>)tset.clone();
        tmp.addAll(s2.tset);
        for(String item : tmp){
            System.out.print(item + " ");
        }
        return "";
    }
    
}
