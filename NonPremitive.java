
class book {

    String Name = "Naga mistries";
    String Author = "Naga Babu";
}

public class NonPremitive {

    public static void main(String[] args) {
        book a = new book(); 
        a = null;
        System.out.println(a.Name);
    }

}
