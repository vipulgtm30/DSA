package generics;

public class PairUse {

    void main() {
//        Pair<Integer> p = new Pair<>(10, 20);

//        System.out.println(p.getFirst()+ " " +p.getSecond());
//
//        System.out.println(p.getClass());
//
//
//        System.out.printf("\n-:String Type:-\t\t\t");
//        Pair<String> pString = new Pair<>("aa", "bb");
//        System.out.println(pString.getFirst()+ " " + pString.getSecond());
//
//        Pair<Character> pairCharacters = new Pair<>('a', 'b');
//        pairCharacters.printPair();

        Pair<Integer, String> p = new Pair<>();
        p.setFirst(10);
        p.setSecond("Second");
        p.printPair();

        Pair<Pair<Integer, String>, String> p2 = new Pair<>();

        p2.setFirst(p);
        p2.setSecond("Second Argument");
        System.out.println(p2.getFirst().getSecond());
        p2.printPair();

    }

}
