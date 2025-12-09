package StrategyFontes.strategyAplicado.factory;

import StrategyFontes.strategyAplicado.model.DocumentType;
import StrategyFontes.strategyAplicado.strategy.*;

public class OcrStrategyFactory {

    public static OcrStrategy create(DocumentType type) {
        return switch (type) {
            case PDF   -> new PdfOcrStrategy();
            case IMAGE -> new ImageOcrStrategy();
            case EPUB  -> new EpubOcrStrategy();
        };
    }
}


