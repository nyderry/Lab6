import java.util.Scanner;

/**
 * Created by Ny Derry on 6/30/2017.
 * Lab 6
 */
public class PigLatin {
    public static void main(String[] args) {
        //keep char, moved String, and Scanner in the do-while to keep continue function
        char contin1 = 'y';

        //1. display welcome message
        //use \n (escape sequence) to omit extra code for newline
        System.out.print("Welcome to the Pig Latin Translator!\n");

        do {//needed to do-while loop so it will run at least once before it ask the user to continue
            String contin2 = "";
            Scanner input = new Scanner(System.in);

            //2. prompt for user input
            //use \n in the beginning not both for the user word to be in the same line
            System.out.print("\nEnter a word to be translated: ");

            //3. get user input

            //4. translate user input
            //4.1 convert input to lowercase before translating
            //4.2 start with vowel, add "way" onto ending
            /*4.3 start with a consonant, move all of the consonants that appear before the first vowel to the end of the word,
             then add "ay" to the end of the word */
            String word = input.nextLine();
            String lowerWord = word.toLowerCase(); //convert to lowercase

            //***Determines if a word starts with a vowel or consonant, use if-else statement

                if ((lowerWord.startsWith("a") || (lowerWord.startsWith("e") || (lowerWord.startsWith("i") || (lowerWord.startsWith("o") || (lowerWord.startsWith("u") ))))))
                    //5. print out results
                    System.out.println(lowerWord + "way");//starts with a vowels

                else
                    for (int i= 0; i<lowerWord.length(); i++){//the for loop to check for the first vowel location(i), to split the word for re-arranging
                        String vowels = "aeiou"; //a list of vowels, only lowercase since already converted
                        if (vowels.contains("" + lowerWord.charAt(i))){ // if this is true, (i) will be in first position of the first vowel, to check the position of the vowel

                            String prefix = lowerWord.substring(0, i); //String buffer(change) creates the consonants to eventually move to the end
                            String suffix = lowerWord.substring(i);//as written meaning the rest of the word from beginning of position (i)
                            String assembleWord = ""; //made up variable name, declare and initialize variable
                            assembleWord = suffix + prefix + "ay"; // compiling the assembled word from the pieces and adding (concatenating) the ending "ay"
                            //5. print out results
                            System.out.print(assembleWord);//print the assembled word

                            break; // break out to go back to the for loop

                        }

                }

                //6. prompt user to enter a word again
                // start here to keep continue function for a do-while loop
                //use \n instead of sout at end for spacing
                System.out.print("\nTranslate another word? (y/n): ");
                contin2 = input.next();
                contin1 = contin2.charAt(0);
                //  System.out.println(" ");



        } while (contin1 != 'n'); //do-while loop function needed at the end compares to the while loop

    }
}

