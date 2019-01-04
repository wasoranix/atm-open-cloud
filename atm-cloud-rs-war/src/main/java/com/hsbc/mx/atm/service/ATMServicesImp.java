
package com.hsbc.mx.atm.service;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.hsbc.mx.atm.model.openbanking.ATM;
import com.hsbc.mx.atm.model.openbanking.OpenBankingAtmResponse;
import com.hsbc.mx.atm.service.exception.CustomRestClientErrorHandler;
import com.hsbc.mx.atm.service.exception.MuleServiceException;
import com.hsbc.mx.atm.utils.JsonUtils;

/**
 * <p>
 * <b> Services for ATM. </b>
 * </p>
 */
@Service("ATMServices")
public class ATMServicesImp implements ATMServices {

    /**
     * LOGGER.
     */
    private static final Logger LOG = LoggerFactory.getLogger(ATMServicesImp.class);


    // @Value("#{globalValuesService.loadValueByKeyFromDB('CLIENT_SERVICES_URL')}")
    // private String client_services_endpoint;
    private String services_endpoint = "https://d3v7zrvznv0t2o.cloudfront.net/x-open-banking/v1.0/atms/country/{country}";


    /*
     * (non-Javadoc)
     *
     * @see com.hsbc.mx.atm.service.ATMServices#findNearATM(java.lang.String)
     */
    public ATM findNearATM(final String identification) {
        final String response = obtainInfoFromInterface(this.services_endpoint, "MX", MediaType.APPLICATION_JSON);

        OpenBankingAtmResponse openBankingAtmResponse = JsonUtils.tranformStringToObjet(response, OpenBankingAtmResponse.class);

        return openBankingAtmResponse.getData()[0].getBrand()[0].getAtms()[0];
    }


    /**
     * <p>
     * <b> Obtain profile of cliente . </b>
     * </p>
     *
     * @param Cis
     *            of client.
     * @return Client Object.
     * @throws MuleServiceException
     *             in case of error.
     */
    public String obtainInfoFromInterface(final String url, final String json, final MediaType mediaType)
        throws MuleServiceException {
        final RestTemplate restTemplate = new RestTemplate();
        final HttpHeaders headers = new HttpHeaders();
        headers.setContentType(mediaType);

        final HttpEntity<String> entity = new HttpEntity<String>(json, headers);

        restTemplate.setErrorHandler(new CustomRestClientErrorHandler());

        final UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(url);

        final ResponseEntity<String> response =
            restTemplate.exchange(builder.buildAndExpand(json).toUri(), HttpMethod.GET, entity, String.class);

        final String responseBody = response.getBody();

        System.out.println("responseBody :::" + responseBody);

        ATMServicesImp.LOG.debug("response: {}", response);

        if (StringUtils.isEmpty(responseBody)) {
            throw new MuleServiceException("Excepcion general en el servicio de openbanking");
        }

        return responseBody;
    }


    public static void main(final String[] args) throws MuleServiceException {
        final ATMServices clientServices = new ATMServicesImp();


        clientServices.findNearATM("100300609");


    }

}
