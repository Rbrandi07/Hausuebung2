import java.util.ArrayList;
import java.util.List;

public class HalloJavamitForEach {
    public static void main(String[] args){
        List<String> stringList = new ArrayList<>();
        stringList.add("Wort1");
        stringList.add("Wort2");
        stringList.add("Wort3");
        stringList.add("Wort4");
        stringList.add("MoneyBoy");
        System.out.println("Ausgabe mit For-Each Schleife");
        for(String s: stringList){
            System.out.println(s);
        }
    }
}
