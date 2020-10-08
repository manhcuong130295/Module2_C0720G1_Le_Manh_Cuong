package commons;

public class IdCardException extends  Exception{
    String message;
    public IdCardException(String message){
        this.message=message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
