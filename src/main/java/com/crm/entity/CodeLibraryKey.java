package com.crm.entity;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table code_library
 *
 * @mbg.generated do_not_delete_during_merge
 */
public class CodeLibraryKey {
    /**
     * Database Column Remarks:
     *   代码编号
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column code_library.codeno
     *
     * @mbg.generated
     */
    private String codeno;

    /**
     * Database Column Remarks:
     *   代码项编号
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column code_library.itemno
     *
     * @mbg.generated
     */
    private String itemno;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column code_library.codeno
     *
     * @return the value of code_library.codeno
     *
     * @mbg.generated
     */
    public String getCodeno() {
        return codeno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column code_library.codeno
     *
     * @param codeno the value for code_library.codeno
     *
     * @mbg.generated
     */
    public void setCodeno(String codeno) {
        this.codeno = codeno == null ? null : codeno.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column code_library.itemno
     *
     * @return the value of code_library.itemno
     *
     * @mbg.generated
     */
    public String getItemno() {
        return itemno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column code_library.itemno
     *
     * @param itemno the value for code_library.itemno
     *
     * @mbg.generated
     */
    public void setItemno(String itemno) {
        this.itemno = itemno == null ? null : itemno.trim();
    }
}