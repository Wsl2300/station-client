package com.leoren.client;

import com.leoren.client.Service.AlarmRecordsService;
import com.leoren.client.entity.AlarmRecords;
import com.leoren.client.mapper.AlarmRecordsMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class StationClientApplicationTests {
    @SpringBootTest
    class MybatisPlusTestApplicationTests {
        @Autowired
        private AlarmRecordsMapper alarmRecordsMapper;

        @Test
        public void BackList(){
            System.out.println("sadd");
            List<AlarmRecords> alarmRecords = alarmRecordsMapper.selectList(null);
            System.out.println(alarmRecords);
        }
    }
}
