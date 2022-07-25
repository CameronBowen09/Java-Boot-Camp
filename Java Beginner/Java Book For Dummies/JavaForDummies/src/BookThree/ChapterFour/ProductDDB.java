/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BookThree.ChapterFour;

/**
 *
 * @author User
 */
import java.io.IOException;

/**
 *
 * @author Hassan
 */
public class ProductDDB {

    public static Product getProduct(String code)
            throws ProductDataException {
//        try {
            Product p;
// code that gets the product from a file
// and might throw an IOException
            p = new Product();
            return p;
//        } catch (IOException e) {
//            throw new ProductDataException(
//                    "An IO error occurred.");
//        }
    }

    private static class Product {

        public Product() {
        }
    }
}

//Here’s some code that calls the getProduct method and catches the exception:
//
//try
//{
//Product p = ProductDB.getProduct(productCode);
//}
//catch (ProductDataException e)
//{
//System.out.println(e.getMessage());
//}
