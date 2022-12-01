package Method;

import com.sun.deploy.security.SelectableSecurityManager;

public class StringPalindrome {

    public void stringmethod() {

        String name = "radar";
        String reverse = "";

        int namelength = name.length();
        for (int i = (namelength - 1); i >= 0; i--)

            reverse = reverse + name.charAt(i);

            if (name.toLowerCase().equals(reverse.toLowerCase()))
                System.out.println("Your name is palindrome:"+reverse);
            else
                System.out.println("Your name is not palindrome:");

        }


        public static void main(String[]args){

        StringPalindrome obj= new StringPalindrome();

        obj.stringmethod();
        }
    }
