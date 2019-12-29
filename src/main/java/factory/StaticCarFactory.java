package factory;

import java.util.HashMap;
import java.util.Map;

/**
 * @author rztzz
 */
public class StaticCarFactory {
    private static Map<Integer,Car> cars;
    static{
        cars = new HashMap<>();
        cars.put(1,new Car(1,"奥迪"));
        cars.put(2,new Car(2,"奥拓"));
    }
    public static Car getCar(int id){
        return cars.get(id);
    }
}
