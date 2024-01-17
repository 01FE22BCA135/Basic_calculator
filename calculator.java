class calculator{
    
    float add(float a,float b)
    {
     return(a+b);
    }

    float sub(float a,float b)
    {
     return(a-b);
    }

    float multi(float a,float b)
    {
     return(a*b);
    }

    float div(float a,float b)
    {
     return(a/b);
    }

    float power(float a)
    {
        return(a*a);
    }

public static void main(String[] args) {
    
    calculator c = new calculator();
    float a=10;
    float b=12;

    System.out.println("Addition of two numbers:"+ c.add(a,b));

    System.out.println("substraction of two numbers:"+ c.sub(a,b));

    System.out.println("Multiplication of two numbers:"+ c.multi(a,b));

    System.out.println("Division of two numbers:"+ c.div(a,b));

    System.out.println("Power of two numbers:"+ c.power(a));
    
}

}