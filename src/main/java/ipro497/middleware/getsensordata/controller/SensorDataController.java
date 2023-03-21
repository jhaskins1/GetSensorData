package ipro497.middleware.getsensordata.controller;

import ipro497.middleware.getsensordata.model.SensorData;
import ipro497.middleware.getsensordata.service.SensorDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SensorDataController {

    private SensorDataService sensorDataService;

    @Autowired
    public SensorDataController(SensorDataService sensorDataService) {
        this.sensorDataService = sensorDataService;
    }

    @GetMapping(path = "/getAll")
    public List<SensorData> getAllSensorData(){
        return sensorDataService.getAllSensorData();
    }
}
