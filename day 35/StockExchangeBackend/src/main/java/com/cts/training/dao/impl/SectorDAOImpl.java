package com.cts.training.dao.impl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cts.training.dao.SectorDAO;
import com.cts.training.model.SectorEntity;

@Transactional
@Repository(value = "sectorDAO")
public class SectorDAOImpl implements SectorDAO {

	@Autowired
	SessionFactory sessionFactory;
	@Override
	public boolean addSector(SectorEntity sector) {
		try {
			sessionFactory.getCurrentSession().save(sector);
			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean updateSector(SectorEntity sector) {
		try {
			sessionFactory.getCurrentSession().update(sector);
			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean deleteSector(SectorEntity sector) {
		try {
			sessionFactory.getCurrentSession().delete(sector);
			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public SectorEntity getSectorById(int id) {
		try {
			return sessionFactory.getCurrentSession().get(SectorEntity.class, id);
		} catch (HibernateException e) {
			e.printStackTrace();
			return null;
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<SectorEntity> getAllSectors() {
		try {
			return sessionFactory.getCurrentSession().createQuery("FROM SectorEntity").getResultList();
		} catch (HibernateException e) {
			e.printStackTrace();
			return null;
		}
	}

}
