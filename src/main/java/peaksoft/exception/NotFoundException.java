package peaksoft.exception;

/**
 * name : kutman
 **/
public class NotFoundException extends RuntimeException{
    public NotFoundException() {
    }

    public NotFoundException(String message) {
        super(message);
    }
}
