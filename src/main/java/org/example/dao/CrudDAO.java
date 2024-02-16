package org.example.dao;

import java.sql.SQLException;

public interface CrudDAO <T> extends SuperDAO{
    boolean save(T DTO) throws SQLException;
}
