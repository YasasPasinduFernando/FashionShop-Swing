/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

import model.CustomerList;

/**
 *
 * @author Yasas Pasindu
 */
public class DBConnection {
    private static DBConnection dbConnection ;
    
    private static CustomerList list;
    
    public DBConnection() {
        list=new CustomerList(100,0.5);
    }

    public static DBConnection getInstance(){
        if (dbConnection==null) {
            dbConnection=new DBConnection();
        }
        return dbConnection;
    }

    public CustomerList getCustomerList() {
        return list;
    }
    }
