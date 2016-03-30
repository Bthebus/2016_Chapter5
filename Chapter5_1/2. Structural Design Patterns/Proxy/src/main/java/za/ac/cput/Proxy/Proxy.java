package za.ac.cput.Proxy;

import za.ac.cput.Proxy.impl.Jogger;

import java.util.Date;

/**
 * Author       : Braedy Thebus (213039168)
 * Email        : Bthebus2@gmail.com
 * Date Created : 2016-03-30
 */
public class Proxy {

    private Jogger jogger;

    public Proxy() {
        System.out.println("Proxy created at: "+new Date());
    }

    public void createJogger(){
        if(jogger==null)
            jogger = new Jogger();
        jogger.createAthlete();
    }
}
