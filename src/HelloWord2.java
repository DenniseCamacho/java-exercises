public class HelloWord2 {
    public static void main(String[] args) {
        System.out.println("Yo, hey!");
        /**
         * Data types
         * byte	1	Very short integers from -128 to 127
         */
        byte myByte = 127;
        System.out.println("myByte = " + myByte);
         /**
         * short	2	Short integers from -32,768 to 32,767
          * short myShort = -34000; x wrong
          */
         short myShort = 31000;
        System.out.println("myShort = " + myShort);
         myShort = 20;
         /**
         * int	4	Integers from -2,147,483,648 to 2,147,483,647
          */
         int myInt = myShort; ///implicit
        myInt = (int) myByte; //expicit
        System.out.println("myInt = " + myInt);

         /**
         * long	8	Long integers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
          */
         long myLong = 100_000_000; // _ makes it easier to read...
        System.out.println("myLong = " + myLong);

         /**
         * float	4	Single-precision, floating-point numbers from -3.4E38 to 3.4E38 with up to 7 significant digits
          */
         float myFloat = 1.234567890123F;
//         myFloat = 1.2345679 ->7 digits rounded up
        System.out.println("myFloat = " + myFloat);
        myFloat = (float) myLong;
        System.out.println("myFloat = " + myFloat);
         /**
         * double	8	Double-precision, floating-point numbers from -1.7E308 to 1.7E308 with up to 16 significant digits
          * */
         double myDouble = 10.12122345352D;
        System.out.println("myDouble = " + myDouble);

         /**
         * char	2	A single Unicode character that’s stored in two bytes*/
         char myChar = 'C';


         /**
         * boolean	1	A true or false value
         */
         //in js true/false(1 or 0)
//        boolean isTrue = 1; x not in java
        boolean isTrue = true;
        System.out.println("isTrue = " + isTrue);
        isTrue = !isTrue;//simplify
        System.out.println("isTrue = " + isTrue);
        /**
         * must be defined before being used
         * -start with letter, underscore or dollar sign(java)
         * -letters,underscores and digits
         * -not longer than 255 characters
         *
         * casting
         *
         *JS ->parseInt()-> type cohersion ====casting
         *
         * two types
         * implicit(define this) sounds like lack of communication lol- imply, based on the situation. not clearly defined
         *
         * explicit ()sounds like better communication ^^;- telling the application it needs to change the data type.
         */

        //data types - default to null if not assigned anything.
        //String()
        String myString = "double quotes for strings!!";
        System.out.println("myString = " + myString);
        //in java  \escape\

        /**
         * reserved keywords
         * **/
        //some words are reserved for a purpose and cannot be used.
        //i.e. cant use switch because of switch case in js
        //i.e. long switch = 1234L
        /**
         * constants
         * 1.Variable that cannot change.
         * 2. Java uses a keyword called final
         * 3. Naming conventions
         * 2 diff used
         * `    1.PascalCase -< first char is capitalized
         *      2.ALL CAPS! CONSTANTS_NAME_IS_THIIIS**/
        final int FINAL_VALUE = 11;
        System.out.println("FINAL_VALUE = " + FINAL_VALUE);
        //CANNOT EVER CHANGE THE VALUES.

        /**ARITHMETIC
         * operators similar to JavaScript
         * **/
        //++value
        //value++ order matters.
        int i = 10;
        int n = i++ % 5; //returns a remainder
        System.out.println("n = " + n);//


        //Java always needs ; at the end statements require ;
        //main method is how you start a java app
        //most operators are identical,
        //assignment of variables are similar to js
        //syntax is similar, semi-color like js, but require for JAVA
        //single quotes = single characters
        //double quotes = full string
        //assign a data type in java not js
        //implicit - implied by the content
        //explicit - clearly stated in your code 'convert this to that';


    }
}
