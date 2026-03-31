package future_logistics;

public class Utility {

    public boolean validateTransportId(String transportId) {

        if(transportId.length() != 7) {
            System.out.println("Transport id " + transportId + " is invalid");
            return false;
        }

        if(!transportId.startsWith("RTS")) {
            System.out.println("Transport id " + transportId + " is invalid");
            return false;
        }

        for(int i = 3;i <= 5;i++) {
            char ch = transportId.charAt(i);
            if(ch < '0' || ch > '9') {
                System.out.println("Transport id " + transportId + " is invalid");
                return false;
            }
        }

        char last = transportId.charAt(6);
        if(last < 'A' || last > 'Z') {
            System.out.println("Transport id " + transportId + " is invalid");
            return false;
        }

        return true;
    }

    public GoodsTransport parseDetails(String input) {

        String[] arr = input.split(":");
        String transportId = arr[0];
        String transportDate = arr[1];
        int rating = Integer.parseInt(arr[2]);
        String type = arr[3];

        if(type.equalsIgnoreCase("BrickTransport")) {

            float brickSize = Float.parseFloat(arr[4]);
            int brickQty = Integer.parseInt(arr[5]);
            float brickPrice = Float.parseFloat(arr[6]);

            return new BrickTransport(transportId,transportDate,rating,
                    brickSize,brickQty,brickPrice);
        } else {

            float length = Float.parseFloat(arr[4]);
            float radius = Float.parseFloat(arr[5]);
            String timberType = arr[6];
            float price = Float.parseFloat(arr[7]);

            return new TimberTransport(transportId,transportDate,rating,
                    length,radius,timberType,price);
        }
    }

    public String findObjectType(GoodsTransport gt) {

        if(gt instanceof TimberTransport) {
            return "TimberTransport";
        } else {
            return "BrickTransport";
        }
    }
}
