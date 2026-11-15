package HW12;

public class FileMaxSizeReachedException extends RuntimeException {
    public FileMaxSizeReachedException(long maxSize, long currentSize, String path) {
        super("Max file size reached. Max size: " + maxSize
                + " bytes, current size: " + currentSize
                + " bytes, file: " + path);
    }
}
