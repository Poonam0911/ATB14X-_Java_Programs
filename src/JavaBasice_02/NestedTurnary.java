package JavaBasice_02;

public class NestedTurnary {
    public static void main(String[] args) {
        int age = 49;
      String result =  (age >18 ? (age < 59 ? "Person is Adult":"Person is senior citizon") :"Person is minor");
        System.out.println(result);
    }
}
