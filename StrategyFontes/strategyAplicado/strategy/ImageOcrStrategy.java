package StrategyFontes.strategyAplicado.strategy;

import StrategyFontes.strategyAplicado.model.Document;

public class ImageOcrStrategy implements OcrStrategy {
    @Override
    public String extract(Document doc) {
        System.out.println("OCR de imagem executado");
        return "texto extraído de imagem";
    }
}
