package com.boa.api.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.boa.api.domain.MVTC16;

import org.springframework.jdbc.core.RowMapper;

/**
 * MVTC16RowMapper
 */
public class MVTC16RowMapper implements RowMapper<MVTC16> {

    @Override
    public MVTC16 mapRow(ResultSet rs, int rowNum) throws SQLException {
        MVTC16 mvtc16 = new MVTC16();
        mvtc16.setCodopsc(rs.getString("codopsc"));
        mvtc16.setCompte(rs.getString("compte"));
        mvtc16.setDatech(rs.getDate("datech"));
        mvtc16.setDathgen(rs.getDate("dathgen"));
        mvtc16.setDatoper(rs.getDate("datoper"));
        mvtc16.setDatval(rs.getDate("datval"));
        mvtc16.setExpl(rs.getString("expl"));
        mvtc16.setLibelle(rs.getString("libelle"));
        mvtc16.setMntdev(rs.getDouble("mntdev"));
        mvtc16.setNatop(rs.getString("natop"));
        mvtc16.setNooper(rs.getString("nooper"));
        mvtc16.setNoref(rs.getString("noref"));
        mvtc16.setRefrel(rs.getString("refrel"));
        mvtc16.setXcash(rs.getBoolean("xcash"));
        return mvtc16;
    }

    
}