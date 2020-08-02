package com.niit.dao;
import java.util.List;

import com.niit.model.Supplier;

public interface SupplierDAO 
{ public boolean addSupplier(Supplier supplier);
  public boolean updateSupplier(Supplier supplier);
  public boolean deleteSupplier(Supplier supplier);
  public Supplier getSupplierId(int supplierId);
  public List<Supplier> listSupplier();

}
