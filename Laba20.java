interface Transport {
    void deliver();
}

class Truck implements Transport {
    public void deliver() {
        System.out.println("Грузовик доставляет груз по дороге.");
    }
}

class Ship implements Transport {
    public void deliver() {
        System.out.println("Судно доставляет груз по морю.");
    }
}

class Airplane implements Transport {
    public void deliver() {
        System.out.println("Самолет доставляет груз по воздуху.");
    }
}

class LogisticsCompany {
    public static Transport createTransport(String type) {
        switch(type) {
            case "грузовик":
                return new Truck();
            case "судно":
                return new Ship();
            case "самолет":
                return new Airplane();
            default:
                throw new IllegalArgumentException("Неизвестный тип перевозки: " + type);
        }
    }
}

public class Laba20 {
    public static void main(String[] args) {
        Transport truck = LogisticsCompany.createTransport("грузовик");
        truck.deliver();
        
        Transport ship = LogisticsCompany.createTransport("судно");
        ship.deliver();
        
        Transport airplane = LogisticsCompany.createTransport("самолет");
        airplane.deliver();
    }
}
