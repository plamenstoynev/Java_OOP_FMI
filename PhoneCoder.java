package PhoneCoder;

public class PhoneCoder {
    private int key;

    public PhoneCoder(){};

    public PhoneCoder(int key){
        setKey(key);
    }

    public double getKey(){
        return key;
    }

    public void setKey(int key){
        if(key < 1 || key > 9)
            throw new RuntimeException("key must be between 1 and 9");
        else
            this.key = key;
    }

    public StringBuilder swapNumbers(String num){
        StringBuilder result = new StringBuilder();
        char temp;
        temp = result.charAt(0);
        result.setCharAt(0, result.charAt(2));
        result.setCharAt(2, temp);
        temp  = result.charAt(1);
        result.setCharAt(3, result.charAt(1));
        result.setCharAt(1, temp);
        return result;
    }

    public StringBuilder encode(String phoneNumber){
        if(phoneNumber.length() != 4)
            throw new RuntimeException("length must be four");
        else{
            StringBuilder result = new StringBuilder();
            int digit = 0;
            char temp;
            for(int i = 0; i < 4; i++){
                digit = Character.getNumericValue(phoneNumber.charAt(i));
                result.append(Integer.toString((digit + this.key) % 10));
            }
            temp = result.charAt(0);
            result.setCharAt(0, result.charAt(2));
            result.setCharAt(2, temp);
            temp  = result.charAt(1);
            result.setCharAt(3, result.charAt(1));
            result.setCharAt(1, temp);
            return result;
        }
    }

    public StringBuilder decode(String phoneNumber){
        if(phoneNumber.length() != 4)
            throw new RuntimeException("length must be four");
        else{
            StringBuilder result = new StringBuilder();
            int digit = 0;
            char temp;
            for(int i = 0; i < 4; i++){
                digit = Character.getNumericValue(phoneNumber.charAt(i));
                if(digit > this.key)
                    result.append(Integer.toString((digit - this.key) % 10));
            }
            temp = result.charAt(0);
            result.setCharAt(0, result.charAt(2));
            result.setCharAt(2, temp);
            temp  = result.charAt(1);
            result.setCharAt(3, result.charAt(1));
            result.setCharAt(1, temp);
            return result;
        }
    }
}
