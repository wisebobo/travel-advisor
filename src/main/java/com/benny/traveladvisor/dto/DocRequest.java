package com.benny.traveladvisor.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

/**
 * Description: DTO class of Travel Advisor request
 * @author benny.li
 * Date: 2020/5/18
 */
@Data
@NoArgsConstructor
@Accessors(chain = true)
@JsonPropertyOrder(value = {"FromCountryCode", "ToCountryCode", "DocType", "DocGroup"})
@ApiModel(value = "Document Request")
public class DocRequest implements Serializable {

    private static final long serialVersionUID = 4461662726019909815L;

    @JsonProperty("FromCountryCode")
    @NotBlank(message = "fromCountryCode cannot be empty.")
    @ApiModelProperty(value = "Travel from which country", required = true)
    private String fromCountryCode;

    @JsonProperty("ToCountryCode")
    @NotBlank(message = "toCountryCode cannot be empty.")
    @ApiModelProperty(value = "Travel to which country", required = true)
    private String toCountryCode;

    @JsonProperty("DocType")
    @NotBlank(message = "docType cannot be empty")
    @ApiModelProperty(value = "The document type that you are holding", required = true)
    private String docType;

    @JsonProperty("DocGroup")
    @NotBlank(message = "docGroup cannot be empty")
    @ApiModelProperty(value = "The document group of your document", required = true)
    private String docGroup;
}
