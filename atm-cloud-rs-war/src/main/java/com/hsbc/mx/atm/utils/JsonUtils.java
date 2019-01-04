
package com.hsbc.mx.atm.utils;

import java.io.IOException;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.hsbc.mx.atm.service.exception.ServiceException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * <p>
 * <b> JsonUtils. </b>
 * </p>
 */
public final class JsonUtils {

    /**
     * <p>
     * <b> Objeto de referencia para log. </b>
     * </p>
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(JsonUtils.class);

    /**
     * <p>
     * <b> MAPPER. </b>
     * </p>
     */
    private static final ObjectMapper MAPPER = new ObjectMapper();

    static {
        JsonUtils.MAPPER.enable(DeserializationFeature.USE_JAVA_ARRAY_FOR_JSON_ARRAY);
    }

    /**
     * <p>
     * <b> JsonUtils. </b>
     * </p>
     *
     */
    private JsonUtils() {
        // default constructor
    }

    /**
     * Tranform object to string.
     *
     * @param <T>
     *
     * @param claseRef
     *            the clase ref
     * @return the string
     * @throws ServiceException
     *             the service exception
     */
    public static final <T> String tranformObjectToString(final T claseRef) throws ServiceException {
        try {
            return JsonUtils.MAPPER.writeValueAsString(claseRef);
        } catch (JsonProcessingException err) {
            JsonUtils.LOGGER.error(err.getMessage(), err);
            throw new ServiceException(err.getMessage(), err);
        }
    }


    /**
     * Tranform string to objet.
     *
     * @param <T>
     *
     * @param objJsonString
     *            the obj json string
     * @param claseRef
     *            the clase ref
     * @return the t
     * @throws ServiceException
     *             the service exception
     */
    public static final <T> T tranformStringToObjet(final String objJsonString, final Class<T> claseRef) throws ServiceException {
        try {
            return JsonUtils.MAPPER.readValue(objJsonString, claseRef);
        } catch (JsonParseException err) {
            JsonUtils.LOGGER.error(err.getMessage(), err);
            throw new ServiceException(err.getMessage(), err);
        } catch (JsonMappingException err) {
            JsonUtils.LOGGER.error(err.getMessage(), err);
            throw new ServiceException(err.getMessage(), err);
        } catch (IOException err) {
            JsonUtils.LOGGER.error(err.getMessage(), err);
            throw new ServiceException(err.getMessage(), err);
        }
    }

    /**
     * Tranform string to objet.
     *
     * @param <T>
     *
     * @param objJsonString
     *            the obj json string
     * @param claseRef
     *            the clase ref
     * @return the t
     * @throws ServiceException
     *             the service exception
     */
    public static final <T> T tranformStringToObjet(final String objJsonString, final TypeReference<T> typeReference)
        throws ServiceException {
        try {
            return JsonUtils.MAPPER.readValue(objJsonString, typeReference);
        } catch (JsonParseException err) {
            JsonUtils.LOGGER.error(err.getMessage(), err);
            throw new ServiceException(err.getMessage(), err);
        } catch (JsonMappingException err) {
            JsonUtils.LOGGER.error(err.getMessage(), err);
            throw new ServiceException(err.getMessage(), err);
        } catch (IOException err) {
            JsonUtils.LOGGER.error(err.getMessage(), err);
            throw new ServiceException(err.getMessage(), err);
        }
    }

    /**
     * <p>
     * <b> tranformStringToObjet. </b>
     * </p>
     *
     * @param objJsonString
     *            .
     * @return .
     * @throws ServiceException
     *             .
     */
    public static final Map<String, String> tranformStringToObjet(final String objJsonString) throws ServiceException {
        try {
            return JsonUtils.MAPPER.readValue(objJsonString, new TypeReference<Map<String, String>>() {});
        } catch (JsonParseException err) {
            JsonUtils.LOGGER.error(err.getMessage(), err);
            throw new ServiceException(err.getMessage(), err);
        } catch (JsonMappingException err) {
            JsonUtils.LOGGER.error(err.getMessage(), err);
            throw new ServiceException(err.getMessage(), err);
        } catch (IOException err) {
            JsonUtils.LOGGER.error(err.getMessage(), err);
            throw new ServiceException(err.getMessage(), err);
        }
    }

}
