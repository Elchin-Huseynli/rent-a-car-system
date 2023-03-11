package exception;
import enums.ExceptionEnum;
public class InvalidParameterException extends RuntimeException{
    public InvalidParameterException() {
        super(ExceptionEnum.INVALID_PARAMETER.name());
    }
}
