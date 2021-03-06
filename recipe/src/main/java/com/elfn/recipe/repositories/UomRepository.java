package com.elfn.recipe.repositories;

import com.elfn.recipe.domain.UnitOfMeasure;
import org.springframework.data.repository.CrudRepository;

/**
 * @PROJECT recipe
 * @Author Elimane on 30/06/2022
 */
public interface UomRepository extends CrudRepository<UnitOfMeasure, Long> {
}
