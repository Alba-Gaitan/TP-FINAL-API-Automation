package services;

import api.model.Project.EditTimeResponse;
import api.model.Project.ProjectResponse;
import com.crowdar.api.rest.Response;

import java.util.HashMap;
import java.util.Map;

public class DeleteTimeService extends BaseService {

    public static Response delete(String jsonName) {
        return delete(jsonName, ProjectResponse.class, setParams());
    }
    private static Map<String,String> setParams(){
        Map<String,String> params= new HashMap<>();
        params.put("api-key",API_KEY.get());
        params.put("wSpace",ID_W_SPACE.get());
        params.put("id",ID.get());
        return params;
    }

}
