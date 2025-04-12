package SOLIDwithDesignPattern;

public class Resource implements LibraryResource {
    private String title;
    private String type;
    private boolean available;

    public Resource(String title, String type) {
        this.title = title;
        this.type = type;
        this.available = true;
    }

    @Override
    public boolean isAvailable(){
        return available;
    }

    public String getType(){
        return type;
    }

    @Override
    public String getTitle(){
        return title;
    }

    @Override
    public void borrow() {
        if (!available) {
            throw new RuntimeException(type + " " + title + " is not available");
        }
        available = false;
    }

    @Override
    public void returnResource() {
        available = true;
    }

    @Override
    public String toString(){
        return type + ": " + title;
    }
} 