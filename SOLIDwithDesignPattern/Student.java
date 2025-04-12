package SOLIDwithDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String id;
    private String name;
    private List<LibraryResource> borrowedItems;

    public Student(String id, String name) {
        this.id = id;
        this.name = name;
        this.borrowedItems = new ArrayList<>();
    }

    public void borrowedResources(LibraryResource resource) {
        if (resource.isAvailable()) {
            resource.borrow();
            borrowedItems.add(resource);
            System.out.println(name + " borrowed: " + resource.getTitle());
        } else {
            System.out.println("Sorry, " + resource.getTitle() + " is not available.");
        }
    }

    public void returnResource(LibraryResource resource) {
        if (borrowedItems.contains(resource)) {
            resource.returnResource();
            borrowedItems.remove(resource);
            System.out.println(name + " returned " + resource.getTitle());
        } else {
            System.out.println("You did not borrow this resources: " + resource.getTitle());
            }
        }

    public List<LibraryResource> getBorrowedItems() {
        return new ArrayList<>(borrowedItems);
    }

    public String getId() {
        return id;
    }

    public String getName(){
        return name;
    }


}