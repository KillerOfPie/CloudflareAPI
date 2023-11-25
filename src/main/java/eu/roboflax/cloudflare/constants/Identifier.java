package eu.roboflax.cloudflare.constants;

import eu.roboflax.cloudflare.constants.interfaces.ConstantIdentifier;
import lombok.Getter;
import lombok.Setter;

public enum Identifier implements ConstantIdentifier {
    ACCOUNT("account_identifier"),
    TUNNEL_ID("tunnel_id"),
    CONNECTOR_ID("connector_id");

    private final String identifier;

    @Getter
    @Setter
    private String replacement = "";

    Identifier(String identifier) {
        this.identifier = identifier;
    }

    public Identifier getIdentifier(String replacement) {
        this.replacement = replacement;
        return this;
    }

    public String getIdentifier() {
        this.replacement = "";
        return "{" + identifier + "}";
    }
}
