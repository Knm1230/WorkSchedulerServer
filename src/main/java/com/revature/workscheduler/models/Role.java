package com.revature.workscheduler.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="roles")
public class Role
{
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="role_id", updatable = false, nullable = false, unique=true)
	private int roleID;

	@Column(name="is_manager", nullable = false)
	private boolean isManager;

	public Role()
	{
		this(false);
	}

	public Role(boolean isManager)
	{
		this(0, isManager);
	}

	public Role(int roleID, boolean isManager)
	{
		this.roleID = roleID;
		this.isManager = isManager;
	}

	public int getRoleID()
	{
		return this.roleID;
	}

	public void setRoleID(int roleID)
	{
		this.roleID = roleID;
	}

	public boolean isManager()
	{
		return this.isManager;
	}

	public void setIsManager(boolean isManager)
	{
		this.isManager = isManager;
	}
}
