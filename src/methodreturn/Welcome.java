package methodreturn;

public class Welcome {
    public String welcomem(String name){
        String str= "welcome to my house my dear friend thor "+name;
        return str;
    }
    public int makecube(int number){
        int cube =number*number*number;
        return cube;
    }
    public boolean vote(int age,String city){
        if(age>18 & city=="agra" ){
            return true;
        }
        else{
            return false;
        }

    }






    public static void main(String[] args) {
        Welcome obj=new Welcome();
       String output= obj.welcomem("odin");
        System.out.println(output);
        int cube=obj.makecube(5);
        System.out.println("cube is "+cube);
        boolean result=obj.vote(19,"agra");
        System.out.println("answer is "+result);
        boolean answer=obj.vote(17,"agra");
        System.out.println(""+answer);
    }
}
