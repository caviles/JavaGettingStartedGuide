import Exceptions.ExceptionsCode;
import oop.FlightPlan;
import operators.UranaryOperators;
import threads.Threads;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {

      addSection("operators.UranaryOperators");

      UranaryOperators.tryOutPlusPlusAndMinusMinus();

      addSection("Exceptions.ExceptionsCode");

      try {
        ExceptionsCode.TryCheckedException();
      } catch (IOException e) {
        System.out.println(e.getMessage());
      }

      //if we remove this try catch this code will still compile because the compiler
      // won't enforce the try/catch be used for runtime expcetions
      try {
        ExceptionsCode.TryUnCheckedException();
      } catch (IllegalArgumentException e) {
        System.out.println(e.getMessage());
      }


      addSection("threads.Threads");
      Threads.TryThreads();
      Threads.TryRunnable();
      Threads.TryJoinThreads();
      Thread.sleep(1000); //sleep so thread runs before the next line

      addSection("oop.FlightPlan");

        FlightPlan berlinToBucharest = new FlightPlan(
                "BER",
                "OTP"
        );
        berlinToBucharest.print();

        System.out.println();

        // Complete flight plan
        FlightPlan parisToLondon = new FlightPlan(
                "CDG",
                "LHR",
                LocalDateTime.of(2020, 01, 10, 23, 15),
                List.of("CDG", "FARAR", "BAYKA", "DUDES", "LHR")
        );
        parisToLondon.print();
    }


    public static void addSection(String name){
      System.out.println("-------------" + name + "-------------");

    }
}