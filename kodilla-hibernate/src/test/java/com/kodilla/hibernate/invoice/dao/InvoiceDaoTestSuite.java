package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;
import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class InvoiceDaoTestSuite {
   
    @Autowired
    InvoiceDao invoiceDao;
    @Autowired
    ProductDao productDao;
    @Autowired
    ItemDao itemDao;


    @Test
    public void testInvoiceDaoSave() {
        //Given

        Item item1 = new Item(new BigDecimal(1000), 7, new BigDecimal(2000));
        Item item2 = new Item(new BigDecimal(50000), 120, new BigDecimal(7000));
        Product product1 = new Product("Milk");
        item1.setProduct(product1);
        item2.setProduct(product1);
        product1.getItems().add(item1);
        product1.getItems().add(item2);
        Invoice invoice = new Invoice("1/2018");
        item1.setInvoice(invoice);
        item2.setInvoice(invoice);
        invoice.getItems().add(item1);
        invoice.getItems().add(item2);

        //When
        productDao.save(product1);
        invoiceDao.save(invoice);
        itemDao.save(item1);
        itemDao.save(item2);
        int invoiceId = invoice.getId();
        int productId = product1.getId();
        int item1Id = item1.getId();
        int item2Id = item2.getId();

        //Then
        Assert.assertNotEquals(0, invoiceId);
        Assert.assertNotEquals(0, productId);
        Assert.assertNotEquals(0,item1Id);
        Assert.assertNotEquals(0, item2Id);

    }
}
