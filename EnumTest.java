import java.util.*;

public class EnumTest {
    public static void main(String[] args) {
        var in = new Scanner(System.in);
        System.out.print("Enter a size: (SMALL, MEDIUM, LARGE, EXTRA_LARGE");
        String input = in.next().toUpperCase();
        Size size = Enum.valueOf(Size.class, input);
        System.out.println("size =" + size);
        System.out.println("abbrevation =" + size.getAbbrevation());
        if (size == Size.EXTRA_LARGE)
            System.out.println(" Good job your paid attention to  the -.");
    }
}

enum Size {
    SMALL("S"), MEDIUM("M"), LARGE("L"), EXTRA_LARGE("XL");

    private Size(String abbrevation) {
        this.abbrevation = abbrevation;
    }

    public String getAbbrevation() {
        return abbrevation;
    }

    private String abbrevation;

}
