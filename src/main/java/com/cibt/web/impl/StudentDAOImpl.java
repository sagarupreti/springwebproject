/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cibt.web.impl;

import com.cibt.web.dao.StudentDAO;
import com.cibt.web.entity.Student;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

/**
 *
 * @author ideapad-520S
 */
@Repository(value = "studentDAO")
public class StudentDAOImpl implements StudentDAO{
    @Autowired
    private JdbcTemplate JdbcTemplate;
    @Override
    public List<Student> getAll() {
        return JdbcTemplate
                .query("select * from students",
                        new RowMapper<Student>() {

            @Override
            public Student mapRow(ResultSet rs, int i) throws SQLException {
                Student student=new Student();
                student.setId(rs.getInt("id"));
                student.setFirstName(rs.getString("first_name"));
                student.setLastName(rs.getString("last_name"));
                student.setEmail(rs.getString("email"));
                student.setContactNo(rs.getString("contact_no"));
                student.setStatus(rs.getBoolean("status"));
                return student;
            }
        });
        
    }
    
}
