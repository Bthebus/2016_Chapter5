package za.ac.cput.ChainOfResponsibilty;

/**
 * Author       : Braedy Thebus (213039168)
 * Email        : Bthebus2@gmail.com
 * Date Created : 2016-04-03
 */
public abstract class GenderHandler {

    public GenderHandler successor;

    public GenderHandler(){}

    public GenderHandler(GenderHandler successor) {
        this.successor = successor;
    }

    public abstract void handleRequest(GenderEnum request);
}
