package com.bddcucumberframework.stepDefinations;

import com.bddcucumberframework.pagesObject.AddJobPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.When;
import org.testng.Assert;
import utils.TestContextSetup;

import java.util.List;

public class AddJobPageStepDefination {

    public TestContextSetup testContextSetup;
    public AddJobPage addjobpage;




    public AddJobPageStepDefination(TestContextSetup testContextSetup){
        this.testContextSetup = testContextSetup;
        this.addjobpage = testContextSetup.pageObjectManager.getAddJobPage();

    }



    @When("User insert following details in form for add job title and save record")
    public void user_insert_following_data_in_form_for_add_job_title(DataTable dataTable) {



        List<List<String>> userList = dataTable.asLists();

        for (List<String> e :userList){

            addjobpage.addRecord();
            addjobpage.addDetails(e.get(0),e.get(1),e.get(2),e.get(3));
            addjobpage.saveRecord();

        }

    }


}
