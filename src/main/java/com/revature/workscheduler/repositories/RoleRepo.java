package com.revature.workscheduler.repositories;

import com.revature.workscheduler.models.Role;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepo extends CrudRepository<Role, Integer>
{

}
