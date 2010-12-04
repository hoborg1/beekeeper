package org.hob.beekeeper.repository;

import java.util.Collection;

import org.hob.beekeeper.apiary.Apiary;
import org.hob.beekeeper.domain.hive.Hive;

public interface HiveRepository
{
  Collection<Hive> getForApiary(Apiary apiary);
}
