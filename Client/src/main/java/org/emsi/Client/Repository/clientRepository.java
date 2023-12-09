package org.emsi.Client.Repository;

import org.emsi.Client.Model.client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface clientRepository extends JpaRepository<client,Long> {
}
