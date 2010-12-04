package org.hob.beekeeper.repository;

import org.hob.beekeeper.apiary.Apiary;

public interface ApiaryRepository
{
  Apiary get(Long id);
  Apiary getForPersonApiaryRole(Long roleId);
}
