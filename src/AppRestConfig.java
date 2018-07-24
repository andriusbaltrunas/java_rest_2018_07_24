import org.glassfish.jersey.server.ResourceConfig;

import javax.ws.rs.ApplicationPath;

/**
 * Created by andriusbaltrunas on 7/24/2018.
 */

@ApplicationPath("/rest")
public class AppRestConfig extends ResourceConfig {
    public AppRestConfig(){
        packages("rest");
    }
}