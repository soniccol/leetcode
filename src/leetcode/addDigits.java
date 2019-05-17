package leetcode;
public class addDigits {

    public static void main(String args){
        addDigits addDigits = new addDigits();
        System.out.println(addDigits.addDigitss(5));
    }

    public int addDigitss(int num) {
        return num-9*(int)Math.floor((num-1)/9);
    }
}
