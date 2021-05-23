package jp.sample;

import jp.sample.calc.Add;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Greet.hello("sudachi");

        System.out.println( Add.add(5, 6) );
    }
}
