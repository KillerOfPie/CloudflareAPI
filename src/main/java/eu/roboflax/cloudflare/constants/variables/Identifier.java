package eu.roboflax.cloudflare.constants.variables;

import eu.roboflax.cloudflare.constants.interfaces.ConstantVariableIdentifier;

public enum Identifier implements ConstantVariableIdentifier {
    ACCOUNT_ID("account_id"),
    ZONE_ID("zone_id"),
    TUNNEL_ID("tunnel_id"),
    CONNECTOR_ID("connector_id");

    String identifier;

    Identifier(String identifier) {
         this.identifier = identifier;
    }

    @Override
    public String getValue() {
        return identifier;
    }

    @Override
    public String toString() {
        return getValue();
    }
}
