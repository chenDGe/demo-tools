package com.crm.dao;

import com.crm.entity.CodeLibrary;
import com.crm.entity.CodeLibraryExample;
import com.crm.entity.CodeLibraryKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CodeLibraryMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table code_library
     *
     * @mbg.generated
     */
    long countByExample(CodeLibraryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table code_library
     *
     * @mbg.generated
     */
    int deleteByExample(CodeLibraryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table code_library
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(CodeLibraryKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table code_library
     *
     * @mbg.generated
     */
    int insert(CodeLibrary record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table code_library
     *
     * @mbg.generated
     */
    int insertSelective(CodeLibrary record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table code_library
     *
     * @mbg.generated
     */
    List<CodeLibrary> selectByExample(CodeLibraryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table code_library
     *
     * @mbg.generated
     */
    CodeLibrary selectByPrimaryKey(CodeLibraryKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table code_library
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") CodeLibrary record, @Param("example") CodeLibraryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table code_library
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") CodeLibrary record, @Param("example") CodeLibraryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table code_library
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(CodeLibrary record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table code_library
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(CodeLibrary record);
}