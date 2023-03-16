package exception;
import enums.ExceptionEnum;
public class InvalidIdException extends RuntimeException{
    public InvalidIdException() {
        super(ExceptionEnum.INVALID_ID.name());
    }
}
