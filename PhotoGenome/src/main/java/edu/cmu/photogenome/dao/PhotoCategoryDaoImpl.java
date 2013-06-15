package edu.cmu.photogenome.dao;

import java.util.List;

import org.hibernate.criterion.Restrictions;

import edu.cmu.photogenome.domain.PhotoCategory;

public class PhotoCategoryDaoImpl extends GenericAbstractDaoImpl<PhotoCategory, Integer> implements PhotoCategoryDao {

	@SuppressWarnings("unchecked")
	public List<PhotoCategory> findByPhotoId(int photoId) {
		List<PhotoCategory> list = null;
		try {
			session.beginTransaction();
			list = (List<PhotoCategory>) session.createCriteria(type).add(Restrictions.eq("photoId", photoId)).list();
			session.getTransaction().commit();
		}
		catch(Exception e) {
			session.getTransaction().rollback();
			log.warn(e.getMessage(), e);
		}
		
		return list;
	}
}
