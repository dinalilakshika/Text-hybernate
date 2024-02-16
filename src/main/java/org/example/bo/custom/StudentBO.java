package org.example.bo.custom;

import org.example.dto.StudentDto;

import java.sql.SQLException;

public interface StudentBO {

    boolean saveSTUDENT(StudentDto dto) throws SQLException;

}
