package edu.cmu.photogenome.dao;

import java.util.List;

import org.hibernate.criterion.Restrictions;

import edu.cmu.photogenome.domain.RegionCoordinate;

public class RegionCoordinateDaoImpl extends GenericAbstractDaoImpl<RegionCoordinate, Integer> implements RegionCoordinateDao {

	@SuppressWarnings("unchecked")
	public List<RegionCoordinate> findByRegionId(int regionId) {
		List<RegionCoordinate> list = null;
		try {
			session.beginTransaction();
			list = (List<RegionCoordinate>) session.createCriteria(type).add(Restrictions.eq("regionId", regionId)).list();
			session.getTransaction().commit();
		}
		catch(Exception e) {
			session.getTransaction().rollback();
			log.warn(e.getMessage(), e);
		}
		
		return list;
	}
}
