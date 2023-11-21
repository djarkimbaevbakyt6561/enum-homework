public enum TransportType implements TransportTypeInterface {
    CAR {
        @Override
        public double calculateTravelCost(double distance) {
            return distance * 0.1;
        }
    },
    BUS {
        @Override
        public double calculateTravelCost(double distance) {
            return distance * 0.05;
        }
    },
    TRUCK {
        @Override
        public double calculateTravelCost(double distance) {
            return distance * 0.02;
        }
    };

}
