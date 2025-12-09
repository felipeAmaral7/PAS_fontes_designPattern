package StrategyFontes.strategyAplicado.context;


import StrategyFontes.strategyAplicado.model.Document;
import StrategyFontes.strategyAplicado.strategy.OcrStrategy;

public class OcrContext {

    private OcrStrategy strategy;

    public OcrContext(OcrStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(OcrStrategy strategy) {
        this.strategy = strategy;
    }

    public String process(Document document) {
        return strategy.extract(document);
    }
}
