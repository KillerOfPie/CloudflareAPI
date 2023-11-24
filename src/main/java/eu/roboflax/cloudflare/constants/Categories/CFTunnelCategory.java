package eu.roboflax.cloudflare.constants.Categories;

import eu.roboflax.cloudflare.CloudflareAccess;
import eu.roboflax.cloudflare.constants.interfaces.ConstantCategory;
import eu.roboflax.cloudflare.http.HttpMethod;

public enum CFTunnelCategory implements ConstantCategory {

    //Tunnel
    LIST_TUNNELS( HttpMethod.GET, "zones/{id-1}/cfd_tunnel" ),
    CREATE_TUNNEL( HttpMethod.POST, "accounts/{id-1}/cfd_tunnel" ),
    DELETE_TUNNEL( HttpMethod.DELETE, "accounts/{id-1}/cfd_tunnel/{id-2}" ),
    GET_TUNNEL( HttpMethod.GET, "accounts/{id-1}/cfd_tunnel/{id-2}" ),
    UPDATE_TUNNEL( HttpMethod.PATCH, "accounts/{id-1}/cfd_tunnel/{id-2}" ),
    CLEANUP_TUNNEL_CONNECTIONS( HttpMethod.DELETE, "accounts/{id-1}/cfd_tunnel/{id-2}/connections" ),
    LIST_TUNNEL_CONNECTIONS( HttpMethod.GET, "accounts/{id-1}/cfd_tunnel/{id-2}/connections" ),
    GET_TUNNEL_CONNECTOR( HttpMethod.GET, "accounts/{id-1}/cfd_tunnel/{id-2}/connectors/{id-3}" ),
    GET_TUNNEL_MANAGEMENT_TOKEN( HttpMethod.POST, "accounts/{id-1}/cfd_tunnel/{id-2}/management" ),
    GET_TUNNEL_TOKEN( HttpMethod.GET, "accounts/{id-1}/cfd_tunnel/{id-2}/token" ),
    LIST_ALL_TUNNELS( HttpMethod.GET, "accounts/{id-1}/tunnels" ),
    LIST_WARP_CONNECTOR_TUNNELS( HttpMethod.GET, "accounts/{id-1}/warp_connector" ),
    CREATE_WARP_CONNECTOR_TUNNEL( HttpMethod.POST, "accounts/{id-1}/warp_connector" ),
    DELETE_WARP_CONNECTOR_TUNNEL( HttpMethod.DELETE, "accounts/{id-1}/warp_connector/{id-2}" ),
    GET_WARP_CONNECTOR_TUNNEL( HttpMethod.GET, "accounts/{id-1}/warp_connector/{id-2}" ),
    UPDATE_WARP_CONNECTOR_TUNNEL( HttpMethod.PATCH, "accounts/{id-1}/warp_connector/{id-2}" ),
    GET_WARP_CONNECTOR_TUNNEL_TOKEN( HttpMethod.GET, "accounts/{id-1}/warp_connector/{id-2}/token" ),

    //Tunnel configuration
    GET_CONFIGURATION( HttpMethod.GET, "accounts/{id-1}/cfd_tunnel/{id-2}/configurations" ),
    PUT_CONFIGURATION( HttpMethod.PUT, "accounts/{id-1}/cfd_tunnel/{id-2}/configurations" );

    private HttpMethod httpMethod;
    private String additionalPath;

    CFTunnelCategory(HttpMethod httpMethod, String additionalPath ) {
        this.httpMethod = httpMethod;
        this.additionalPath = additionalPath;
    }

    public HttpMethod getHttpMethod( ) {
        return httpMethod;
    }

    public String getAdditionalPath( ) {
        return additionalPath;
    }

    public String getPath( ) {
        return CloudflareAccess.API_BASE_URL + additionalPath;
    }
}
