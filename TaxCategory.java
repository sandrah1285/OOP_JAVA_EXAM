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
