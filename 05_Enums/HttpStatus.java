public enum HttpStatus {
    OK(200, "Success"),
    BAD_REQUEST(400, "Invalid request"),
    NOT_FOUND(404, "Not Found"),
    SERVER_ERROR(500, "Server Error");

    private final int code;
    private final String message;

    HttpStatus(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() { return code; }
    public String getMessage() { return message; }
}
