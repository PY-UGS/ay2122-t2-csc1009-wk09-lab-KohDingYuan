import java.util.Random;

public class RandomCharacter {
    public int getRandomNumber(int min, int max){
        return (int) ((Math.random() * (max - min)) + min);
    }
    public char getRandomLowerCaseLetter(){
        Random r = new Random();
        return (char)(r.nextInt(26) + 'a');
    }
    public char getRandomUpperCaseLetter(){
        Random r = new Random();
        return (char)(r.nextInt(26) + 'A');
    }
    public char getRandomDigitCharacter(){
        return (char)(getRandomNumber(0, 10) + '0');
    }
    public char getRandomCharacter(){
        int charType = getRandomNumber(0,3);

        switch(charType){
            case 1:
                return getRandomLowerCaseLetter();
            case 2:
                return getRandomUpperCaseLetter();
            default:
                return getRandomDigitCharacter();
        }
    }
}
