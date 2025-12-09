package StrategyFontes.strategyAplicado;

import StrategyFontes.strategyAplicado.context.OcrContext;
import StrategyFontes.strategyAplicado.model.Document;
import StrategyFontes.strategyAplicado.model.DocumentType;
import StrategyFontes.strategyAplicado.strategy.OcrStrategy;
import StrategyFontes.strategyAplicado.factory.OcrStrategyFactory;

public class Main {

    public static void main(String[] args) {

        Document pdfDoc = new Document(DocumentType.PDF);

        // A fábrica escolhe a estratégia correta automaticamente
        OcrStrategy strategy = OcrStrategyFactory.create(pdfDoc.getType());

        // O contexto executa o OCR com a estratégia escolhida
        OcrContext context = new OcrContext(strategy);

        System.out.println("Processando documento PDF...");
        String result = context.process(pdfDoc);
        System.out.println("Resultado: " + result);

        Document imageDoc = new Document(DocumentType.IMAGE);
        context.setStrategy(OcrStrategyFactory.create(imageDoc.getType()));

        System.out.println("\nProcessando documento de imagem...");
        String result2 = context.process(imageDoc);
        System.out.println("Resultado: " + result2);

        Document epubDoc = new Document(DocumentType.EPUB);
        context.setStrategy(OcrStrategyFactory.create(epubDoc.getType()));

        System.out.println("\nProcessando documento EPUB...");
        String result3 = context.process(epubDoc);
        System.out.println("Resultado: " + result3);
    }
}
