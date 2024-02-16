package org.example.dao.impl;

import org.example.dao.SQLUtil;
import org.example.dao.custom.StudentDAO;
import org.example.entity.Student;

import java.sql.SQLException;

public class StudentDAOImpl implements StudentDAO {
    @Override
    public boolean save(Student entity) throws SQLException {
        return SQLUtil.execute("Insert INTO student(studentId,name,address) VALUES(?,?,?)",
                entity.getId(),entity.getName(),entity.getAddress());
    }
}
