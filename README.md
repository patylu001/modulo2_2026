# modulo2_2026
Diplomado programacion
```
public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        double var1 = 10.567;        
        double var2 = 20;
        int var3 = 20;
        char varChar = 'A';
        char varChar2 = 'B';
        boolean varBool = true; //Declaración de variable booleana
        float varFloat = 10.5f;
        varBool = var1 > var2;
        System.out.println("Value of var1: " + var1);
        System.out.println("Value of var1: " + var2);
        System.out.println("Value of var1: " + var3);
        System.out.println("Value of var1: " + (var3 + var1));
        System.out.println("Value of varChar: " + varChar);
        System.out.println("Value of varFloat: " + varFloat);
        System.out.println("Value of varBool: " + varBool);   
        
        int a = 20;
		a += 5;
		System.out.println("R = " + a); //25
		a = a + 5;
		System.out.println("R = " + a); //30
        a++; // a = a + 1;
        System.out.println("R = " + a);//31
        varBool = varChar == varChar2;
        varBool = var3 < var1;
        varBool = var3 < 29;
        varBool = (var3 < 29 && var1 > 10) || (varChar == 'A');
        System.out.println("Value of varBool: " + varBool);
    }    
}
```
