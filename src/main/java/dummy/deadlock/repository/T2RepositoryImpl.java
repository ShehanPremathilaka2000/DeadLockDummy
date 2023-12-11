package dummy.deadlock.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository("t2Repository")
public class T2RepositoryImpl implements T2Repository{
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    @Transactional
    public int changeValue() {
        jdbcTemplate.update("UPDATE table_2 JOIN table_1 ON table_1.id = table_2.id SET table_2.value =  1");
        return jdbcTemplate.update("UPDATE table_1 JOIN table_2 ON table_1.id = table_2.id SET table_1.value =  1");
    }
}
