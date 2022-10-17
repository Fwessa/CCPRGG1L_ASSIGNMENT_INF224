

// LUISA TABILOG DALA
// INF 224
// OCTOBER 17, 2022

public class assignment2 {
    public static void main(String[] args) throws Exception {

        whileLoop();
        doWhileLoop ();
        forLoop();
        charArray();

    }
       
        //  While loop
        // Use a while loop to print your FIRSTNAME three times.

        static void whileLoop () {

        String firstname = "Luisa";
        System.out.println(" ");
        System.out.println(">> While Loop <<");
        System.out.println(" ");
        int count = 3; 

        while (count !=0) {
            System.out.println(firstname);
            count--;
            
        }
    }

        // Do-while loop
        // Use a do-while loop to print your MIDDLENAME four times.

        static void doWhileLoop (){
       
        int count2 = 0;
        String middlename = "Tabilog";

        System.out.println(" ");
        System.out.println(">> Do-While Loop <<");
        System.out.println(" ");

        do{
            System.out.println(middlename);
            count2++;

        } while(count2 != 4 );
        
    }
        // For loop
        // Use a for loop to print your SURNAME five times.

        static void forLoop(){

        String surname = "Dala";

        System.out.println(" ");
        System.out.println(">> For Loop <<");
        System.out.println(" ");

        for (int count3 = 0; count3 != 5; count3++) {
            System.out.println(surname);

        }

    }
        // Char array
        // Create a char array that consists all of the 
        // characters of your FIRSTNAME and use a for loop to 
        // print each character of your FIRSTNAME. (example: ELIZER)

    static void charArray(){

        System.out.println(" ");
        System.out.println(">> Character Array <<");
        System.out.println(" ");
        System.out.println("> Normal <");
        System.out.println(" ");
        
        
        String firstname1 = "LUISA";
        char array[] = new char [5];
        int count;
        int count1;

        firstname1.getChars(0, 5, array, 0);
        
        for (count = 0; count<=4; count++) {
            System.out.print(array[count]);
        }


        System.out.println(" ");
        System.out.println(" ");
        System.out.println("> Reverse <");
        System.out.println(" ");

        // Reverse
        // Use a for loop to print the char array of your 
        // FIRSTNAME in REVERSE order (example: REZILE)

        for (count1 = 4; count1>=0; count1--) {
            System.out.print(array[count1]);
        }


    }

}

