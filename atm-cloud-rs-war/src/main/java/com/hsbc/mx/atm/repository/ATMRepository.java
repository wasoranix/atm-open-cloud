package com.hsbc.mx.atm.repository;

import java.util.Map;

import javax.annotation.Resource;
import org.springframework.transaction.annotation.Transactional;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.stereotype.Repository;

/**
 * ATMRepository.
 *
 */
@Repository("ATMRepository")
public class ATMRepository extends AtmBaseRepository {


    /**
     * <p>
     * <b> LOGGER. </b>
     * </p>
     */
    private static final Logger LOGGER = LogManager.getLogger(ATMRepository.class);

    /**
     * <p>
     * <b> SQL_MARK_IN_TW_CUENTAS. </b>
     * </p>
     */
    public static final String SQL_FIND_NEAR_ATM = "SQL_FIND_NEAR_ATM";


    /**
     * <p>
     * <b> queryMapTwCuentas. </b>
     * </p>
     */
    private static final String QUERY_MAP = "queryMapATM";


    /**
     * <p>
     * <b> queryMapTwCuentas. </b>
     * </p>
     */
    private static final String ID_ATM = "ID_ATM";


    /**
     * @param queryMap
     *            the queryMap to set.
     */
    @Resource(name = ATMRepository.QUERY_MAP)
    public void setQueryMap(final Map<String, String> queryMap) {
        super.queryMap = queryMap;
    }


    /**
     * <p>
     * <b> findIdNearAtm. Execute query for getting a ATM </b>
     * </p>
     *
     * @param idAtmSource
     *            .
     * @return .
     */
    @Transactional(readOnly = true)
    public String findIdNearAtm(final String idAtmSource) {
        ATMRepository.LOGGER.info("Looking for NEXT ATM for ATM : {}", idAtmSource);

        final MapSqlParameterSource map = new MapSqlParameterSource();

        map.addValue(ATMRepository.ID_ATM, idAtmSource);

        return getNamedParameterJdbcTemplate().queryForObject(getQueryByName(ATMRepository.SQL_FIND_NEAR_ATM), map, String.class);

    }


}
