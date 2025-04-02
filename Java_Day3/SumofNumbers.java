import java.util.Scanner;
public class SumofNumbers{
    public static void main(String[] args){
        double[] numbers = new double[10];
        double total =0.0;
        int index = 0;
        try(Scanner input = new Scanner(System.in)){
            while(true){
                double number = input.nextDouble();
                if(number <= 0 || index >=10){
                    break;
                }else{
                    numbers[index] = number;
                    index++;
                }
                for(int i = 0 ; i<10; i++){
                    System.out.println(numbers[i]);
                    total += numbers[i];
                }
                System.out.println("The sum of all elemnets:" + total);
            }
        }
    }
}