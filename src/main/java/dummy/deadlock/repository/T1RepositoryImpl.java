package dummy.deadlock.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository("t1Repository")
public class T1RepositoryImpl implements T1Repository{
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    @Transactional
    public int changeValue() {
        jdbcTemplate.update("UPDATE table_1 JOIN table_2 ON table_1.id = table_2.id SET table_1.value =  2");
        return jdbcTemplate.update("UPDATE table_2 JOIN table_1 ON table_1.id = table_2.id SET table_2.value =  2");
    }
}
