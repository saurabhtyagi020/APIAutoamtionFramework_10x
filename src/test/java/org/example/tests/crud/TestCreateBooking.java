package org.example.tests.crud;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import io.restassured.RestAssured;
import org.example.base.BaseTest;
import org.example.endpoints.APIConstants;
import org.example.pojos.BookingResponse;
import org.testng.annotations.Test;

public class TestCreateBooking extends BaseTest
{
    @Description("Verify the create booking")
    @Owner("Saurabh")
    @Test(priority = 1)
    public void testCreateBookingPOST()
    {
        requestSpecification.basePath(APIConstants.CREATE_UPDATE_BOOKING_URL); //P -->preparation a request

        response = RestAssured.given(requestSpecification)//M
                .when().body(payloadManager.createPayloadBookingAsString())
                .post();

        validatableResponse = response.then().log().all();//V
        validatableResponse.statusCode(200);


    }

}
