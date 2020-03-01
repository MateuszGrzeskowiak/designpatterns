package pl.sdacademy.designpatterns.observer;

public class ValueLowerObserver extends Observer {

    private int previousState;

    public ValueLowerObserver(Subject subject) {
        super(subject);
        previousState = subject.getState();
    }

    @Override
    public void update() {
        if (subject.getState() < previousState) {

            System.out.println("Value lower and is now: " + subject.getState());
        }
        previousState = subject.getState();
    }
}
