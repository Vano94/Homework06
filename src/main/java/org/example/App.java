package org.example;

import org.example.Client;
import org.example.PublicTransport.Transport;
import org.example.PublicTransport.Car;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        Transport.Transport();
        Transport transport = new Transport();
        transport.setName("Super car");
        transport.setSpotsCount(5);

        System.out.println(transport.getName());
        System.out.println(transport.getSpotsCount());

        Car car = new Car();
        car.move();
    }
}
