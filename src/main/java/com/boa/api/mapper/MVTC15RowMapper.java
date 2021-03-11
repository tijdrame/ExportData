package com.boa.api.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.boa.api.domain.MVTC15;

import org.springframework.jdbc.core.RowMapper;

/**
 * mvtc15RowMapper
 */
public class MVTC15RowMapper implements RowMapper<MVTC15> {

    @Override
    public MVTC15 mapRow(ResultSet rs, int rowNum) throws SQLException {
        MVTC15 mvtc15 = new MVTC15();
        mvtc15.setCodopsc(rs.getString("codopsc"));
        mvtc15.setCompte(rs.getString("compte"));
        mvtc15.setDatoper(rs.getDate("datoper"));
        mvtc15.setDatval(rs.getDate("datval"));
        mvtc15.setExpl(rs.getString("expl"));
        mvtc15.setLibelle(rs.getString("libelle"));
        mvtc15.setMntdev(rs.getDouble("mntdev"));
        mvtc15.setNatop(rs.getString("natop"));
        mvtc15.setNooper(rs.getString("nooper"));
        mvtc15.setRefrel(rs.getString("refrel"));
        return mvtc15;
    }

    
}