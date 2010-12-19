package org.hob.beekeeper.repository;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.hob.beekeeper.system.User;

/**
 * User repository implementation based on JPA.
 * @author hoborg
 */
@Stateless
public class JPAUserRepository implements UserRepository
{
  @PersistenceContext(unitName = "beekeeper")
  private EntityManager em;
  
  @Override
  public User getForName(String name)
  {
	CriteriaBuilder queryBuilder = em.getCriteriaBuilder();
	CriteriaQuery<User> cq = queryBuilder.createQuery(User.class);
	Root<User> root = cq.from(User.class);
	Predicate condition = queryBuilder.equal(root.get(User.ORM_COLUMN_NAME), name);
	cq.where(condition);
	TypedQuery<User> typedQuery = em.createQuery(cq);
	typedQuery.setMaxResults(1);
	List<User> results = typedQuery.getResultList();
	if (results.isEmpty())
	{
	  throw new IllegalStateException("Could not find user with username " + name + " in data source.");
	}
	return results.get(0);
  }

  @Override
  public User getForId(Long id)
  {
	return em.find(User.class, id);
  }

}
