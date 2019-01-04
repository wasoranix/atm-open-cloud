
package com.hsbc.mx.atm.utils;

import java.io.File;
import java.util.Comparator;

import org.apache.commons.io.FilenameUtils;
import org.apache.commons.lang.StringUtils;

/**
 * <p>
 * <b> TODO : Insert description of the class's responsibility/role. </b>
 * </p>
 */
public class SortByFileName implements Comparator<File> {

    /*
     * (non-Javadoc)
     *
     * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
     */
    public int compare(final File fa, final File fb) {
        return getFileIndexName(fa.getName()) - getFileIndexName(fb.getName());

    }


    /**
     * <p>
     * <b> getFileIndexName. </b>
     * </p>
     *
     * @param fileNameWOExt
     *            .
     * @return .
     */
    private int getFileIndexName(final String fileNameWOExt) {
        return Integer.valueOf(StringUtils.split(FilenameUtils.removeExtension(fileNameWOExt), "_")[1]);
    }

}
