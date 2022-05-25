package com.zahid.tax.products;

import com.zahid.tax.productfactory.MedicineFactory;
import com.zahid.tax.utils.enums.LocalTaxValues;

public class Medicine extends Item {

    public Medicine() {
        super();
    }

    public Medicine(String name, double price, boolean imported, int quantity) {
        super(name, price, imported, quantity);

    }

    @Override
    public MedicineFactory getFactory() {
        return new MedicineFactory();

    }

    @Override
    public double getTaxValue(String country) {
        if (country.equals("Local")) {
            return LocalTaxValues.MEDICINE_TAX.getTax();
        } else {
            return 0;
        }
    }

}
