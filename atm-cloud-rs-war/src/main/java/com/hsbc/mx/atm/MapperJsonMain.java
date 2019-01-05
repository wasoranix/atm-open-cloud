package com.hsbc.mx.atm;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.StringUtils;

import com.hsbc.mx.atm.model.ATMInternal;
import com.hsbc.mx.atm.model.openbanking.ATM;
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
     * @throws URISyntaxException
     */
    public static void main(final String[] args) throws JsonParseException, JsonMappingException, IOException, URISyntaxException {
        final ObjectMapper mapper = new ObjectMapper();


        final OpenBankingAtmResponse obj = mapper
            .readValue(new File(ClassLoader.getSystemResource("json-samples/MX.json").getFile()), OpenBankingAtmResponse.class);


        final List<ATMInternal> atms = new ArrayList<>();

        final ATM[] atmsResp = obj.getData()[0].getBrand()[0].getAtms();

        for (int i = 0; i < atmsResp.length; i++) {
            final ATM atmR = atmsResp[i];
            final ATMInternal atm = new ATMInternal();
            atm.setAddressLine(join(atmR.getLocation().getPostalAddress().getAddressLine()));
            atm.setBranch(atmR.getBranch().getIdentification());
            atm.setBuildingNumber(atmR.getLocation().getPostalAddress().getBuildingNumber());
            atm.setCountry(atmR.getLocation().getPostalAddress().getCountry());
            atm.setCountrySubDivision(join(atmR.getLocation().getPostalAddress().getCountrySubDivision()));
            atm.setCurrencies(join(atmR.getSupportedCurrencies()));
            atm.setId(atmR.getIdentification());
            atm.setLanguages(join(atmR.getSupportedLanguages()));
            atm.setLatitude(atmR.getLocation().getPostalAddress().getGeoLocation().getGeographicCoordinates().getLatitude());
            atm.setLocationSite(atmR.getLocation().getSite().getName());
            atm.setLongitude(atmR.getLocation().getPostalAddress().getGeoLocation().getGeographicCoordinates().getLongitude());
            atm.setPostCode(atmR.getLocation().getPostalAddress().getPostCode());
            atm.setStreetName(atmR.getLocation().getPostalAddress().getStreetName());
            atm.setTownName(atmR.getLocation().getPostalAddress().getTownName());
            atms.add(atm);
        }


        mapper.writeValue(new File("c:\\tmp\\atms.json"), atms);
        System.out.println(atms);

    }

    private static String join(final String[] objs) {
        return StringUtils.join(objs, ",");
    }


}
