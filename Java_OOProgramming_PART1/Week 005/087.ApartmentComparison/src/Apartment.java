
public class Apartment {

    private int rooms;
    private int squareMeters;
    private int pricePerSquareMeter;

    public Apartment(int rooms, int squareMeters, int pricePerSquareMeter) {
        this.rooms = rooms;
        this.squareMeters = squareMeters;
        this.pricePerSquareMeter = pricePerSquareMeter;
    }

    public boolean larger(Apartment otherApartment){
        if(squareMeters > otherApartment.squareMeters){
            return true;
        }

        return false;
    }

    public int priceDifference(Apartment otherApartment){
        int thisPrice = squareMeters * pricePerSquareMeter;
        int compPrice = otherApartment.squareMeters * otherApartment.pricePerSquareMeter;

        if (thisPrice > compPrice){
            return thisPrice - compPrice;
        } else {
            return compPrice - thisPrice;
        }
    }

    public boolean moreExpensiveThan(Apartment otherApartment){
        int thisPrice = squareMeters * pricePerSquareMeter;
        int compPrice = otherApartment.squareMeters * otherApartment.pricePerSquareMeter;

        if (thisPrice > compPrice){
            return true;
        }

        return false;
    }
    
}
