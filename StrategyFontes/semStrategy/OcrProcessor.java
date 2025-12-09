package StrategyFontes.semStrategy;

import StrategyFontes.semStrategy.model.Document;
import StrategyFontes.semStrategy.model.DocumentType;

public class OcrProcessor {

    public String extract(Document document) {

        // LÓGICA TODA ACOPLADA

        if (document.getType() == DocumentType.PDF) {
            System.out.println("Executando OCR de PDF");
            return "texto extraído do PDF";

        } else if (document.getType() == DocumentType.IMAGE) {
            System.out.println("Executando OCR de imagem");
            return "texto extraído de imagem";

        } else if (document.getType() == DocumentType.EPUB) {
            System.out.println("Executando OCR de EPUB");
            return "texto extraído de EPUB";

        } else {
            throw new UnsupportedOperationException(
                    "Tipo de documento não suportado: " + document.getType()
            );
        }
    }
}

