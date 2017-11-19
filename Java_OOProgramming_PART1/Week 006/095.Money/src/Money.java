
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {
        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    public Money plus(Money added){
        int euros = this.euros + added.euros;
        int cents = this.cents + added.cents;

        return new Money(euros, cents);

    }

    public boolean less(Money compared){
        if (!(euros == compared.euros)){
            if(euros < compared.euros){
                return true;
            }
        } else if (cents < compared.cents){
            return true;
        }
        return false;
    }

    public Money minus(Money decremented){
        int eur = this.euros - decremented.euros;
        int cen = this.cents - decremented.cents;

        if (cen < 0){
            cen += 100;
            eur--;
        }

        if(eur < 0){
            return new Money(0, 0);
        }

        return new Money(eur, cen);

    }

    @Override
    public String toString() {
        String zero = "";

        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }

}
