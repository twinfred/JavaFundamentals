import java.util.ArrayList;

public class BasicJava {
    public void printOneTo255(){
        for(int i = 1; i <= 255; i++){
            System.out.println(i);
        }
    }

    public void printOddTo255(){
        for(int i = 1; i <= 255; i++){
            if(i % 2 != 0){
                System.out.println(i);
            }
        }
    }

    public void printSumTo255(){
        Integer sum = 0;
        for(int i =0; i <= 255; i++){
            sum += i;
            System.out.println("New Number: " + i + " Sum: " + sum);
        }
    }

    public void iterateArry(int[] myArray){
        for(int num1 : myArray){
            System.out.println(num1);
        }
    }

    public void findMax(int[] myArray){
        int max = myArray[0];
        for(int num1 : myArray){
            if(num1 > max){
                max = num1;
            }
        }
        System.out.println(max);
    }

    public void getAverage(int[] myArray){
        double sum = 0;
        for(int num1 : myArray){
            sum += num1;
        }
        double avg = sum / myArray.length;
        System.out.println(avg);
    }
    
    public void arrWithOddNums(){
        ArrayList<Integer> y = new ArrayList<Integer>();
        for(int i = 1; i <= 255; i++){
            if(i % 2 != 0){
                y.add(i);
            }
        }
        System.out.println(y);
    }

    public void greaterThanY(int[] myArray, int y){
        int count = 0;
        for(int num1 : myArray){
            if(num1 > y){
                count += 1;
            }
        }
        System.out.println(count);
    }

    public void squareTheValues(int[] myArray){
        ArrayList<Integer> y = new ArrayList<Integer>();
        for(int i = 0; i < myArray.length; i++){
            y.add(myArray[i] * myArray[i]);
        }
        System.out.println(y);
    }

    public void elimNegNums(int[] myArray){
        ArrayList<Integer> y = new ArrayList<Integer>();
        for(int i = 0; i < myArray.length; i++){
            if(myArray[i] > -1){
                y.add(myArray[i]);
            }else{
                y.add(0);
            }
        }     
        System.out.println(y);
    }

    public void maxMinAvg(int[] myArray){
        ArrayList<Object> y = new ArrayList<Object>();
        int max = myArray[0];
        int min = myArray[0];
        double sum = 0;
        for(int num1 : myArray){
            sum += num1;
            if(num1 > max){
                max = num1;
            }
            if(num1 < min){
                min = num1;
            }
        }
        double avg = sum / myArray.length;
        y.add(max);
        y.add(min);
        y.add(avg);
        System.out.println(y);
    }

    public void shiftArrVals(int[] myArray){
        ArrayList<Integer> y = new ArrayList<Integer>();
        for(int i = 1; i < myArray.length; i++){
            y.add(myArray[i]);
        }
        y.add(0);
        System.out.println(y);        
    }
}