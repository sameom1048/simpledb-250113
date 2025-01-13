package com.ll.simpleDb;

public class Sql {

    private final StringBuilder sqlBuilder;

    public Sql() {
        this.sqlBuilder = new StringBuilder();
    }


    public Sql append(String sqlLine) {
        this.sqlBuilder.append(sqlLine);
        return this;
    }

    public Sql append(String sqlLine, Object... args) {
        this.sqlBuilder.append(sqlLine);
        for (int i = 0; i < args.length; i++) {
            sqlBuilder.append(args[i]);
            if (i < args.length - 1) {
                sqlBuilder.append(",");

            }
        }
        return this;

    }

    public long insert() {
        Long offset = 0L;
        this.sqlBuilder.insert(0, this.sqlBuilder.toString());
        return 1;
    }

    public int update() {
        return 3;
    }
}
