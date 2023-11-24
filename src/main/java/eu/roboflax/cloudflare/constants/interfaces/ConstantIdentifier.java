package eu.roboflax.cloudflare.constants.interfaces;


public interface ConstantIdentifier {

    ConstantIdentifier getIdentifier(String replacement);
    String getIdentifier();
    String getReplacement();

}
