package interoperability;

import classes.CustomerJava;

import java.util.List;

/**
 * Created by Mohamed Hassan on 6/4/2017.
 * mhabulazm@gmail.com
 */
public interface CustomerRepo {
    CustomerJava getById(int id);

    List<CustomerJava> getAll();
}
