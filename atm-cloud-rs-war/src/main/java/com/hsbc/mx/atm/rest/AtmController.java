
package com.hsbc.mx.atm.rest;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hsbc.mx.atm.model.openbanking.ATM;
import com.hsbc.mx.atm.service.ATMServices;


@Controller
@RequestMapping(value = AtmController.ARCHIVE)
public class AtmController {

    /**
     * LOGGER.
     */
    // private static final Logger LOG =
    // LoggerFactory.getLogger(AtmController.class);

    /** ARCHIVE */
    public static final String ARCHIVE = "/atm";

    /** UPDATE_METADATA_DOC */
    public static final String UPDATE_METADATA_DOC = "/metadataDocument";

    /** status-record **/
    public static final String UPDATE_STATUS_RECORD = "/status/record";


    @Autowired
    @Qualifier("ATMServices")
    private ATMServices aTMServices;


    /**
     * <p>
     * <b> recupera la estructura a crear en filenet. </b>
     * </p>
     *
     * @param request
     *            Objeto request;
     * @return .
     */
    @RequestMapping(value = "/version", method = RequestMethod.GET)
    public ResponseEntity<String> getKey4UploadLargeFile() {
        return new ResponseEntity<>(String.valueOf(UUID.randomUUID()), HttpStatus.OK);
    }

    @RequestMapping(value = "/find-near-atm/{id}", method = RequestMethod.GET)
    public ResponseEntity<ATM> findNearATM(@PathVariable final String id) {

        return new ResponseEntity<ATM>(this.aTMServices.findNearATM(id), HttpStatus.OK);
    }


}
