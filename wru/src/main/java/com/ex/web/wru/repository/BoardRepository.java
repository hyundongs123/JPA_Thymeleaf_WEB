package  com.ex.web.wru.repository;
import com.ex.web.wru.entity.Board;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BoardRepository extends JpaRepository<Board,Integer> {
}