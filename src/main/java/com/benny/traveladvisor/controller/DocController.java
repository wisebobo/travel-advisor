package com.benny.traveladvisor.controller;

import com.benny.traveladvisor.annotation.CheckSign;
import com.benny.traveladvisor.dto.*;
import com.benny.traveladvisor.service.TravelAdvisorService;
import io.swagger.annotations.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Description: This is the RestController class for defining the controller of travel advisor
 * @author benny.li
 * Date: 2020/5/18
 */
@RestController
@Slf4j
@Api(tags = "Travel Advisor Controller", description = "This is the API for getting travel advisor.")
public class DocController {
    @Autowired
    private TravelAdvisorService travelAdvisorService;

    @CheckSign
    @ApiOperation(value = "Delete ALL cached Travel Advisor", notes = "Delete ALL cached Travel Advisor")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "X-API-AppId", value = "The appId assigned", paramType = "header", required = true),
            @ApiImplicitParam(name = "X-API-Timestamp", value = "The unix timestamp (e.g. 1589676601)", paramType = "header", required = true),
            @ApiImplicitParam(name = "X-API-Sign", value = "The signature of this request", paramType = "header", required = true),
    })
    @ApiResponses({
            @ApiResponse(code = 400, message = "Invalid Parameter/Timestamp", response = ErrorResponse.class),
            @ApiResponse(code = 401, message = "Unauthorized, Partner not found", response = ErrorResponse.class),
            @ApiResponse(code = 403, message = "Access Forbidden, Invalid signature", response = ErrorResponse.class),
    })
    @DeleteMapping("/travelAdvisor")
    public void delTravelAdvisor() {
        travelAdvisorService.delDocCache();
    }

    @CheckSign
    @ApiOperation(value = "Get cached Travel Advisor", notes = "Get cached Travel Advisor")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "X-API-AppId", value = "The appId assigned", paramType = "header", required = true),
            @ApiImplicitParam(name = "X-API-Timestamp", value = "The unix timestamp (e.g. 1589676601)", paramType = "header", required = true),
            @ApiImplicitParam(name = "X-API-Sign", value = "The signature of this request", paramType = "header", required = true),
    })
    @ApiResponses({
            @ApiResponse(code = 400, message = "Invalid Parameter/Timestamp", response = ErrorResponse.class),
            @ApiResponse(code = 401, message = "Unauthorized, Partner not found", response = ErrorResponse.class),
            @ApiResponse(code = 403, message = "Access Forbidden, Invalid signature", response = ErrorResponse.class),
    })
    @PostMapping("/travelAdvisor")
    public DocResponse getTravelAdvisor(DocRequest docRequest) {
        return travelAdvisorService.getDocCache(docRequest);
    }

    @CheckSign
    @ApiOperation(value = "Get Travel Advisor", notes = "Get Travel Advisor by given criteria")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "X-API-AppId", value = "The appId assigned", paramType = "header", required = true),
            @ApiImplicitParam(name = "X-API-Timestamp", value = "The unix timestamp (e.g. 1589676601)", paramType = "header", required = true),
            @ApiImplicitParam(name = "X-API-Sign", value = "The signature of this request", paramType = "header", required = true),
            @ApiImplicitParam(name = "fromCountry", value = "Which country that you travel from", paramType = "path", required = true),
            @ApiImplicitParam(name = "toCountry", value = "Which country that you travel to", paramType = "path", required = true),
            @ApiImplicitParam(name = "docType", value = "Which document that you are holding", defaultValue = "passport", paramType = "path", required = true),
            @ApiImplicitParam(name = "docGroup", value = "What is the document group", defaultValue = "N", paramType = "path", required = true),
    })
    @ApiResponses({
            @ApiResponse(code = 400, message = "Invalid Parameter/Timestamp", response = ErrorResponse.class),
            @ApiResponse(code = 401, message = "Unauthorized, Partner not found", response = ErrorResponse.class),
            @ApiResponse(code = 403, message = "Access Forbidden, Invalid signature", response = ErrorResponse.class),
    })
    @GetMapping("/travelAdvisor/{fromCountry}/{toCountry}/{docType}/{docGroup}")
    @ResponseBody
    public DocResponse getTravelAdvisorByCountry(@PathVariable String fromCountry,
                                       @PathVariable String toCountry,
                                       @PathVariable String docType,
                                       @PathVariable String docGroup) {
        return travelAdvisorService.getDocCache(fromCountry, toCountry, docType, docGroup);
    }

    @CheckSign
    @ApiOperation(value = "Delete cached Travel Advisor", notes = "Delete cached Travel Advisor by given criteria")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "X-API-AppId", value = "The appId assigned", paramType = "header", required = true),
            @ApiImplicitParam(name = "X-API-Timestamp", value = "The unix timestamp (e.g. 1589676601)", paramType = "header", required = true),
            @ApiImplicitParam(name = "X-API-Sign", value = "The signature of this request", paramType = "header", required = true),
            @ApiImplicitParam(name = "fromCountry", value = "Which country that you travel from", paramType = "path", required = true),
            @ApiImplicitParam(name = "toCountry", value = "Which country that you travel to", paramType = "path", required = true),
            @ApiImplicitParam(name = "docType", value = "Which document that you are holding", defaultValue = "passport", paramType = "path", required = true),
            @ApiImplicitParam(name = "docGroup", value = "What is the document group", defaultValue = "N", paramType = "path", required = true),
    })
    @ApiResponses({
            @ApiResponse(code = 400, message = "Invalid Parameter/Timestamp", response = ErrorResponse.class),
            @ApiResponse(code = 401, message = "Unauthorized, Partner not found", response = ErrorResponse.class),
            @ApiResponse(code = 403, message = "Access Forbidden, Invalid signature", response = ErrorResponse.class),
    })
    @DeleteMapping("/travelAdvisor/{fromCountry}/{toCountry}/{docType}/{docGroup}")
    public void delTravelAdvisorByCountry(@PathVariable String fromCountry,
                                @PathVariable String toCountry,
                                @PathVariable String docType,
                                @PathVariable String docGroup) {
        travelAdvisorService.delDocCache(fromCountry, toCountry, docType, docGroup);
    }
}
