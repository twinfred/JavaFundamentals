import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class PuzzleJava {
    public ArrayList<Integer> greaterThanTen(int[] myArray){
        int sum = 0;
        ArrayList<Integer> newArr = new ArrayList<Integer>();
        for(int i = 0; i < myArray.length; i++){
            sum += i;
            if(myArray[i] > 10){
                newArr.add(myArray[i]);
            }
        }
        System.out.println(sum);
        return newArr;
    }

    public ArrayList<Object> shuffleArr(String[] myArray2){
        ArrayList<Object> newArr = new ArrayList<Object>();
        ArrayList<Object> newArr2 = new ArrayList<Object>();        
        for(int i = 0; i < myArray2.length; i++){
            newArr.add(myArray2[i]);
            if(myArray2[i].length() > 5){
                newArr2.add(myArray2[i]);
            }
        }
        Collections.shuffle(newArr);
        System.out.println(newArr);
        return newArr2;
    }

    public void alphaShuffle(char[] alphabet){
        ArrayList<Object> newArr = new ArrayList<Object>();
        for(int i = 0; i < alphabet.length; i++){
            newArr.add(alphabet[i]);
        }
        Collections.shuffle(newArr);
        System.out.println(newArr.get(newArr.size() - 1));
        char firstLetter = (char) newArr.get(0);
        System.out.println(firstLetter);
        if(firstLetter == 'a' || firstLetter == 'e' || firstLetter == 'i' || firstLetter == 'o' || firstLetter == 'u'){
            System.out.println("First letter is a vowel!");
        }
    }

    public int randNum(){
        Random r = new Random();
        return r.nextInt(46) + 55;
    }

    public ArrayList<Integer> randArrayFun(){
        ArrayList<Integer> newArr = new ArrayList<Integer>();
        Random r = new Random();
        for(int i = 0; i < 10; i++){
            int rand = r.nextInt(46) + 55;
            newArr.add(rand);
        }
        Collections.sort(newArr);
        System.out.println(newArr.get(0));
        System.out.println(newArr.get(9));        
        return newArr;
    }

    public String randString(){
        String output = "";
        String[] alphabet = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        ArrayList<Object> newArrLower = new ArrayList<Object>();
        ArrayList<Object> newArrUpper = new ArrayList<Object>();
        ArrayList<Integer> numbersArr = new ArrayList<Integer>();
        for(int i = 0; i < alphabet.length; i++){
            newArrLower.add(alphabet[i]);
            newArrUpper.add(alphabet[i].toUpperCase());
            if(i < 10){
                numbersArr.add(i);
            }           
        }
        Random r = new Random();
        for(int i = 0; i < 5; i++){
            int rand = r.nextInt(3);
            if(rand == 0){
                int choice = r.nextInt(26);
                output = output + newArrLower.get(choice);
            }else if(rand == 1){
                int choice = r.nextInt(26);
                output = output + newArrUpper.get(choice);
            }else{
                int choice = r.nextInt(10);
                output = output + numbersArr.get(choice);
            }
        }
        System.out.println(output);
        return output;   
    }

    public void randStringArr(){
        ArrayList<Object> newArr = new ArrayList<Object>();
        for(int i = 0; i < 5; i++){
            newArr.add(randString());
        }
        System.out.println(newArr);
    }
}