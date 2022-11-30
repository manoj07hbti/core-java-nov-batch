package arraywhile;

public class Array_index {
    public static void main(String[] args) {
        String state1="Karnataka";
        String state2="Uttrakhand";
        String state3="UttarPradesh";
        String state4="TamilNadu";
        String state5="Kashmir";

        //SYNTAX DataType varname []= {value1, value2, value3, value4.....value N};
        String states []={"Karnataka","Uttrakhand","UttarPradesh","TamilNadu","Kashmir"};
        System.out.println(states[0]);
        System.out.println(states[2]);
        System.out.println(states[3]);
        System.out.println(states[4]);
        System.out.println(states[1]);

        for (int i=0; i<states.length; i++){
            System.out.println("All the states are : " +i+states[i]);
        }

        for(String Rajya:states){
            System.out.println("States are as under :" +Rajya );
        }
    }
}
