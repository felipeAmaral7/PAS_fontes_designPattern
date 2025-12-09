package StrategyFontes.strategyAplicado.strategy;

import StrategyFontes.strategyAplicado.model.Document;

public interface OcrStrategy {
    String extract(Document doc);
}
