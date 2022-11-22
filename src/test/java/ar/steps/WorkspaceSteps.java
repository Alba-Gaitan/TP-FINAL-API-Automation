package ar.steps;
import api.model.Project.*;
import ar.validator.WorkspaceValidator;
import com.crowdar.core.PageSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import services.BaseService;
import services.ErrorService;

public class WorkspaceSteps extends PageSteps {

    @Given("Mi cuenta creada en clockify y mi X-Api-Key generada")
    public void miCuentaCreadaEnClockifyYMiXApiKeyGeneada() {
        BaseService.API_KEY.set("NWU5NGYyMDItYjBlZS00OGU4LWI2NmUtNWQ2Mzg2NmRmNTli");
    }

    @Then("Obtengo los datos de mi Workspace")
    public void obtengoLosDatosDeMiWorkspace() {
        WorkspaceValidator.validate();
    }

    @Given("X-Api-Key invalido")
    public void xApiKeyInvalido() {
        BaseService.API_KEY.set("NTRmNTA0YzEtYjZmZC00NWQxLWE5MDItYTQ2Yjc4Njg1Yzc3");
    }
}
