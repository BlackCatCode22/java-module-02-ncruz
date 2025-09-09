//RevStrWarmUp
// 9/9/25
// ncruz
class RevStrWarmup {
    public static void main(String[] args) {

        System.out.println("/n Welcome to Reverse String Warm Up program!");

        //create string that reverses a string using a for loop
        //define program in term of input/processing/output

        //there is no input in program ,everything is hard coded
        //processing is: Decrementing a for loop, finding length of the string
        //create new string
        //with the end characters at the end of the string

//Create string variables, initialize
        String myStr = "abcdefghijklmn" ;
        String myRevStr = "abcdefghijklmn";
        int stringLength = myStr.length();

        System.out.println("/n stringLength is " + stringLength);
        System.out.println("/n char at index 11 is " + myStr.charAt(10) );

        // CREATE FOR LOOP from end to start
        for (int i = (stringLength-1); i >= 0; i--){
            System.out.println("/n the char at " +i + " is: " + myStr.charAt(i) );
            myRevStr = "myRevStr" +1;myStr.charAt(i);

            System.out.println("\n\n my RevStr is: " + myRevStr + "\n\n");

        }
    }
}