package eu.roboflax.cloudflare.constants.interfaces;

import eu.roboflax.cloudflare.http.HttpMethod;

public interface ConstantCategory {

    HttpMethod getHttpMethod();

    String getAdditionalPath();

    String getPath();
}
