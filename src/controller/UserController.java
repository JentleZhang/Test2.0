package controller;

import bean.Customer;
import bean.User;

public class UserController {
    public String query (User user) {
        return user.getUserName();
    }

    public Customer queryOne (Customer customer) {
        return customer;
    }
}
