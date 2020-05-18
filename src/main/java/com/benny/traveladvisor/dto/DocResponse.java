package com.benny.traveladvisor.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
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
 * Description: DTO class of Travel Advisor response
 * @author benny.li
 * Date: 2020/5/18
 */
@Data
@NoArgsConstructor
@Accessors(chain = true)
@JsonPropertyOrder(value = {"FromCountryCode", "ToCountryCode", "DocType", "Passport", "VISA", "Health", "Customs"})
@ApiModel(value = "Document Response")
public class DocResponse implements Serializable {
    private static final long serialVersionUID = 4862974119545067485L;

    @JsonProperty("FromCountryCode")
    @ApiModelProperty(value = "Travel from which country", position = 1)
    private String fromCountryCode;

    @JsonProperty("ToCountryCode")
    @ApiModelProperty(value = "Travel to which country", position = 2)
    private String toCountryCode;

    @JsonProperty("DocType")
    @ApiModelProperty(value = "Document Type", position = 3)
    private String docType;

    @JsonProperty("Passport")
    @ApiModelProperty(value = "Passport requirement/information", position = 4)
    private Section passport;

    @JsonProperty("VISA")
    @ApiModelProperty(value = "Visa requirement/information", position = 5)
    private Section visa;

    @JsonProperty("Health")
    @ApiModelProperty(value = "Health requirement/information", position = 6)
    private Section health;

    @JsonProperty("Customs")
    @ApiModelProperty(value = "Customs requirement/information", position = 7)
    private Section customs;

    @Data
    @NoArgsConstructor
    @Accessors(chain = true)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonPropertyOrder(value = {"Requirement", "Sections"})
    public static class Section implements Serializable {
        private static final long serialVersionUID = -8626132869012188620L;

        @JsonProperty("Requirement")
        private String requirement;

        @JsonProperty("Sections")
        @JsonInclude(JsonInclude.Include.NON_NULL)
        private List<SubSection> sections;
    }

    @Data
    @NoArgsConstructor
    @Accessors(chain = true)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonPropertyOrder(value = {"SectionName", "SectionMsgs"})
    public static class SubSection implements Serializable {
        private static final long serialVersionUID = -7829729524242224357L;

        @JsonProperty("SectionName")
        private String sectionName;

        @JsonProperty("SectionMsgs")
        private List<Message> sectionMsgs;
    }

    @Data
    @NoArgsConstructor
    @Accessors(chain = true)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonPropertyOrder(value = {"MessageType", "MessageContent"})
    public static class Message implements Serializable {
        private static final long serialVersionUID = -7736774104412668175L;

        @JsonProperty("MessageType")
        private String messageType;

        @JsonProperty("MessageContent")
        private List<String> messageContent;
    }
}
