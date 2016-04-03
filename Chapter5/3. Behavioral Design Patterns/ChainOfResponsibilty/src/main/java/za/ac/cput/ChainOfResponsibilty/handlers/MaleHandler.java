package za.ac.cput.ChainOfResponsibilty.handlers;

import za.ac.cput.ChainOfResponsibilty.GenderEnum;
import za.ac.cput.ChainOfResponsibilty.GenderHandler;

/**
 * Author       : Braedy Thebus (213039168)
 * Email        : Bthebus2@gmail.com
 * Date Created : 2016-04-03
 */
public class MaleHandler extends GenderHandler {
    @Override
    public void handleRequest(GenderEnum request) {
        if (request == GenderEnum.MALE) {
            System.out.println("MaleHandler handles " + request);
            System.out.println("Males are strong.\n");
        } else {
            System.out.println("MaleHandler doesn't handle " + request);
            if (successor != null) {
                successor.handleRequest(request);
            }
        }
    }
}
