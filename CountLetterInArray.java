import randomcharacter.RandomCharacter;


public class CountLettersInArray {

    public static void main(String[] args) {
        //Declare and create an array
        char[] chars = createArray();

        //Display the array
        System.out.println("The lowercase letters are:");
        displayArray(chars);

        //Count the occurences of each letter
        int[] counts = countLetters(chars);

        //Displahy counts
        System.out.println();
        System.out.println("The occurences of each letter are:");
        displayCounts(counts);        
    }

    /**Create an array of characters**/
    public static char[] createArray() {
        //Declare an array of characters and create it
        char[] chars = new char[100];
        for (int i = 0; i < chars.length; i++)
            chars[i] = RandomCharacter.getRandomLowerCaseLetter();
        //Create lower case letters randomly and assign
        //them to the array
     /*   chars[0] = 'a';  
        chars[1] = 'a';  
        chars[2] = 'c';  
        chars[3] = 'd';  
        chars[4] = 'e';  
*/
       //Return the array
        return chars;
    }

    public static void displayArray(char[] chars) {
        //Display characters in the array 20 on each line
        for (int i = 0; i < chars.length; i++) {
            if ((i + 1) % 20 == 0)
                System.out.println(chars[i]);
            else 
                System.out.print(chars[i] + " ");
        }
    }
        /** Count the occurences of each letter*/
        public static int[] countLetters(char[] chars) {
            //Declare and create an array of 26 int
            int[] counts = new int[26];

            //For each lower case letter in the array, count it
            for (int i = 0; i < chars.length; i++)
                counts[chars[i] - 'a']++;

            return counts;
        }
        /**Display counts*/
        public static void displayCounts(int[] counts) {
            for (int i = 0; i < counts.length; i++) {
               
                    System.out.print(counts[i] + " " + (char)(i + 'a') + " ");
            }
        }


        }
        /**Display counts*/
       
