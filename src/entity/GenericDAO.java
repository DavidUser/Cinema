package entity;

import java.lang.reflect.ParameterizedType;
import javax.persistence.EntityManager;
import java.util.Collection;

//TODO implements all
/* CRUD */
public class GenericDAO<PrimaryKey, EntityT> {

	private EntityManager entityManager;	

	public GenericDAO(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	public void create(EntityT entity) {
		entityManager.persist(entity);
	}

	public EntityT read(PrimaryKey key) {
		Class<?> persistClassType = (Class<?>) ((ParameterizedType) this.getClass()
                .getGenericSuperclass()).getActualTypeArguments()[1];
		return (EntityT) entityManager.find(persistClassType, key);
	}

	public Collection<EntityT> readAll() {
		//TODO implements without HQL (hard coded SQL)
		return entityManager.createQuery("FROM " + getTypeClass().getName()).getResultList();
	}

	private Class<?> getTypeClass() {
		return (Class<?>) ((ParameterizedType) this.getClass()
			.getGenericSuperclass()).getActualTypeArguments()[1];
    	}	

	public void update(EntityT entity) {
		entityManager.merge(entity);
	}

	public void delete(EntityT entity) {
		entityManager.remove(entity);
	}
}
