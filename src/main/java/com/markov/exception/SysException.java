package com.markov.exception;

public class SysException extends Exception {
    private static final long versionID= 4055945147128016300L;
    private String message;

    public static long getVersionID() {
        return versionID;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    public SysException(String message){
        this.message=message;
    }
}
