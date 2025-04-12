package SOLIDwithDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<LibraryResource> resources;

    public Library() {
        this.resources = new ArrayList<>();
    }

    public void addResource(LibraryResource resource) {
        resources.add(resource);
    }

    public LibraryResource findByTitle(String title) {
        for (LibraryResource resource : resources) {
            if (resource.getTitle().equalsIgnoreCase(title)) {
                return resource;
            }
        }
        return null;
    }

    public LibraryResource createBook(String title) {
        return new Resource(title, "Book");
    }

    public LibraryResource createJournal(String title) {
        return new Resource(title, "Journal");
    }

    public LibraryResource createThesis(String title) {
        return new Resource(title, "Thesis");
    }

    public LibraryResource createNewspaper(String title) {
        return new Resource(title, "Newspaper");
    }

    public LibraryResource createResource(String title, String type) {
        return new Resource(title, type);
    }

}