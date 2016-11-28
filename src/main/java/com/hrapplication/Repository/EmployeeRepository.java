package com.hrapplication.Repository;

import com.hrapplication.Model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by zacharywasserman on 11/28/16.
 */

@Transactional
//@RepositoryRestResource(collectionResourceRel = " ", path = " ")
public interface EmployeeRepository extends JpaRepository<Employee, Integer>
{

}
