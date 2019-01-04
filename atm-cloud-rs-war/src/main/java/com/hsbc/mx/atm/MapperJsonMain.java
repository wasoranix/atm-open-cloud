package com.hsbc.mx.atm;

import java.io.File;
import java.io.IOException;

import com.hsbc.mx.atm.model.openbanking.OpenBankingAtmResponse;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * <p>
 * <b> Configuration class. </b>
 * </p>
 */
public class MapperJsonMain {


    /**
     * Main class to run in local environment. uncomment to run in local
     *
     * @param args
     *            .
     * @throws IOException
     * @throws JsonMappingException
     * @throws JsonParseException
     */
    public static void main(final String[] args) throws JsonParseException, JsonMappingException, IOException {
        final ObjectMapper mapper = new ObjectMapper();

        final OpenBankingAtmResponse obj = mapper.readValue(
            new File(
                "C:\\sandbox\\workspaceTEMP\\atm-cloud-rs-war\\src\\main\\resources\\json-samples\\open-banking-atm-response.json"),
            OpenBankingAtmResponse.class);

        System.out.println("object:: " + obj);

    }


}
