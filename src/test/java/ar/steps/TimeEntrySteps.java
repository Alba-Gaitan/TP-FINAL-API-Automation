package ar.steps;
import api.model.Project.*;
import ar.validator.ProjectValidator;
import com.crowdar.api.rest.APIManager;
import com.crowdar.core.PageSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import com.crowdar.core.PageSteps;
import services.*;

public class TimeEntrySteps extends PageSteps {

    @And("un userId")
    public void unId_User() {
        BaseService.USER_ID.set("6354623028051215c2f00788");
    }

    @And("un id del registro de horas")
    public void unId_Horas() {
        BaseService.ID.set("637d04e9900d046e778e74f5");
    }


    @And("un id del registro de horas a eliminar")
    public void unIdDelRegistroDeHorasAEliminar() {
        BaseService.ID.set("637d08a07840962f9daf549c");
    }
}
