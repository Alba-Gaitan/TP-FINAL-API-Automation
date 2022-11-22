package services;

import api.model.Project.AddTimeResponse;
import api.model.Project.TimeEntryResponse;
import com.crowdar.api.rest.Response;
import com.crowdar.core.PropertyManager;

import java.util.HashMap;
import java.util.Map;

public class AddEntryService extends BaseService {

    public static Response post(String jsonName) {
        return post(jsonName, AddTimeResponse.class, setParams());
    }
    private static Map<String,String> setParams(){
        Map<String,String> params= new HashMap<>();
        params.put("api-key",API_KEY.get());
        params.put("wSpace",ID_W_SPACE.get());
        return params;
    }

}
