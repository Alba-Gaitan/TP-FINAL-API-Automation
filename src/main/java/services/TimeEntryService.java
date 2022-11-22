package services;

import api.model.Project.TimeEntryResponse;

import com.crowdar.api.rest.MethodsService;
import com.crowdar.api.rest.Response;
import com.crowdar.core.PropertyManager;

import java.util.HashMap;
import java.util.Map;

public class TimeEntryService extends BaseService {

    public static Response get(String jsonName) {
        return get(jsonName, TimeEntryResponse[].class, setParams());
    }
    private static Map<String,String> setParams(){
        Map<String,String> params= new HashMap<>();
        params.put("api-key",API_KEY.get());
        params.put("wSpace",ID_W_SPACE.get());
        params.put("userId",USER_ID.get());
        return params;
    }
}
