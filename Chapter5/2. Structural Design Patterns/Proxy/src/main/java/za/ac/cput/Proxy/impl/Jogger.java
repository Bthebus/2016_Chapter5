package za.ac.cput.Proxy.impl;



/**
 * Author       : Braedy Thebus (213039168)
 * Email        : Bthebus2@gmail.com
 * Date Created : 2016-03-30
 */
public class Jogger extends CreateAthlete {

    public Jogger() {
        try{
            //10 seconds to create
            Thread.sleep(10000);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
