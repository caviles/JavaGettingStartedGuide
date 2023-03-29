package Exceptions;

import java.io.IOException;

public class ExceptionsCode {

    ///--------------------------
    //This method throws IOException which extends Exception which is the checkedexception class
    /// This method will be check that it is caught at compile time
    ///---------------------------
    public static void TryCheckedException() throws IOException {
        throw new IOException();
    }

    ///--------------------------
    //This method throws IllegalArgumentException which extends runtimeexception which isn't a checkedexception class
    /// This method won't be checked that it is caught at compile time
    ///---------------------------
    public static void TryUnCheckedException() throws IllegalArgumentException {
        throw new IllegalArgumentException();
    }

}
