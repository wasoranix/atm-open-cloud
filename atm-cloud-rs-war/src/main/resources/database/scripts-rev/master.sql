REM *****************************************************************************************************

SPOOL SCRIPTS_REV.log

ALTER SESSION SET NLS_DATE_FORMAT='DD-MM-YYYY';
--CREATE_REPORTS_DMP_REVERSO 
@alters-rev.sql;

SPOOL off

REM **************************************** END OF FILE ************************************************