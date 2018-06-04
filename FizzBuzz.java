public class FizzBuzz {
    public String fizzBuzz(int number) {
        String fb;
        if(number % 3 == 0 && number % 5 == 0){
            fb = "FizzBuzz";
            return fb;
        }else if(number % 3 == 0){
            fb = "Fizz";
            return fb;
        }else if(number % 5 == 0){
            fb = "Buzz";
            return fb;
        }else{
            return Integer.toString(number);
        }
    }
}