package StrategyFontes.strategyAplicado.strategy;

import StrategyFontes.strategyAplicado.model.Document;

public class EpubOcrStrategy implements OcrStrategy {
    @Override
    public String extract(Document doc) {
        System.out.println("OCR de EPUB executado");
        return "texto extraído de EPUB";
    }
}
