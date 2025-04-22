package supernova.learningportal.exception;

public class ContentUploadException extends RuntimeException {
    public ContentUploadException(String message) {
        super(message);
    }

    public ContentUploadException(String message, Throwable cause) {
        super(message, cause);
    }
} 