package com.airconditionar.util;

public class DbQuery {
public static final String INSERTQUERY="INSERT INTO AIRCONDITIONAR(name,brand,price,type,id) values(?,?,?,?,?)";
public static final String UPDATEQUERY="UPDATE AIRCONDITIONAR SET PRICE=? WHERE id=? ";
public static final String DELETEQUERY=" FROM AIRCONDITIONAR Where id=?";
 


public static final String  SELECTQUERY="SELECT * FROM AIRCONDITIONAR";
public static final String SELECTNAME="SELECT * FROM AIRCONDITIONAR WHERE NAME=?";
public static final String SELECTBRAND="SELECT * FROM AIRCONDITIONAR WHERE BRAND=? ";

public static final String SELECTPRICE="SELECT *FROM AIRCONDITIONAR WHERE PRICE=?";
public static final String SELECTID="SELECT * FROM AIRCONDITIONAR WHERE ID=?";
public static final String SELECTTYPE="SELECT * FROM AIRCONDITIONAR WHERE TYPE=?";

}
