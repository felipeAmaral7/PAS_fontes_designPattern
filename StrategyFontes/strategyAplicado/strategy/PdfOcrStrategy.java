package StrategyFontes.strategyAplicado.strategy;
import StrategyFontes.strategyAplicado.model.Document;

public class PdfOcrStrategy implements OcrStrategy {
    @Override
    public String extract(Document doc) {
        System.out.println("OCR de PDF executado");
        return "texto extraído do PDF";
    }
}

