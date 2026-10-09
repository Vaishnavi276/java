class SumOfLastFirstDigit{
    public static void main(String[] args){
        int num = 123456789;
        int firstDigit = num;
        while(firstDigit >= 10){
            firstDigit = firstDigit/10;
        }
        int LastDigit = num % 10;
        int sum = firstDigit + LastDigit;
        System.out.println("Sum of first and Last digit:"+sum);
    }
}