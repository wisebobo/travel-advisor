package com.benny.traveladvisor.common.schedule;

import com.benny.traveladvisor.common.enums.CacheEnums;
import com.benny.traveladvisor.dto.ParamResponse;
import com.benny.traveladvisor.service.TravelAdvisorService;
import com.benny.traveladvisor.service.ResourceService;
import com.benny.traveladvisor.timatic3.dto.ParameterType;
import com.google.common.base.Strings;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * This is the class of scheduling a task
 *
 * @author benny.li
 * @data 2020/5/13
 */
@Slf4j
@Component
public class ScheduleTasks {

    @Autowired
    private ResourceService resourceService;
    @Autowired
    private TravelAdvisorService travelAdvisorService;
    @Value("${advisor.priority.countries}")
    private String countryList;

    /**
     * Description: Refresh the country list in cache every 24 hours
     * @author benny.li
     * Date: 2020/5/18
     */
    @Scheduled(fixedRate = 1000 * 60 * 60 * 24)
    public void cacheCountryList() {
        resourceService.delCountry();
        resourceService.getCountry();
    }

    /**
     * Description: Refresh the document type in cache every 24 hours
     * @author benny.li
     * Date: 2020/5/18
     */
    @Scheduled(fixedRate = 1000 * 60 * 60 * 24)
    public void cacheDocType() {
        resourceService.delDocType();
        resourceService.getDocType();
    }

    /**
     * Description: Refresh the document group in cache every 24 hours
     * @author benny.li
     * Date: 2020/5/18
     */
    @Scheduled(fixedRate = 1000 * 60 * 60 * 24)
    public void cacheDocGroup() {
        resourceService.delDocGroup();
        resourceService.getDocGroup();
    }

    /**
     * Description: Cache the travel advisor every 12 hours
     *              If user has defined the countryList, it will cache the given list only.
     *              Otherwise, it will loop for all countries.
     * @author benny.li
     * Date: 2020/5/18
     */
//    @Scheduled(cron = "0 30 * * * *")
    @Scheduled(fixedRate = 1000 * 60 * 60 * 12)
    public void cacheTravelAdvisorByCountries() {
        //
        if (Strings.isNullOrEmpty(countryList)) {
            List<ParamResponse.Param> countries = resourceService.getParam(ParameterType.COUNTRY, CacheEnums.COUNTRY).getParams();
            for (ParamResponse.Param fromCountry : countries) {
                String fromCountryCode = fromCountry.getCode();
                for (ParamResponse.Param toCountry : countries ) {
                    String toCountryCode = toCountry.getCode();
                    if (!fromCountryCode.equals(toCountryCode)) {
                        travelAdvisorService.callDocService(fromCountryCode, toCountryCode);
                    }
                }
            }
        } else {
            String[] countryArray = countryList.split(",");
            for (String fromCountry : countryArray) {
                for (String toCountry : countryArray) {
                   if (!fromCountry.equals(toCountry)) {
                       travelAdvisorService.callDocService(fromCountry, toCountry);
                   }
                }
            }
        }
    }
}
