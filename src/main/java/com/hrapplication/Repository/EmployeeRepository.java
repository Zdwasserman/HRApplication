package com.hrapplication.Repository;

import com.hrapplication.Model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by zacharywasserman on 11/28/16.
 */

@Transactional
@RepositoryRestResource(collectionResourceRel = "empolyees", path = "hrApp")
public interface EmployeeRepository extends JpaRepository<Employee, Integer>
{
    List<Employee> findById(@Param("id")int id);
}
