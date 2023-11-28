package eu.roboflax.cloudflare.variables;

import eu.roboflax.cloudflare.constants.interfaces.ConstantVariableIdentifier;
import lombok.Getter;

@Getter
public class VariableInjector {
    String identifier;
    String replacement;

    public VariableInjector(ConstantVariableIdentifier identifier, String replacement) {
        this.identifier = identifier.getIdentifier();
        this.replacement = replacement;
    }


}
