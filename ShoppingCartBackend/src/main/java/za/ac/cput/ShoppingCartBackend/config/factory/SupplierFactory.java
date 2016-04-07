package za.ac.cput.ShoppingCartBackend.config.factory;

import za.ac.cput.ShoppingCartBackend.Domain.Item;
import za.ac.cput.ShoppingCartBackend.Domain.Supplier;

import java.util.List;

/**
 * Author       : Braedy Thebus (213039168)
 * Email        : Bthebus2@gmail.com
 * Date Created : 2016-04-03
 */
public class SupplierFactory {
    public static Supplier createSupplier(String supplierName, List<Item> item){
        Supplier supplier = new Supplier.Builder().supplierName(supplierName).item(item).build();
        return supplier;
    }
}
