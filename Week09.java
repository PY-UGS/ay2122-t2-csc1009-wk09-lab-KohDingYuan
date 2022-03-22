import org.junit.Test;

public class Week09 {
    @Test
    public void tutQuestion01(){
        int i, targetLength = 15;
        RandomCharacter rc = new RandomCharacter();

        System.out.println("getRandomLowerCaseLetter:");
        for(i = 0; i < targetLength; i++) 
            System.out.print(rc.getRandomLowerCaseLetter());
        System.out.println("\n");

        System.out.println("getRandomUpperCaseLetter:");
        for(i = 0; i < targetLength; i++) 
            System.out.print(rc.getRandomUpperCaseLetter());
        System.out.println("\n");
        
        System.out.println("getRandomDigitCharacter:");
        for(i = 0; i < targetLength; i++) 
            System.out.print(rc.getRandomDigitCharacter());
        System.out.println("\n");

        System.out.println("getRandomCharacter:");
        for(i = 0; i < targetLength; i++) 
            System.out.print(rc.getRandomCharacter());
        System.out.println("\n");
    }

    @Test
    public void tutQuestion02(){
        RandomCharacter rc = new RandomCharacter();
        int ranNum = rc.getRandomNumber(0,101);
        
        System.out.println("Generated Number: " + ranNum);

        boolean optimusPrime = true;
        //Brute force check if ranNum is prime
        for(int i = 2; i < ranNum; i++){
            if(ranNum % i == 0){
                optimusPrime = false;
                break;
            }
        }

        System.out.println("Number is Prime: " + optimusPrime);
    }
}