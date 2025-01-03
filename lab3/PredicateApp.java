import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateApp {
private static List<String> getBeginWith(List<String> list, Predicate<String> valid)
{
List<String> selected = new ArrayList<>();
list.forEach(player -> {
if (valid.test(player)) {
selected.add(player);
}
});
return selected;
}
public static void main(String[] args) {
String[] players =
{ "Rafael Nadal", "Novak Djokovic", "Stanislas Wawrinka", "David Ferrer", "Roger Federer",
"Andy Murray", "Tomas Berdych", "Juan Martin Del Potro", "Richard Gasquet", "John Isner"
};

List<String> playerList = Arrays.asList(players);
System.out.println(getBeginWith(playerList, (s) -> s.startsWith("R")));
System.out.println(getBeginWith(playerList, (s) -> s.contains("D")));
System.out.println(getBeginWith(playerList, (s) -> s.endsWith("er")));
}
}