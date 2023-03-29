package threads;

import java.util.concurrent.Callable;

public class CallThread implements Callable<String> {
    /***
     * Callable requires an executor service
     * @return
     * @throws Exception
     */
    @Override
    public String call() throws Exception {
        return "You called the callable";
    }
}