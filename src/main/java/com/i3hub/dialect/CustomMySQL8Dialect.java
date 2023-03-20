package com.i3hub.dialect;

import com.vladmihalcea.hibernate.type.json.JsonStringType;
import org.hibernate.dialect.MySQL8Dialect;

import java.sql.Types;

public class CustomMySQL8Dialect extends MySQL8Dialect {

    public CustomMySQL8Dialect() {
        super();
        this.registerColumnType(Types.OTHER, JsonStringType.class.getName());
        this.registerHibernateType(
                Types.OTHER, JsonStringType.class.getName()
        );
    }
}
