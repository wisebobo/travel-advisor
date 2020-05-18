# Travel Advisor (旅游出行助手)
An Restful API wrapper base on IATA TIMATIC AutoCheck API. 
By specifying the country (travel from/to) and your holding document, the API will return you the Passport/VISA/Health/Customs requirement/information of your destination country.

## Prerequisite
* Register your IATA TIMATIC account

## Dependencies
* SpringBoot
* Apache Commons Pool (common-pool2)
* Apache Commons IO (commons-io)
* Fastjson
* Springfox Swagger2
* Springfox Swagger UI
* Project Lombok
* Guava: Google Core Libraries For Java
* MySQL Connector/J
* MyBatis Spring Boot Starter
* Druid Spring Boot Starter

## Digital Signature
In each API call, the following header fields are required.

* X-API-APPID         (the assigned app id)
* X-API-TIMESTAMP     (unix timestamp, e.g. 1589768144)
* X-API-SIGN

To generate the “sign” parameter, Partner and Service Provider team must exchange RSA keys before making API calls, and the length of RSA key must be 2048 bits.

When making API call, partner uses the RSA private key to sign the API request. After receiving the API request, Service Provider will use the partner’s RSA public key to verify whether the signature is matched to the content of API request.

Similarly, when partner receives the API response, it is highly recommended that partner verifies the signature of API response by using Service Provider’s RSA public key.

The following illustrates the interaction flow:
1. Sign API request with partner’s RSA private key
2. Send API request

    2.1 Service Provider to verify the signature by using partner’s RSA public key
    
    2.2 Service Provider to process the request
    
    2.3 Service Provider to sign the API response by using Service Provider’s RSA private key

    2.4 Send API response to client
3. Partner to verify API response by using Service Provider’s RSA public key

***
##### For POST & PUT request
***
The parameters used to compute the signature vary from one interface to another, but the algorithm is fixed in below 5 steps.
```json
{
  "FromCountryCode": "CN",
  "ToCountryCode": "JP",
  "DocType": "passport",
  "DocGroup": "N"
}
```

1. Remove all leading & trailing space, tap and line break of the signed content, result as below:
    ```json
    {"FromCountryCode":"CN","ToCountryCode":"JP","DocType":"passport","DocGroup":"N"}
    ```
2. Concatenate APPID, Timestamp, URI, trimmed json string into a new string
3. Hash the concatenated content by using the SHA256withRSA algorithm. Then use the partner's RSA private key to sign the value to obtain the signature. To achieve a better security level, the length of the RSA key/pairs must be 2048 bits.
4. Base64-encode the signature.
5. Use the obtained string as the value of the "sign" parameter.

***
##### For GET & DELETE request
***
1. The <key, value> request parameters are sorted in ascending order by key (except the "sign" key itself), and the ordered parameter pair list N is obtained.
2. The parameters in the list N are spliced into a string according to the format of the URL key pair, and the string T (such as: key1=value1&key2=value2) is obtained.
3. Concatenate APPID, Timestamp, URI, string T obtain from step 2
4. Hash the concatenated content by using the SHA256withRSA algorithm. Then use the partner's RSA private key to sign the value to obtain the signature. To achieve a better security level, the length of the RSA key/pairs must be 2048 bits.
5. Base64-encode the signature.
6. Use the obtained string as the value of the "sign" parameter.

## Environment
* CentOS / Windows
* JDK 1.8
* Redis
* MySQL

## Useful URLs
* http://127.0.0.1:8080/swagger-ui.html
* http://127.0.0.1:8080/druid/index.html
* http://127.0.0.1:8080/actuator

## Reference
* TIMATIC AutoCheck XML Application Interface Specification v3.3