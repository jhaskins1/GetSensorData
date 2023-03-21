package ipro497.middleware.getsensordata.service;

import ipro497.middleware.getsensordata.model.SensorData;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class SensorDataService {

    //CONNECT TO DATABASE

    //SAMPLE TO MAKE SURE ITS WORKING

    public List<SensorData> getAllSensorData() {
        ArrayList temporarySensorDataList = new ArrayList<>();
        SensorData tempData1 = new SensorData("1", 1, "ff", 50.0);
        SensorData tempData2 = new SensorData("2", 2, "ff", 55.0);
        SensorData tempData3 = new SensorData("3", 3, "ff", 44.0);
        SensorData tempData4 = new SensorData("4", 4, "ff", 54.0);
        SensorData tempData5 = new SensorData("5", 5, "ff", 71.0);

        temporarySensorDataList.addAll(Arrays.asList(tempData1, tempData2, tempData3, tempData4, tempData5));

        return temporarySensorDataList;
    }
}
