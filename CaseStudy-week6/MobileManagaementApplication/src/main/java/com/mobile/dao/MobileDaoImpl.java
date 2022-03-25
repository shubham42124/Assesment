package com.mobile.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.mobile.entity.Mobile;


@Repository
public class MobileDaoImpl implements MobileDao {

	@PersistenceContext
	EntityManager entity;
	@Override
	public Mobile addmobile(Mobile mobile) {
		// TODO Auto-generated method stub
		entity.persist(mobile);
		return entity.find(Mobile.class,mobile.getMobileId());
	}

	@Override
	public Mobile updatemobile(Mobile mobile) {
		// TODO Auto-generated method stub
	return	entity.merge(mobile);
		
	}

	@Override
	public String deletemobile(int mobileId) {
		// TODO Auto-generated method stub
	Mobile mb=	entity.find(Mobile.class,mobileId);
	if(mb!=null) {
		entity.remove(mb);
		return "deleted";
	}
	else {
		return "not deleted";
	}
}
	@Override
	public Mobile getmobile(int mobileId) {
		// TODO Auto-generated method stub
		return entity.find(Mobile.class,mobileId);
	}

	@Override
	public List<Mobile> getAllmobiles() {
		// TODO Auto-generated method stub
		TypedQuery<Mobile> result = entity.createQuery("select e from Mobile e", Mobile.class);
		return result.getResultList();
	}

}
