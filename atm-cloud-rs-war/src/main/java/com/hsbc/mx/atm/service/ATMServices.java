
package com.hsbc.mx.atm.service;

import com.hsbc.mx.atm.model.openbanking.ATM;

/**
 * <p>
 * <b> ATMServices. </b>
 * </p>
 */
public interface ATMServices {


    /**
     * <p>
     * <b> findNearATM. Recive Identificacion Key for ATM and retrieve the
     * nearest ATM. based og Geolocalization </b>
     * </p>
     *
     * @param identification
     * @return
     */
    ATM findNearATM(final String identification);


}
