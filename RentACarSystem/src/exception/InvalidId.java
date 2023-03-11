package exception;
import enums.ExceptionEnum;
public class InvalidId  extends RuntimeException{
    public InvalidId() {
        super(ExceptionEnum.INVALID_ID.name());
    }
}
