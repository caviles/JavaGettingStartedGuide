package oop;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

public class FlightPlan {
    String id;
    String departure;
    String destination;
    LocalDateTime departureTime;
    List<String> route;

    private FlightPlan() {
        System.out.println("oop.FlightPlan()");
        this.id = UUID.randomUUID().toString();
    }

    public FlightPlan(String departure, String destination) {
        this(); //calls ctor w/ no args

        if (departure == null || destination == null) {
            throw new IllegalArgumentException("You can't create obj w/ no dest or dept");
        }

        System.out.println(String.format("oop.FlightPlan( %s, %s)", departure, destination));

        this.departure = departure;
        this.destination = destination;
    }

    public FlightPlan(String departure, String destination, LocalDateTime departureTime, List<String> route) {
        this(departure, destination);//calls 2 arg ctor which calls 1 no args ctor

        if (departureTime == null || route == null) {
            throw new IllegalArgumentException();
        }

        System.out.println(String.format("oop.FlightPlan( %s, %s, %s, %s)",
                departure,
                destination,
                departureTime.toLocalTime(),
                route.toString()));

        this.route = route;
        this.departureTime = departureTime;
    }

    public void print() {
        String msg = "{" +
                "id='" + this.id + '\'' +
                "departure='" + this.departure + '\'' +
                ", destination='" + this.destination + '\'' +
                ", departureDateTime=" + this.departureTime +
                ", route=" + this.route +
                '}';
        System.out.println(msg);


    }


}