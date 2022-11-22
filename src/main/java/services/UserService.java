package services;

import api.model.Data;
import api.model.Project.TimeEntryResponse;
import api.model.UserCreated;
import com.crowdar.api.rest.MethodsService;
import com.crowdar.api.rest.Response;

import java.util.HashMap;
import java.util.Map;


public class UserService extends BaseService {

    public static Response get(String jsonName) {
       return get(jsonName, Data.class);
    }

    public static Response post(String jsonName) {
        return post(jsonName, UserCreated.class);
    }

}
