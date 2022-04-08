package notesandlectures;
public class ExceptionsLectureTest {
//
//    public static void main(String[] args) {
//        ExceptionsLecture eL = new ExceptionsLecture();
//        try {
//            eL.subListMaker("why isnt this working?");
//        } catch (Exception anyVar) {
//            System.out.println("This is what's going on: " + anyVar);
//        } finally {
//            System.out.println("This will show regardless of what happens.");
//        }


//        ExceptionsLecture lecture = new ExceptionsLecture();
//        try {
//            System.out.println(lecture.testString.substring(5));
//            System.out.println(lecture.testString.substring(21));
//
//        } catch (StringIndexOutOfBoundsException anyvarUsuallyNFE
//        /**Exception instead of StringIndexOutOfBoundsException**/) {
//            System.out.println("Did not work: " + anyvarUsuallyNFE);
//        } finally {
//            System.out.println("this always runs");
//        }

        //catch every exception type with Exception.


        /**
         try{
         ExceptionsLecture lecture = new ExceptionsLecture();
         System.out.println(Integer.parseInt(lecture.defNotAnInteger));
         System.out.println(Integer.parseInt(lecture.maybeAnInteger));
         } catch (NumberFormatException nfe) {
         //in the event nfe occurs, instead of all the error messages
         //generate this message.
         System.out.println("Got exception: " + nfe);
         //an exception is thrown, and you 'catch' it.
         //'overriding' behavior of error.
         //common exception:
         //            nfe.printStackTrace(); //what intellij does by default.
         }
         **/

//  Mini-exercise: Investigate the substring method for String objects in the Java
//  API. Find out what kind of exception it throws. Create a test class with a
//  main method. Set up a try-catch block that defines a string and finds its
//  length. Once you have the length of your string, modify your program so it
//  creates a substring from your original string, but give it an index that
//  doesn't exist so you get the error message.
//
//  Optional: play with the .getMessage and .printStackTrace methods.
//
//  Optional: what are some other ways you can get the same exception? Try to set
//  up your program so as to produce and catch these exceptions.
//https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/Integer.html

    }
