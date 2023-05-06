package com.leoren.client.controller;

import com.leoren.client.Service.*;
import com.leoren.client.Service.impl.AlarmRecordsServiceImpl;
import com.leoren.client.entity.AlarmRecords;
import com.leoren.client.entity.StationData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class list {

@Autowired
    private AlarmRecordsService alarmRecordsService;
@Autowired
private StationDataService stationDataService;
@RequestMapping("/")
public List<StationData> BackList(){
    List<StationData> list = stationDataService.list();
    return list;
}

}
