package pl.mateuszwarzyc.behavioral.chainOfResponsibility.impl;

/**
 * Created by Coffee13.
 */
public abstract class Handler {

    protected Handler successor;

    public abstract void handleRequest(Request request);

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }
}
