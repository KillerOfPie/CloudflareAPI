package eu.roboflax.cloudflare.constants.interfaces;


import eu.roboflax.cloudflare.variables.VariableInjector;

public interface ConstantVariableIdentifier {
    String bef = "{", aft = "}";

    String getValue();

    default String getIdentifier() {
        return getIdentifier(bef, aft);
    }
    default String getIdentifier(String bef, String aft) {
        return bef + getValue() + aft;
    }
    default VariableInjector getInjector(String replacement) {
        return new VariableInjector(this, replacement);
    }

}
