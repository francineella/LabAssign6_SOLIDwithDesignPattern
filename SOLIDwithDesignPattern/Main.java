package SOLIDwithDesignPattern;

public class Main {
    public static void main(String[] args) {
        Library neuLibrary = new Library();
        
        neuLibrary.addResource(neuLibrary.createBook("Design Patterns"));
        neuLibrary.addResource(neuLibrary.createJournal("IEEE Software"));
        neuLibrary.addResource(neuLibrary.createThesis("SOLID Principles"));
        neuLibrary.addResource(neuLibrary.createNewspaper("NEU Times"));
        
        neuLibrary.addResource(neuLibrary.createResource("Learn Python", "AudioBook"));
        
        Student student = new Student("25-11558-016", "Elle");
        
        LibraryResource book = neuLibrary.findByTitle("Design Patterns");
        LibraryResource journal = neuLibrary.findByTitle("IEEE Software");
        
        student.borrowedResources(book);
        student.borrowedResources(journal);
        student.returnResource(book);
        
        System.out.println("\nCurrently borrowed by " + student.getName() + ":");
        for (LibraryResource item : student.getBorrowedItems()) {
            System.out.println(item.getTitle());
        }
    }
}