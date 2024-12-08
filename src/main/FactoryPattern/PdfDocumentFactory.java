package FactoryPattern;

public class PdfDocumentFactory {

    public Document createDocument() {
        return new PdfDocument();
    }

}
