package session11_abstraction.practice.information;

public class CSVReport extends Report implements CSVExportable{
    @Override
    public void showPreview() {
        //FROM ABSTRACT CLASS
    }

    @Override
    public void displayMetadata() {
        super.displayMetadata();
        //FROM ABSTRACT CLASS
    }

    @Override
    public void exportToCsv() {
        //FROM INTERFACE
    }
}
