import uulib.Console;

class Main {

    public static String inputMessage() {
        //prompt user to enter a message to be encoded
        String message = Console.getString("Enter message to be encoded: ");

        //return the message that was entered 
        return message;
    }
    
    public static String characterToMorse(char c) {

        //create blank string that will be used to store morse code version of the character
        String morseCode;
        //convert character to lower case 
        c = Character.toLowerCase(c);

        //select the morse code version of the character and add it to the string  
        if(c == 'a') {
            morseCode = "_. ";
        } else if(c == 'b') {
            morseCode = "_... ";
        } else if(c == 'c') {
            morseCode = "_._. ";
        } else if(c == 'd') {
            morseCode = "_.. ";
        } else if(c == 'e') {
            morseCode = ". ";
        } else if(c == 'f') {
            morseCode = ".._. ";
        } else if(c == 'g') {
            morseCode = "__. ";
        } else if(c == 'h') {
            morseCode = ".... ";
        } else if(c == 'i') {
            morseCode = ".. ";
        } else if(c == 'j') {
            morseCode = ".___ ";
        } else if(c == 'k') {
            morseCode = "_._ ";
        } else if(c == 'l') {
            morseCode = "._.. ";
        } else if(c == 'm') {
            morseCode = "__ ";
        } else if(c == 'n') {
            morseCode = "_. ";
        } else if(c == 'o') {
            morseCode = "___ ";
        } else if(c == 'p') {
            morseCode = ".__. ";
        } else if(c == 'q') {
            morseCode = "__._ ";
        } else if(c == 'r') {
            morseCode = "._. ";
        } else if(c == 's') {
            morseCode = "... ";
        } else if(c == 't') {
            morseCode = "_ ";
        } else if(c == 'u') {
            morseCode = ".._ ";
        } else if(c == 'v') {
            morseCode = "..._ ";
        } else if(c == 'w') {
            morseCode = ".__ ";
        } else if(c == 'x') {
            morseCode = "_.._ ";
        } else if(c == 'y') {
            morseCode = "_.__";
        } else if(c == 'z') {
            morseCode = "__..";
        } else if(c == ' ') {
            morseCode = "/ ";
        } else {
            morseCode = "# ";
        }
       
        //return morse code version of the character 
        return morseCode;
    }

    public static String messageToMorse(String message) {
        //create blank string that will store the encoded version of the message 
        String encodedMessage = "";

        //convert each character in the message into morse code and add it to the string 
        for(int i = 0; i < message.length(); i++) {
            encodedMessage = encodedMessage + characterToMorse(message.charAt(i));
        }

        //return the encoded version of the message 
        return encodedMessage;
    }

    public static void printMorseCode() {
        //print title of program
        System.out.println("---------TEXT TO MORSE CODE----------\n");
        //user inputs message 
        String message = inputMessage();
        //print a divider 
        System.out.println("\n-----------------------------------");
        //print a label for encoded message 
        System.out.println("Encoded Message:");
        //print the encoded version of the message 
        System.out.println(messageToMorse(message));

    }

    public static void main(String[] args) {
       printMorseCode();
    }

}