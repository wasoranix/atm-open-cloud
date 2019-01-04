
package com.hsbc.mx.atm.service.exception;

/**
 * <p>
 * <b> ServiceException. </b>
 * </p>
 */
public class ServiceException extends RuntimeException {

    /** serialVersionUID */
    private static final long serialVersionUID = 8603036257082283698L;

    /**
     * <p>
     * <b> ServiceException. </b>
     * </p>
     *
     */
    public ServiceException() {
        // Default constructor
    }

    /**
     * <p>
     * <b> ServiceException. </b>
     * </p>
     *
     * @param message
     *            .
     */
    public ServiceException(final String message) {
        super(message);
    }

    /**
     * <p>
     * <b> ServiceException. </b>
     * </p>
     *
     * @param cause
     *            .
     */
    public ServiceException(final Throwable cause) {
        super(cause);
    }

    /**
     * <p>
     * <b> ServiceException. </b>
     * </p>
     *
     * @param message
     *            .
     * @param cause
     *            .
     */
    public ServiceException(final String message, final Throwable cause) {
        super(message, cause);
    }

    /**
     * <p>
     * <b> ServiceException. </b>
     * </p>
     *
     * @param message
     *            .
     * @param cause
     *            .
     * @param enableSuppression
     *            .
     * @param writableStackTrace
     *            .
     */
    public ServiceException(final String message, final Throwable cause, final boolean enableSuppression,
        final boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
