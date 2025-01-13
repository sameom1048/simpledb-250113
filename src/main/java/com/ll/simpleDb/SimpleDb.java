package com.ll.simpleDb;

public class SimpleDb {
    String localhost;
    String root;
    String password;
    String dbName;

    public SimpleDb(String localhost, String root, String hansung, String simpleDb__test) {
        this.localhost = localhost;
        this.root = root;
        this.password = hansung;
        this.dbName = simpleDb__test;
    }

    public Sql genSql() {
        return new Sql(this);
    }

    public void run(String sql) {

    }
    public void run(String sql, Object... args) {
    }
    public void setDevMode(boolean devMode) {
        if (devMode) {
            System.out.println("devMode is on");
        } else {
            System.out.println("devMode is off");
        }
    }
}
