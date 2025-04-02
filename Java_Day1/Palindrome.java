public class Palindrome {
    String text;
    Palindrome(String text){
        this.text = text;
    }
    static boolean checkpalindrome(String text){
        int start = 0;
        int end = text.length() - 1;
        while(start < end){
            if(text.charAt(start) != text.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
        }
        void displayresults(){
            System.out.println("The text is:" + text);
            System.out.println("Is the text palindrome:"  +checkpalindrome(text));
        }
        public static void main(String[] args){
            Palindrome p1 = new Palindrome("123321");
            Palindrome p2 = new Palindrome("abccba");
            Palindrome p3 = new Palindrome("Sasannka");
            p1.displayresults();
            p2.displayresults();
            p3.displayresults();
        }
    }

