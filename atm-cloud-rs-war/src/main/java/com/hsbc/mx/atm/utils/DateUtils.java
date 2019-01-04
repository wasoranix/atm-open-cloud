
package com.hsbc.mx.atm.utils;

import java.util.Date;

import org.apache.commons.lang3.StringUtils;
import org.joda.time.LocalDate;
import org.joda.time.format.DateTimeFormat;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <p>
 * <b> DateUtils. </b>
 * </p>
 */
public final class DateUtils {

    /**
     * <p>
     * <b> Objeto de referencia para log. </b>
     * </p>
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(DateUtils.class);


    /**
     * <p>
     * <b> Formato de default para Centurias en HSBC. </b>
     * </p>
     */
    private static final String DEFAULT_HSBC_CENTURY_FORMAT = "CyyMMdd";

    /**
     * <p>
     * <b> Formato de default para Centurias en HSBC. </b>
     * </p>
     */
    private static final int DEFAULT_HSBC_LENGHT = 7;


    /**
     * <p>
     * <b> Formato de default para Centurias en HSBC. </b>
     * </p>
     */
    private static final String DEFAULT_FILLER = "0";


    /**
     * <p>
     * <b>Default Constructor. </b>
     * </p>
     *
     */
    private DateUtils() {
        super();
    }


    public static Date convertCenturyString2DAte(final String centuryDate) {

        DateUtils.LOGGER.debug("recibiendo {}", centuryDate);

        if (StringUtils.isEmpty(centuryDate)) {
            return null;
        }

        final LocalDate date = DateTimeFormat.forPattern(DateUtils.DEFAULT_HSBC_CENTURY_FORMAT)
            .parseLocalDate(StringUtils.leftPad(centuryDate, DateUtils.DEFAULT_HSBC_LENGHT, DateUtils.DEFAULT_FILLER));

        return date.toDate();
    };


}
