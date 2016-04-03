package za.ac.cput.ChainOfResponsibilty.handlers;

import za.ac.cput.ChainOfResponsibilty.GenderEnum;
import za.ac.cput.ChainOfResponsibilty.GenderHandler;

/**
 * Author       : Braedy Thebus (213039168)
 * Email        : Bthebus2@gmail.com
 * Date Created : 2016-04-03
 */
public class OtherHandler extends GenderHandler {
    @Override
    public void handleRequest(GenderEnum request) {
        if (request == GenderEnum.OTHER) {
            System.out.println("OtherHandler handles " + request);
            System.out.println("This is not a gender. Most likely an alien\n");
        } else {
            System.out.println("OtherHandler doesn't handle " + request);
            if (successor != null) {
                successor.handleRequest(request);
            }
        }
    }
}
