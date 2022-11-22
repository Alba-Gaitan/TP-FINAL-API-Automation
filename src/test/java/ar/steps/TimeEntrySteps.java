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
        BaseService.ID.set("6379b0ddadc0fe7097651a42");
    }

}
