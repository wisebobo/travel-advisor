package com.benny.traveladvisor.controller;

import com.benny.traveladvisor.annotation.CheckSign;
import com.benny.traveladvisor.dto.ErrorResponse;
import com.benny.traveladvisor.dto.ParamResponse;
import com.benny.traveladvisor.service.ResourceService;
import io.swagger.annotations.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Description: This is the RestController class for defining the controller of getting necessary resources
 * @author benny.li
 * Date: 2020/5/18
 */
@RestController
@Slf4j
@Api(tags = "Resources Controller", description = "This is the API of getting required resources for calling travel advisor.")
@RequestMapping("/resources")
public class ResourceController {

    @Autowired
    private ResourceService resourceService;

    @CheckSign
    @ApiOperation(value = "Get avail country", notes = "Get system supported country list")
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
    @GetMapping("/country")
    public ParamResponse getCountry() {
        return resourceService.getCountry();
    }

    @CheckSign
    @ApiOperation(value = "Delete cached country list", notes = "Delete cached country List")
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
    @DeleteMapping("/country")
    public void delCountry() {
        resourceService.delCountry();
    }

    @CheckSign
    @ApiOperation(value = "Get Avail document type", notes = "Get system supported document type")
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
    @GetMapping("/docType")
    public ParamResponse getDocType() {
        return resourceService.getDocType();
    }

    @CheckSign
    @ApiOperation(value = "Delete cached document type", notes = "Delete cached document type")
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
    @DeleteMapping("/docType")
    public void delDocType() {
        resourceService.delDocType();
    }

    @CheckSign
    @ApiOperation(value = "Get Avail Document Type", notes = "Get system supported document type")
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
    @GetMapping("/docGroup")
    public ParamResponse getDocGroup() {
        return resourceService.getDocGroup();
    }

    @CheckSign
    @ApiOperation(value = "Delete cached document group", notes = "Delete cached document group")
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
    @DeleteMapping("/docGroup")
    public void delDocGroup() {
        resourceService.delDocGroup();
    }

}
