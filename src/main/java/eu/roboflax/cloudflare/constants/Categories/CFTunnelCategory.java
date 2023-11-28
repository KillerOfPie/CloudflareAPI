package eu.roboflax.cloudflare.constants.Categories;

import eu.roboflax.cloudflare.CloudflareAccess;
import eu.roboflax.cloudflare.constants.interfaces.ConstantCategory;
import eu.roboflax.cloudflare.constants.variables.Identifier;
import eu.roboflax.cloudflare.http.HttpMethod;
import lombok.Getter;

public enum CFTunnelCategory implements ConstantCategory {

    //Tunnel
    LIST_TUNNELS( HttpMethod.GET, "zones/%acct-id%/cfd_tunnel" ),
    CREATE_TUNNEL( HttpMethod.POST, "accounts/%acct-id%/cfd_tunnel" ),
    DELETE_TUNNEL( HttpMethod.DELETE, "accounts/%acct-id%/cfd_tunnel/%tunnel-id%" ),
    GET_TUNNEL( HttpMethod.GET, "accounts/%acct-id%/cfd_tunnel/%tunnel-id%" ),
    UPDATE_TUNNEL( HttpMethod.PATCH, "accounts/%acct-id%/cfd_tunnel/%tunnel-id%" ),
    CLEANUP_TUNNEL_CONNECTIONS( HttpMethod.DELETE, "accounts/%acct-id%/cfd_tunnel/%tunnel-id%/connections" ),
    LIST_TUNNEL_CONNECTIONS( HttpMethod.GET, "accounts/%acct-id%/cfd_tunnel/%tunnel-id%/connections" ),
    GET_TUNNEL_CONNECTOR( HttpMethod.GET, "accounts/%acct-id%/cfd_tunnel/%tunnel-id%/connectors/%tunnel-id%" ),
    GET_TUNNEL_MANAGEMENT_TOKEN( HttpMethod.POST, "accounts/%acct-id%/cfd_tunnel/%tunnel-id%/management" ),
    GET_TUNNEL_TOKEN( HttpMethod.GET, "accounts/%acct-id%/cfd_tunnel/%tunnel-id%/token"),
    LIST_ALL_TUNNELS( HttpMethod.GET, "accounts/%acct-id%/tunnels"),
    LIST_WARP_CONNECTOR_TUNNELS( HttpMethod.GET, "accounts/%acct-id%/warp_connector" ),
    CREATE_WARP_CONNECTOR_TUNNEL( HttpMethod.POST, "accounts/%acct-id%/warp_connector" ),
    DELETE_WARP_CONNECTOR_TUNNEL( HttpMethod.DELETE, "accounts/%acct-id%/warp_connector/%tunnel-id%" ),
    GET_WARP_CONNECTOR_TUNNEL( HttpMethod.GET, "accounts/%acct-id%/warp_connector/%tunnel-id%" ),
    UPDATE_WARP_CONNECTOR_TUNNEL( HttpMethod.PATCH, "accounts/%acct-id%/warp_connector/%tunnel-id%" ),
    GET_WARP_CONNECTOR_TUNNEL_TOKEN( HttpMethod.GET, "accounts/%acct-id%/warp_connector/%tunnel-id%/token" ),

    //Tunnel configuration
    GET_CONFIGURATION( HttpMethod.GET, "accounts/%acct-id%/cfd_tunnel/%tunnel-id%/configurations" ),
    PUT_CONFIGURATION( HttpMethod.PUT, "accounts/%acct-id%/cfd_tunnel/%tunnel-id%/configurations" );

    @Getter
    private HttpMethod httpMethod;
    private String additionalPath;

    CFTunnelCategory(HttpMethod httpMethod, String additionalPath ) {
        this.httpMethod = httpMethod;
        this.additionalPath = additionalPath;
    }

    public String getAdditionalPath( ) {
        return additionalPath.replace("%acct-id%", Identifier.ACCOUNT_ID.getIdentifier()).replace("%tunnel-id%", Identifier.TUNNEL_ID.getIdentifier());
    }

    public String getPath( ) {
        return CloudflareAccess.API_BASE_URL + additionalPath;
    }
}
