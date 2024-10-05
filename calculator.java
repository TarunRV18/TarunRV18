public class calculator {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.setOut(x:"enter the first number");
        double num1=scanner.nextDouble();
        System.Out(x:"enter the second number");
        double num2=scanner.nextDouble();
        System.Out(x:"enter the operator(+,-,*,/)");
        char oerator=scanner.next().charAt(0);
        double result;
        switch (operator){
            case '+':result=num1+num2;
            break;
            case '-':result=num1-num2;
            break;
            case '*':result=num1*num2;
            break;
            case '\':
            if(num2 !=0){
                result=num1/num2;   
            }
            else{
                System.out.println("error division by zero");
                return;
                }    
                break;

                default:System.out.println('invalid operator please use +,-,*,or /.');
                
        }
        

    }
    
}
