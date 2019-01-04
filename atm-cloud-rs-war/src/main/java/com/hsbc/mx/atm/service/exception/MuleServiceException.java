
package com.hsbc.mx.atm.service.exception;

/**
 * <p>
 * <b> FilenetServiceException. </b>
 * </p>
 */
public class MuleServiceException extends RuntimeException {

    /**
     * <p>
     * <b> serialVersionUID. </b>
     * </p>
     */
    private static final long serialVersionUID = -3704702264659422773L;

    /**
     * <p>
     * <b> FilenetServiceException. </b>
     * </p>
     *
     */
    public MuleServiceException() {
        // quiet constructor.
    }

    /**
     * <p>
     * <b> FilenetServiceException. </b>
     * </p>
     *
     * @param message
     *            .
     */
    public MuleServiceException(final String message) {
        super(message);
    }

    /**
     * <p>
     * <b> FilenetServiceException. </b>
     * </p>
     *
     * @param cause
     *            .
     */
    public MuleServiceException(final Throwable cause) {
        super(cause);
    }

    /**
     * <p>
     * <b> FilenetServiceException. </b>
     * </p>
     *
     * @param message
     *            .
     * @param cause
     *            .
     */
    public MuleServiceException(final String message, final Throwable cause) {
        super(message, cause);
    }

    /**
     * <p>
     * <b> FilenetServiceException. </b>
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
    public MuleServiceException(final String message, final Throwable cause, final boolean enableSuppression,
        final boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
