package org.example.bo.custom.impl;

import org.example.bo.SuperBO;
import org.example.bo.custom.StudentBO;
import org.example.dao.DAOFactory;
import org.example.dao.custom.StudentDAO;
import org.example.dto.StudentDto;
import org.example.entity.Student;

import java.sql.SQLException;

public class StudentBOImpl implements StudentBO, SuperBO {
    StudentDAO studentDAO= (StudentDAO) DAOFactory.getDaoFactory().getDAO(DAOFactory.DAOTypes.STUDENT);


    @Override
    public boolean saveSTUDENT(StudentDto dto) throws SQLException {
        return studentDAO.save(new Student(dto.getId(),dto.getName(),dto.getAddress()));
    }
}
