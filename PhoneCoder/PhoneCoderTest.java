package PhoneCoder;

public class PhoneCoderTest {
    public static void main (String[] args){
        PhoneCoder p = new PhoneCoder(2);
        System.out.println(p.encode("1234"));
        System.out.println(p.decode("3456"));
    }
}
