package session11_abstraction.practice.information;

public class PDFReport extends Report implements PDFExportable {
    @Override
    public void showPreview() {

    }

    @Override
    public void displayMetadata() {
        super.displayMetadata();
    }

    @Override
    public void exportToPDF() {

    }
}
