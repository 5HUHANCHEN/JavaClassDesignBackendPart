package cn.edu.sdu.java.server.repositorys;

import cn.edu.sdu.java.server.models.StatisticsDay;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface StatisticsDayRepository extends JpaRepository<StatisticsDay, String> {
    @Query("SELECT s FROM StatisticsDay s WHERE s.day >= ?1 AND s.day <= ?2 ORDER BY s.day")
    List<StatisticsDay> findListByDay(String startDay, String endDay);  
}
