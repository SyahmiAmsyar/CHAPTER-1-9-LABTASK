class ContinueDemo { 
   public static void main(String[] args) {
       String searchMe = "You know New York, you need New York, you know you need unique New York."; 
       int max = searchMe.length(); 
       int numos = 0;
       for (int i = 0; i < max; i++) { //interested only in p's
             if (searchMe.charAt(i) != 'N') 
                    continue; 
             //process p's 
             numos++; }
       System.out.println("Found " + numos + "N's in the string."); } }
