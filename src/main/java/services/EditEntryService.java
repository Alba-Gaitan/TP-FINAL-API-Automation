package services;

import api.model.Project.AddTimeResponse;
import api.model.Project.EditTimeResponse;
import com.crowdar.api.rest.Response;

import java.util.HashMap;
import java.util.Map;

public class EditEntryService extends BaseService {

    public static Response put(String jsonName) {
        return put(jsonName, EditTimeResponse.class, setParams());
    }
    private static Map<String,String> setParams(){
        Map<String,String> params= new HashMap<>();
        params.put("api-key",API_KEY.get());
        params.put("wSpace",ID_W_SPACE.get());
        params.put("id",ID.get());
        return params;
    }

}
