package za.ac.cput.ChainOfResponsibilty.handlers;

import za.ac.cput.ChainOfResponsibilty.GenderEnum;
import za.ac.cput.ChainOfResponsibilty.GenderHandler;

/**
 * Author       : Braedy Thebus (213039168)
 * Email        : Bthebus2@gmail.com
 * Date Created : 2016-04-03
 */
public class FemaleHandler extends GenderHandler{
    @Override
    public void handleRequest(GenderEnum request) {
        if (request == GenderEnum.FEMALE) {
            System.out.println("FemaleHandler handles " + request);
            System.out.println("Females smell nice.\n");
        } else {
            System.out.println("FemaleHandler doesn't handle " + request);
            if (successor != null) {
                successor.handleRequest(request);
            }
        }
    }
}
