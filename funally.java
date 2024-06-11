class A{
    public static void main(String args[]){
        try{
            int num=121/0;
            System.out.println(num);
        }
        catch(ArithmeticException e){
            System.out.println("Number should not divide by zero");
        }
        finally{
            System.out.println("Finally block");
        }
        System.out.println("out of try-catch block");
    }
}