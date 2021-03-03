package src.Office_Hours.Practice_12_09_2020;

public class Pizza {
    public String size;
    public int cheeseTopping, pepperoniTopping;
    public double priceOfPizza, tips, totalPrice;

    public void customizeOrder(String size, int cheeseTopping, int pepperoniTopping, double tips){
        this.size = size;
        this.cheeseTopping = cheeseTopping;
        this.pepperoniTopping = pepperoniTopping;

        priceOfPizza = calcCost();
       // tips = tips/100; //  converting percentage to decimal

        this.tips = tips/100 * priceOfPizza;
        totalPrice = priceOfPizza +  this.tips + (priceOfPizza * 0.08); // including tax

    }

    public double calcCost(){
        double startingPrice = (size.equalsIgnoreCase("small")) ? 10
                        :size.equalsIgnoreCase("medium")? 12 : 14;

        double cheese = 1 * cheeseTopping;
        double pepperoni = 1.5 * pepperoniTopping;

        return startingPrice + cheese+ pepperoni;
    }


    public String toString() {
        return "Pizza{" +
                "size='" + size + '\'' +
                ", cheeseTopping=" + cheeseTopping +
                ", pepperoniTopping=" + pepperoniTopping +
                ", priceOfPizza=" + priceOfPizza +
                ", tips=" + tips +
                ", totalPrice=" + totalPrice +
                '}';
    }


}

/*
1. create a custom class for Pizza that should contain the following:
            variables:
                    size (either small, medium, large)
                    number of cheese topping
                    number of pepperoni topping
                    priceOfPizza
                    tips
                    totalPrice


            methods:
                    customizeOrder(): allows user to set the size and toppings of Pizza

                    calcCost(): returns the price of the pizza

                    toString(): get the full informationa nd total cost of Pizza
            Pizza cost is determined by:
                        Small: $10 + $1.5 per pepperoni topping + 1$ per cheese topping
                        Medium: $12 + $1.5 per pepperoni topping + 1$ per cheese topping
                        Large: $14 + $1.5 per pepperoni topping + 1$ per cheese topping
 */
