package StrategyFontes.strategyAplicado.model;

public class Document {
    private DocumentType type;

    public Document(DocumentType type) {
        this.type = type;
    }

    public DocumentType getType() {
        return type;
    }
}
