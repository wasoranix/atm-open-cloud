package com.hsbc.mx.atm.repository;

import java.util.Map;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.util.StringUtils;

import com.hsbc.mx.atm.service.exception.ServiceException;


/**
 * AtmBaseRepository.
 *
 */

public class AtmBaseRepository {

    /**
     * <p>
     * <b> LOGGER. </b>
     * </p>
     */
    private static final Logger LOGGER = LogManager.getLogger(AtmBaseRepository.class);

    /**
     * AND.
     */
    private static final String AND = " AND ";

    /**
     * <p>
     * <b> String con el valor "Query no encontrado [%1$s].". </b>
     * </p>
     */
    private static final String QRY_NOTFOUND_MSG = "Query no encontrado [%1$s].";

    /**
     * <p>
     * <b> String con el valor "getQueryName queryName=[%1$s].". </b>
     * </p>
     */
    private static final String MESSAGE_1 = "getQueryName queryName=[%1$s].";
    /**
     * <p>
     * <b> String con el valor "getQueryName query=[%1$s].". </b>
     * </p>
     */
    private static final String MESSAGE_2 = "getQueryName query=[%1$s].";


    public static final int ZERO = 0;


    @Autowired
    @Qualifier("dataSource")
    private DataSource dataSource;

    @Autowired(required = false)
    @Qualifier("schema")
    private String schema;


    @Autowired(required = false)
    @Qualifier("schemaWrapper")
    private String schemaWrapper;

    protected Map<String, String> queryMap;


    /**
     * .
     */
    @Autowired
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    /**
     * @return the namedParameterJdbcTemplate
     */
    public NamedParameterJdbcTemplate getNamedParameterJdbcTemplate() {
        return this.namedParameterJdbcTemplate;
    }

    /**
     * @param namedParameterJdbcTemplate
     *            the namedParameterJdbcTemplate to set
     */
    public void setNamedParameterJdbcTemplate(final NamedParameterJdbcTemplate namedParameterJdbcTemplate) {
        this.namedParameterJdbcTemplate = namedParameterJdbcTemplate;
    }

    /**
     * @return the and
     */
    public static String getAnd() {
        return AtmBaseRepository.AND;
    }


    @PostConstruct
    private void postConstruct() {
        this.namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(this.dataSource);
    }


    /**
     * <p>
     * <b> Metodo que obtiene el query por nombre. </b>
     * </p>
     *
     * @param queryName
     *            Nombre del query a obtener.
     * @return Query por el nombre.
     * @throws DatabaseAccessException
     *             Se lanza en caso de alguna eventualidad al obtener el query
     *             por nombre.
     */
    protected final String getQueryByName(final String queryName) {
        AtmBaseRepository.LOGGER.debug(String.format(AtmBaseRepository.MESSAGE_1, queryName));
        final String query = this.queryMap.get(queryName);
        AtmBaseRepository.LOGGER.debug(String.format(AtmBaseRepository.MESSAGE_2, query));
        if (null == query) {
            throw new ServiceException(String.format(AtmBaseRepository.QRY_NOTFOUND_MSG, queryName));
        } else {
            return StringUtils.replace(query, this.schemaWrapper, this.schema);
        }
    }


}
