package collection.array;

import java.util.ArrayList;

public class Generic {

        public ArrayList<String> creatingstringlist() {

            ArrayList<String> movie = new ArrayList<>();

            movie.add("housefull");
            movie.add("goalmal");        //only string value will be stored
            movie.add("dhamal");
            movie.add("hera pheri");
            //movie.add(1947);

            return movie;

        }

        public ArrayList<Double> decimal() {

            ArrayList<Double> rating = new ArrayList<>();

            rating.add(4.4);
            rating.add(4.3);
            rating.add(4.5);
            rating.add(4.5);       // no duplicated  varible in same method
            rating.add(4.5);


            return rating;
        }

        public ArrayList<Integer>collection(){

            ArrayList<Integer>amount=new ArrayList<>();

            amount.add(1200000);
            amount.add(3000000);
            amount.add(3227729);
            amount.add(3446636);
            amount.add(5252627);

            return amount;
        }

        public static void main(String[] args) {

            Generic santosh = new Generic();  // making object  ( santosh)

            //syntax: ArrayList<DATA TYPE>method objectname =class objectname.methodname

           ArrayList<String>movie= santosh.creatingstringlist();   //calling method using object name in arraylist

             // ArrayList< string>  to run in for loop
            for(int a =0;a< movie.size();a++){

                System.out.println("print using for loop  :"+movie.get(a)+"\tat index"+a);


            }
            // syntax:  DATA TYPE varaible name(any)  :object name of same data type
            for(String var: movie){
                 System.out.println("print using advance for loop :"+var);
            }


         // printing double using for and adavance for loop

            ArrayList<Double>rating=santosh.decimal();   //calling method(double) value using ArrayList<Double>


            for(int b =0;b< rating.size();b++){

                System.out.println("Print rating using for loop :"+rating.get(b)+"at index"+b);
            }

            int f=0;  // PRINTING INDEX IN ADAVANCE FOR LOOP
            for(Double kfc: rating) {

                System.out.println("print using advance for loop  :" + kfc + " INDEX at:" + f);
                f++; // PRINTING INDEX IN ADVANCE FOR LOOP

                // printing integer using for and advance for loop
            }
                                                                  //no duplicated variable in same method
                ArrayList<Integer>amount=santosh.collection();
                for(Integer var:amount){

                    System.out.println(" print  integer using adavance for loop  :"+var);
                }

                for(int i=0;i< amount.size();i++){

                    System.out.println("print intrger using  for loop :"+amount.get(i)+" at index"+i);

                }



            }


        }





