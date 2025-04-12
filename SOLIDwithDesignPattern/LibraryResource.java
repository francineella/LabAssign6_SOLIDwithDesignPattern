package SOLIDwithDesignPattern;

public interface LibraryResource {
    boolean isAvailable();
    void returnResource();
    String getTitle();
    void borrow();
    
}