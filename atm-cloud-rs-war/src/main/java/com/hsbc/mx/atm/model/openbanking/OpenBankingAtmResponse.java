
package com.hsbc.mx.atm.model.openbanking;

import com.hsbc.mx.atm.model.JsonObjectBase;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * <p>
 * <b> OpenBankingAtmResponse. </b>
 * </p>
 */
@JsonAutoDetect
@JsonIgnoreProperties(ignoreUnknown = true)
public class OpenBankingAtmResponse extends JsonObjectBase {

    @JsonProperty(required = false)
    @JsonInclude(value = JsonInclude.Include.NON_EMPTY)
    private Meta meta;
    @JsonProperty(required = false)
    @JsonInclude(value = JsonInclude.Include.NON_EMPTY)
    private Data[] data;

    /**
     * @return the meta
     */
    public Meta getMeta() {
        return this.meta;
    }

    /**
     * @param meta
     *            the meta to set
     */
    public void setMeta(final Meta meta) {
        this.meta = meta;
    }

    /**
     * @return the data
     */
    public Data[] getData() {
        return this.data;
    }

    /**
     * @param data
     *            the data to set
     */
    public void setData(final Data[] data) {
        this.data = data;
    }


}
