package com.frankmoley.lil.data.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;
import java.util.UUID;

public class ServiceDao implements DAO<Service, UUID> {
  private List<Service> processResultSet(ResultSet rs) throws SQLException {
    List<Service> services = new ArrayList<>();
    while(rs.next()) {
      Service service = new Service();
      service.setServiceId((UUID) rs.getObject("service_id"));
      service.setName(rs.getString("name"));
      service.setPrice(rs.getBigDecimal("price"));
      services.add(service);
    }
    return services;
  }
}
