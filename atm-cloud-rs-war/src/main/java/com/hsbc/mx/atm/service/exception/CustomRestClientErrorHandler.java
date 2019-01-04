
package com.hsbc.mx.atm.service.exception;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.web.client.ResponseErrorHandler;

/**
 * <p>
 * <b> TODO : Insert description of the class's responsibility/role. </b>
 * </p>
 */
public class CustomRestClientErrorHandler implements ResponseErrorHandler {

    /**
     * LOGGER.
     */
    private static final Logger LOG = LoggerFactory.getLogger(CustomRestClientErrorHandler.class);

    /*
     * (non-Javadoc)
     *
     * @see org.springframework.web.client.ResponseErrorHandler#hasError(org.
     * springframework.http.client.ClientHttpResponse)
     */
    public boolean hasError(final ClientHttpResponse response) throws IOException {
        return isError(response.getStatusCode());
    }

    /*
     * (non-Javadoc)
     *
     * @see
     * org.springframework.web.client.ResponseErrorHandler#handleError(org.
     * springframework.http.client.ClientHttpResponse)
     */
    public void handleError(final ClientHttpResponse response) throws IOException {
        CustomRestClientErrorHandler.LOG.error("Response error: {} {}", response.getStatusCode(), response.getStatusText());


    }


    /**
     * <p>
     * <b> validamos si hay error. </b>
     * </p>
     *
     * @param status
     * @return
     */
    private boolean isError(final HttpStatus status) {
        HttpStatus.Series series = status.series();
        return (HttpStatus.Series.CLIENT_ERROR.equals(series) || HttpStatus.Series.SERVER_ERROR.equals(series));
    }
}
