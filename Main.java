class TaxCategory {
    public double calculateVAT(double amount) {
        return 0;
    }
}

class Retailer extends TaxCategory {
    @Override
    public double calculateVAT(double amount) {
        return amount * 0.18;
    }
}

class Wholesaler extends TaxCategory {
    @Override
    public double calculateVAT(double amount) {
        return amount * 0.15;
    }
}

class Importer extends TaxCategory {
    @Override
    public double calculateVAT(double amount) {
        return amount * 0.10;
    }
}

public class Main {
    public static void main(String[] args) {
        TaxCategory[] categories = {
            new Retailer(), new Wholesaler(), new Importer()
        };

        double[] amounts = {100000, 200000, 150000};

        for (int i = 0; i < categories.length; i++) {
            double vat = categories[i].calculateVAT(amounts[i]);
            System.out.println(
                categories[i].getClass().getSimpleName() +
                " VAT on " + amounts[i] + " = " + vat
            );
        }
    }
}
