package com.benny.traveladvisor.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.List;

/**
 * Description: DTO class of resources/parameters response
 * @author benny.li
 * Date: 2020/5/18
 */
@Data
@NoArgsConstructor
@Accessors(chain = true)
@ApiModel(value = "Parameter Response")
public class ParamResponse implements Serializable {

    private static final long serialVersionUID = -8323601642368289983L;

    @JsonProperty("Parameters")
    @ApiModelProperty(value = "List of Parameters")
    private List<Param> params;

    @Data
    @NoArgsConstructor
    @Accessors(chain = true)
    @JsonPropertyOrder({"Code", "Name"})
    public static class Param implements Serializable {
        private static final long serialVersionUID = -5294986978609977136L;
        @JsonProperty("Code")
        @ApiModelProperty(value = "Parameter Code", position = 1)
        private String Code;

        @JsonProperty("Name")
        @ApiModelProperty(value = "Parameter Name", position = 2)
        private String Name;
    }
}
