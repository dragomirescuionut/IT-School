package session16_funcitonal_infterface_lambda.pdf_resume_builder;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfWriter;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDType1Font;

import java.io.*;

public class TestPDF {
    public static void main(String[] args) throws IOException {
        Document pdfDoc = new Document(PageSize.A4);
        try {
            PdfWriter.getInstance(pdfDoc, new FileOutputStream("C:\\Users\\drago\\Desktop\\IT-School\\IT-School\\src\\session16_funcitonal_infterface_lambda\\pdf_resume_builder\\newdoc.pdf")).setPdfVersion(PdfWriter.PDF_VERSION_1_7);
            pdfDoc.open();
            Font myfont = new Font();
            myfont.setStyle(Font.NORMAL);
            myfont.setSize(11);
            pdfDoc.add(new Paragraph("\n"));
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\drago\\Desktop\\IT-School\\IT-School\\src\\session16_funcitonal_infterface_lambda\\pdf_resume_builder\\test.txt"));
            String strLine;
            while ((strLine = br.readLine()) != null) {
                Paragraph para = new Paragraph(strLine + "\n", myfont);
                para.setAlignment(Element.ALIGN_JUSTIFIED);
                pdfDoc.add(para);
            }
            pdfDoc.close();
            br.close();
        } catch (DocumentException e) {
            throw new RuntimeException(e);
        }

    }
}