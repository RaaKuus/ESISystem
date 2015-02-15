package esi.system.reports;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.IOException;
import java.io.OutputStream;

/**
 *
 * @author Bruno
 */

public abstract class AbstractReport {
    
    protected static final Font bold = new Font(Font.FontFamily.TIMES_ROMAN, 13, Font.BOLD, BaseColor.BLACK);
    protected static final Font innerTitle = new Font(Font.FontFamily.TIMES_ROMAN, 15, Font.BOLD, BaseColor.BLACK);
    protected static final Font title = new Font(Font.FontFamily.TIMES_ROMAN, 22, Font.BOLD, BaseColor.BLACK);
    
    
    private final OutputStream os;
    private Document document;
    private PdfWriter pdfWriter;
    
    public AbstractReport(OutputStream os) throws DocumentException {
        this.os = os;
        init();
    }
    
    private void init() throws DocumentException{
        this.document = new Document(setUpPageSize());
        pdfWriter = PdfWriter.getInstance(document, os);
        if(!defaultMargin()){
            Margin margin = setUpMargin();
            document.setMargins(margin.getLeft(), margin.getRight(), margin.getTop(), margin.getBottom());
        }
    }
    
    protected abstract Margin setUpMargin();
    protected abstract Rectangle setUpPageSize();
    protected abstract boolean defaultMargin();
    
    protected void open(){
        document.open();
    }
    
    protected void close(){
        document.close();
    }
    
    abstract void build() throws Exception;
    
    protected PdfContentByte getContentByte(){
        return pdfWriter.getDirectContent();
    }
    
    protected Rectangle getPageSize(){
        return this.document.getPageSize();
    }
    
    protected void newPage(){
        this.document.newPage();
    }
    
    protected void add(Element element){
        
    }
}
