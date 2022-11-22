package services;

import bsh.CallStack;
import com.crowdar.api.rest.MethodsService;

public class BaseService extends MethodsService {
    public static final ThreadLocal<String> API_KEY = new ThreadLocal<String>();
    public static final ThreadLocal<String> ID_W_SPACE = new ThreadLocal<String>();
    public static final ThreadLocal<String> ID_PROJECT = new ThreadLocal<String>();
    public static final ThreadLocal<String> NAME_PROJECT = new ThreadLocal<String>();
    public static final ThreadLocal<String> USER_ID = new ThreadLocal<String>();
    public static final ThreadLocal<String> ID = new ThreadLocal<String>();

}
