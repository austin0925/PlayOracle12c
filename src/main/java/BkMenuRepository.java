
import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface BkMenuRepository extends CrudRepository<BkMenu, Long> {

	List<BkMenu> findByLastName(String lastName);

}
