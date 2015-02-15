package esi.system.reports;

import com.itextpdf.text.BadElementException;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfGState;
import esi.system.model.CapaLivroMatriculas;
import esi.system.model.ConteudoMatricula;
import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Bruno
 */
public class LivroMatriculas extends AbstractReport {

    private final CapaLivroMatriculas capa;
    private final ConteudoMatricula[] matriculas;
    
    public LivroMatriculas(OutputStream os, CapaLivroMatriculas capa, ConteudoMatricula[] matriculas) throws DocumentException {
        super(os);
        this.capa = capa;
        this.matriculas = matriculas;
    }

    @Override
    protected Rectangle setUpPageSize() {
        return PageSize.A4;
    }
    
    @Override
    protected Margin setUpMargin() {
        Margin margin = new Margin();
        margin.setLeft(20f);
        margin.setRight(20f);
        margin.setTop(20f);
        margin.setBottom(20f);
        return margin;
    }

    @Override
    protected boolean defaultMargin() {
        return false;
    }

    @Override
    public void build() throws Exception {
        this.open();
        this.buildFirstPage();
        if(this.matriculas.length % 2 != 0){
            throw new Exception("A quantidade de matriculas não é valida!");
        }
        for(int i = 0; i < this.matriculas.length; i++){
            this.buildContentPage(this.matriculas[i], this.matriculas[++i]);
        }
        this.close();
    }
    
    public void buildFirstPage(){
        try {
            PdfContentByte cb = this.getContentByte();
            add(new Paragraph("\n"));
            Image image = Image.getInstance("logo.png");
            float width = this.getPageSize().getWidth();
            float left = (width / 2) - (269f / 2);
            cb.addImage(image, 269f, 0, 0, 172f, left, 500f);
            Paragraph ph = new Paragraph();
            ph.setSpacingBefore(330f);
            ph.setAlignment(Element.ALIGN_CENTER);
            ph.add(new Phrase("Livro Nº "+capa.getLivro(), title));
            ph.add("\n");
            add(ph);
            ph = new Paragraph();
            ph.setSpacingBefore(20f);
            ph.setIndentationLeft(40);
            ph.add(new Phrase("De: ", bold));
            ph.add(capa.getTipo());
            ph.add("\n");
            ph.add(new Phrase("Firma: ",bold));
            ph.add(capa.getFirma());
            ph.add("\n");
            ph.add(new Phrase("Cidade: ", bold));
            ph.add(capa.getCidade());
            ph.add(new Phrase("   Estado: ", bold));
            ph.add(capa.getEstado());
            ph.add("\n");
            ph.add(new Phrase("CNPJ Nº: ", bold));
            ph.add(capa.getCnpj());
            add(ph);
        } catch (IOException ex) {
            Logger.getLogger(LivroMatriculas.class.getName()).log(Level.SEVERE, null, ex);
        } catch (BadElementException ex) {
            Logger.getLogger(LivroMatriculas.class.getName()).log(Level.SEVERE, null, ex);
        } catch (DocumentException ex) {
            Logger.getLogger(LivroMatriculas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void buildContentPage(ConteudoMatricula first, ConteudoMatricula second){
        this.newPage();
        this.buildFirstContent(first);
        this.buildSecondContent(second);
        this.buildImages();
    }
    
    public void buildFirstContent(ConteudoMatricula conteudo){
        Paragraph ph = new Paragraph();
        ph.add("______________________________________");
        ph.add("\n");
        ph.add("Inspetor                                 ");
        ph.setAlignment(Element.ALIGN_RIGHT);
        add(ph);
        ph = new Paragraph();
        ph.setSpacingBefore(10f);
        ph.add(new Phrase("Matrícula Nº "+conteudo.getMatricula(), title));
        ph.setAlignment(Element.ALIGN_CENTER);
        add(ph);
        ph = new Paragraph();
        ph.setSpacingBefore(20f);
        ph.add(new Phrase(" Série:  ", bold));
        ph.add(conteudo.getSerie());
        ph.add(new Phrase("   Turno:  ", bold));
        ph.add(conteudo.getTurno());
        ph.add(new Phrase("   Turma:  ", bold));
        ph.add(conteudo.getTurma());
        ph.add("\n");
        ph.add(new Phrase(" Nome do Aluno:  ", bold));
        ph.add(conteudo.getNomeAluno());
        ph.add("\n");
        ph.add(new Phrase(" Data do Nascimento:  ", bold));
        ph.add(conteudo.getDataNascimento());
        ph.add(new Phrase("   Idade:  ", bold));
        ph.add(conteudo.getIdade());
        ph.add("\n");
        ph.add(new Phrase(" Naturalidade:  ", bold));
        ph.add(conteudo.getNaturalidade());
        ph.add("\n\n");
        ph.add(new Phrase(" Filiação", innerTitle));
        ph.add("\n\n");
        ph.add(new Phrase(" Pai: ", bold));
        ph.add(conteudo.getNomePai());
        ph.add("\n");
        ph.add(new Phrase(" Mãe: ", bold));
        ph.add(conteudo.getNomeMae());
        ph.add("\n\n");
        ph.add(new Phrase(" Residência: ", bold));
        ph.add(conteudo.getResidencia());
        ph.add("\n");
        ph.add(new Phrase(" Data de Matrícula: ", bold));
        ph.add(conteudo.getDataMatricula());
        ph.add("\n");
        ph.add(new Phrase(" Observações: ", bold));
        String obs = conteudo.getObservacoes();
        ph.add(obs);
        add(ph);
        ph = new Paragraph();
        float padding = 56 / ((obs.length() / 78) + 1) + (obs.length() > 0 ? 10 : 0);
        System.out.println("padding: "+padding);
        ph.setSpacingBefore(padding);
        ph.add("___________________________________         ___________________________________");
        ph.add("Secretário                                                                  Diretor");
        ph.setAlignment(Element.ALIGN_CENTER);
        add(ph);
    }
    
    public void buildSecondContent(ConteudoMatricula conteudo){
        Paragraph ph = new Paragraph();
        ph.setSpacingBefore(25f);
        ph.add("______________________________________");
        ph.add("\n");
        ph.add("Inspetor                                 ");
        ph.setAlignment(Element.ALIGN_RIGHT);
        add(ph);
        ph = new Paragraph();
        ph.setSpacingBefore(10f);
        ph.add(new Phrase("Matrícula Nº "+conteudo.getMatricula(), title));
        ph.setAlignment(Element.ALIGN_CENTER);
        add(ph);
        ph = new Paragraph();
        ph.setSpacingBefore(20f);
        ph.add(new Phrase(" Série:  ", bold));
        ph.add(conteudo.getSerie());
        ph.add(new Phrase("   Turno:  ", bold));
        ph.add(conteudo.getTurno());
        ph.add(new Phrase("   Turma:  ", bold));
        ph.add(conteudo.getTurma());
        ph.add("\n");
        ph.add(new Phrase(" Nome do Aluno:  ", bold));
        ph.add(conteudo.getNomeAluno());
        ph.add("\n");
        ph.add(new Phrase(" Data do Nascimento:  ", bold));
        ph.add(conteudo.getDataNascimento());
        ph.add(new Phrase("   Idade: ", bold));
        ph.add(conteudo.getIdade());
        ph.add("\n");
        ph.add(new Phrase(" Naturalidade:  ", bold));
        ph.add(conteudo.getNaturalidade());
        ph.add("\n\n");
        ph.add(new Phrase(" Filiação", innerTitle));
        ph.add("\n\n");
        ph.add(new Phrase(" Pai: ", bold));
        ph.add(conteudo.getNomePai());
        ph.add("\n");
        ph.add(new Phrase(" Mãe: ", bold));
        ph.add(conteudo.getNomeMae());
        ph.add("\n\n");
        ph.add(new Phrase(" Residência: ", bold));
        ph.add(conteudo.getResidencia());
        ph.add("\n");
        ph.add(new Phrase(" Data de Matrícula: ", bold));
        ph.add(conteudo.getDataMatricula());
        ph.add("\n");
        ph.add(new Phrase(" Observações: ", bold));
        String obs = conteudo.getObservacoes();
        ph.add(obs);
        add(ph);
        ph = new Paragraph();
        float padding = 56 / ((obs.length() / 78) + 1) + (obs.length() > 0 ? 10 : 0);
        ph.setSpacingBefore(padding);
        ph.add("___________________________________         ___________________________________");
        ph.add("Secretário                                                                  Diretor");
        ph.setAlignment(Element.ALIGN_CENTER);
        add(ph);
    }
    
    public void buildImages(){
        try{
            Image img = Image.getInstance("logo.png");
            PdfGState gs = new PdfGState();
            PdfContentByte cb = getContentByte();
            gs.setFillOpacity(0f);
            cb.setColorStroke(BaseColor.BLACK);
            cb.setColorFill(BaseColor.WHITE);
            cb.setGState(gs);
            cb.roundRectangle(30f, 425f, 535f, 390f, 6f);
            cb.roundRectangle(30f, 25f, 535f, 390f, 6f);
            cb.fillStroke();
            gs.setFillOpacity(0.09f);
            cb.addImage(img, 550f, 0, 0, 350f, 30f, 430f);
            cb.addImage(img, 550f, 0, 0, 350f, 30f, 30f);
        } catch(IOException | DocumentException e){
            Logger.getLogger(LivroMatriculas.class.getName()).log(Level.SEVERE, null, e);
        }
    }

}
